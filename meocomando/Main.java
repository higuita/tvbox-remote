/*
 * Decompiled with CFR 0_132.
 */
package meocomando;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.Reader;
import java.util.Vector;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import meocomando.Comando;
import meocomando.ComandoVisual;
import meocomando.Configuracoes;
import meocomando.NovoComando;
import meocomando.Tray;

public class Main {
    public static void main(String[] args) {
        ComandoVisual c;
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch (Exception e) {
            // empty catch block
        }
        Configuracoes.c = c = new ComandoVisual();
        int w = 180;
        int h = 680;
        c.setSize(w, h);
        Dimension screenDim = Toolkit.getDefaultToolkit().getScreenSize();
        c.setLocation((screenDim.width - w) / 2, (screenDim.height - h) / 2);
        Main.configs();
        new Tray();
    }

    private static void configs() {
        try {
            File conf = new File("Config.ini");
            BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(conf)));
            String linha = in.readLine();
            if (linha.equals("******Meo Comando Config File******")) {
                linha = in.readLine();
                int i = linha.indexOf(":");
                if (i != -1) {
                    linha = linha.substring(i + 1, linha.length());
                    Configuracoes.ncmd = Integer.parseInt(linha);
                    int contcmd = 0;
                    int cont = 0;
                    while (contcmd < Configuracoes.ncmd && Configuracoes.ncmd != 0) {
                        ++contcmd;
                        Comando c = new Comando();
                        block8 : for (cont = 0; cont < 3; ++cont) {
                            linha = in.readLine();
                            i = linha.indexOf(":");
                            if (i == -1) continue;
                            linha = linha.substring(i + 1, linha.length());
                            switch (cont) {
                                case 0: {
                                    c.setNome(linha);
                                    System.out.println("nome " + linha);
                                    continue block8;
                                }
                                case 1: {
                                    c.setIp(linha);
                                    System.out.println("ip " + linha);
                                    continue block8;
                                }
                                case 2: {
                                    c.setPorta(Integer.parseInt(linha));
                                    System.out.println("porta " + linha);
                                    Configuracoes.comandos.add(c);
                                    Configuracoes.j.addItem(c.getNome());
                                }
                            }
                        }
                    }
                }
                in.close();
                Configuracoes.c.setVisible(true);
            }
        }
        catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Ficheiro de Configuracoes n\u00e3o encontrado, ter\u00e1 de efectuar as Configuracoes antes de iniciar");
            NovoComando c = new NovoComando(0);
            int w = 200;
            int h = 200;
            c.setSize(w, h);
            Dimension screenDim = Toolkit.getDefaultToolkit().getScreenSize();
            c.setLocation((screenDim.width - w) / 2, (screenDim.height - h) / 2);
            c.setVisible(true);
        }
    }
}

