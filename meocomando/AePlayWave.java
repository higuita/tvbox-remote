/*
 * Decompiled with CFR 0_132.
 */
package meocomando;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Control;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.UnsupportedAudioFileException;

public class AePlayWave
extends Thread {
    private String filename;
    private Position curPosition;
    private final int EXTERNAL_BUFFER_SIZE = 524288;

    public AePlayWave(String wavfile) {
        this.filename = wavfile;
        this.curPosition = Position.NORMAL;
    }

    public AePlayWave(String wavfile, Position p) {
        this.filename = wavfile;
        this.curPosition = p;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void run() {
        File soundFile = new File(this.filename);
        if (!soundFile.exists()) {
            System.err.println("Wave file not found: " + this.filename);
            return;
        }
        AudioInputStream audioInputStream = null;
        try {
            audioInputStream = AudioSystem.getAudioInputStream(soundFile);
        }
        catch (UnsupportedAudioFileException e1) {
            e1.printStackTrace();
            return;
        }
        catch (IOException e1) {
            e1.printStackTrace();
            return;
        }
        AudioFormat format = audioInputStream.getFormat();
        SourceDataLine auline = null;
        DataLine.Info info = new DataLine.Info(SourceDataLine.class, format);
        try {
            auline = (SourceDataLine)AudioSystem.getLine(info);
            auline.open(format);
        }
        catch (LineUnavailableException e) {
            e.printStackTrace();
            return;
        }
        catch (Exception e) {
            e.printStackTrace();
            return;
        }
        if (auline.isControlSupported(FloatControl.Type.PAN)) {
            FloatControl pan = (FloatControl)auline.getControl(FloatControl.Type.PAN);
            if (this.curPosition == Position.RIGHT) {
                pan.setValue(1.0f);
            } else if (this.curPosition == Position.LEFT) {
                pan.setValue(-1.0f);
            }
        }
        auline.start();
        int nBytesRead = 0;
        byte[] abData = new byte[524288];
        try {
            while (nBytesRead != -1) {
                nBytesRead = audioInputStream.read(abData, 0, abData.length);
                if (nBytesRead < 0) continue;
                auline.write(abData, 0, nBytesRead);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
            return;
        }
        finally {
            auline.drain();
            auline.close();
        }
    }

    /*
     * This class specifies class file version 49.0 but uses Java 6 signatures.  Assumed Java 6.
     */
    static enum Position {
        LEFT,
        RIGHT,
        NORMAL;
        

        private Position() {
        }
    }

}

