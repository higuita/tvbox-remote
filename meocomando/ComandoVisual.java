/*
 * Decompiled with CFR 0_132.
 */
package meocomando;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;
import java.net.URL;
import java.util.Vector;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import meocomando.AePlayWave;
import meocomando.Comando;
import meocomando.Configuracoes;
import meocomando.PopUpMenu;
import meocomando.Send;

public class ComandoVisual
extends JFrame {
    public static Send s;
    private JComboBox jComboBox1;
    private JLabel jLabel1;
    private JLabel jLabel10;
    private JLabel jLabel11;
    private JLabel jLabel12;
    private JLabel jLabel13;
    private JLabel jLabel14;
    private JLabel jLabel15;
    private JLabel jLabel16;
    private JLabel jLabel17;
    private JLabel jLabel18;
    private JLabel jLabel19;
    private JLabel jLabel2;
    private JLabel jLabel20;
    private JLabel jLabel21;
    private JLabel jLabel23;
    private JLabel jLabel24;
    private JLabel jLabel25;
    private JLabel jLabel26;
    private JLabel jLabel27;
    private JLabel jLabel28;
    private JLabel jLabel29;
    private JLabel jLabel3;
    private JLabel jLabel30;
    private JLabel jLabel31;
    private JLabel jLabel32;
    private JLabel jLabel33;
    private JLabel jLabel34;
    private JLabel jLabel35;
    private JLabel jLabel36;
    private JLabel jLabel37;
    private JLabel jLabel38;
    private JLabel jLabel39;
    private JLabel jLabel4;
    private JLabel jLabel40;
    private JLabel jLabel42;
    private JLabel jLabel44;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel jLabel9;

    public ComandoVisual() {
        super("MeoComando");
        this.initComponents();
        new PopUpMenu(this.jLabel1);
        this.jLabel18.setVisible(false);
        Configuracoes.j = this.jComboBox1;
        s = new Send();
    }

    private void initComponents() {
        this.jLabel4 = new JLabel();
        this.jLabel5 = new JLabel();
        this.jLabel6 = new JLabel();
        this.jLabel7 = new JLabel();
        this.jLabel12 = new JLabel();
        this.jLabel13 = new JLabel();
        this.jLabel14 = new JLabel();
        this.jLabel15 = new JLabel();
        this.jLabel16 = new JLabel();
        this.jLabel17 = new JLabel();
        this.jLabel8 = new JLabel();
        this.jLabel9 = new JLabel();
        this.jLabel10 = new JLabel();
        this.jLabel11 = new JLabel();
        this.jLabel2 = new JLabel();
        this.jLabel3 = new JLabel();
        this.jLabel19 = new JLabel();
        this.jLabel20 = new JLabel();
        this.jLabel21 = new JLabel();
        this.jLabel23 = new JLabel();
        this.jLabel24 = new JLabel();
        this.jLabel25 = new JLabel();
        this.jLabel26 = new JLabel();
        this.jLabel27 = new JLabel();
        this.jLabel28 = new JLabel();
        this.jLabel30 = new JLabel();
        this.jLabel31 = new JLabel();
        this.jLabel32 = new JLabel();
        this.jLabel33 = new JLabel();
        this.jLabel34 = new JLabel();
        this.jLabel35 = new JLabel();
        this.jLabel36 = new JLabel();
        this.jLabel37 = new JLabel();
        this.jLabel38 = new JLabel();
        this.jLabel39 = new JLabel();
        this.jLabel40 = new JLabel();
        this.jLabel42 = new JLabel();
        this.jLabel29 = new JLabel();
        this.jLabel44 = new JLabel();
        this.jComboBox1 = new JComboBox();
        this.jLabel18 = new JLabel();
        this.jLabel1 = new JLabel();
        this.setResizable(false);
        this.getContentPane().setLayout(null);
        this.jLabel4.addMouseListener(new MouseAdapter(){

            public void mousePressed(MouseEvent evt) {
                ComandoVisual.this.jLabel4MousePressed(evt);
            }

            public void mouseReleased(MouseEvent evt) {
                ComandoVisual.this.semluz(evt);
            }
        });
        this.jLabel4.addMouseMotionListener(new MouseMotionAdapter(){

            public void mouseMoved(MouseEvent evt) {
                ComandoVisual.this.mao(evt);
            }
        });
        this.getContentPane().add(this.jLabel4);
        this.jLabel4.setBounds(70, 180, 30, 30);
        this.jLabel5.addMouseListener(new MouseAdapter(){

            public void mousePressed(MouseEvent evt) {
                ComandoVisual.this.jLabel5MousePressed(evt);
            }

            public void mouseReleased(MouseEvent evt) {
                ComandoVisual.this.semluz(evt);
            }
        });
        this.jLabel5.addMouseMotionListener(new MouseMotionAdapter(){

            public void mouseMoved(MouseEvent evt) {
                ComandoVisual.this.mao(evt);
            }
        });
        this.getContentPane().add(this.jLabel5);
        this.jLabel5.setBounds(130, 60, 30, 20);
        this.jLabel6.addMouseListener(new MouseAdapter(){

            public void mousePressed(MouseEvent evt) {
                ComandoVisual.this.jLabel6MousePressed(evt);
            }

            public void mouseReleased(MouseEvent evt) {
                ComandoVisual.this.semluz(evt);
            }
        });
        this.jLabel6.addMouseMotionListener(new MouseMotionAdapter(){

            public void mouseMoved(MouseEvent evt) {
                ComandoVisual.this.mao(evt);
            }
        });
        this.getContentPane().add(this.jLabel6);
        this.jLabel6.setBounds(20, 90, 30, 20);
        this.jLabel7.addMouseListener(new MouseAdapter(){

            public void mousePressed(MouseEvent evt) {
                ComandoVisual.this.jLabel7MousePressed(evt);
            }

            public void mouseReleased(MouseEvent evt) {
                ComandoVisual.this.semluz(evt);
            }
        });
        this.jLabel7.addMouseMotionListener(new MouseMotionAdapter(){

            public void mouseMoved(MouseEvent evt) {
                ComandoVisual.this.mao(evt);
            }
        });
        this.getContentPane().add(this.jLabel7);
        this.jLabel7.setBounds(70, 90, 30, 20);
        this.jLabel12.addMouseListener(new MouseAdapter(){

            public void mousePressed(MouseEvent evt) {
                ComandoVisual.this.jLabel12MousePressed(evt);
            }

            public void mouseReleased(MouseEvent evt) {
                ComandoVisual.this.semluz(evt);
            }
        });
        this.jLabel12.addMouseMotionListener(new MouseMotionAdapter(){

            public void mouseMoved(MouseEvent evt) {
                ComandoVisual.this.mao(evt);
            }
        });
        this.getContentPane().add(this.jLabel12);
        this.jLabel12.setBounds(130, 90, 30, 20);
        this.jLabel13.addMouseListener(new MouseAdapter(){

            public void mousePressed(MouseEvent evt) {
                ComandoVisual.this.jLabel13MousePressed(evt);
            }

            public void mouseReleased(MouseEvent evt) {
                ComandoVisual.this.semluz(evt);
            }
        });
        this.jLabel13.addMouseMotionListener(new MouseMotionAdapter(){

            public void mouseMoved(MouseEvent evt) {
                ComandoVisual.this.mao(evt);
            }
        });
        this.getContentPane().add(this.jLabel13);
        this.jLabel13.setBounds(20, 120, 30, 20);
        this.jLabel14.addMouseListener(new MouseAdapter(){

            public void mousePressed(MouseEvent evt) {
                ComandoVisual.this.jLabel14MousePressed(evt);
            }

            public void mouseReleased(MouseEvent evt) {
                ComandoVisual.this.semluz(evt);
            }
        });
        this.jLabel14.addMouseMotionListener(new MouseMotionAdapter(){

            public void mouseMoved(MouseEvent evt) {
                ComandoVisual.this.mao(evt);
            }
        });
        this.getContentPane().add(this.jLabel14);
        this.jLabel14.setBounds(70, 120, 30, 20);
        this.jLabel15.addMouseListener(new MouseAdapter(){

            public void mousePressed(MouseEvent evt) {
                ComandoVisual.this.jLabel15MousePressed(evt);
            }

            public void mouseReleased(MouseEvent evt) {
                ComandoVisual.this.semluz(evt);
            }
        });
        this.jLabel15.addMouseMotionListener(new MouseMotionAdapter(){

            public void mouseMoved(MouseEvent evt) {
                ComandoVisual.this.mao(evt);
            }
        });
        this.getContentPane().add(this.jLabel15);
        this.jLabel15.setBounds(130, 120, 30, 20);
        this.jLabel16.addMouseListener(new MouseAdapter(){

            public void mouseReleased(MouseEvent evt) {
                ComandoVisual.this.semluz(evt);
            }
        });
        this.jLabel16.addMouseMotionListener(new MouseMotionAdapter(){

            public void mouseMoved(MouseEvent evt) {
                ComandoVisual.this.mao(evt);
            }
        });
        this.getContentPane().add(this.jLabel16);
        this.jLabel16.setBounds(20, 150, 30, 20);
        this.jLabel17.addMouseListener(new MouseAdapter(){

            public void mousePressed(MouseEvent evt) {
                ComandoVisual.this.jLabel17MousePressed(evt);
            }

            public void mouseReleased(MouseEvent evt) {
                ComandoVisual.this.semluz(evt);
            }
        });
        this.jLabel17.addMouseMotionListener(new MouseMotionAdapter(){

            public void mouseMoved(MouseEvent evt) {
                ComandoVisual.this.mao(evt);
            }
        });
        this.getContentPane().add(this.jLabel17);
        this.jLabel17.setBounds(70, 150, 30, 20);
        this.jLabel8.addMouseListener(new MouseAdapter(){

            public void mouseReleased(MouseEvent evt) {
                ComandoVisual.this.semluz(evt);
            }
        });
        this.jLabel8.addMouseMotionListener(new MouseMotionAdapter(){

            public void mouseMoved(MouseEvent evt) {
                ComandoVisual.this.mao(evt);
            }
        });
        this.getContentPane().add(this.jLabel8);
        this.jLabel8.setBounds(130, 150, 30, 20);
        this.jLabel9.addMouseListener(new MouseAdapter(){

            public void mousePressed(MouseEvent evt) {
                ComandoVisual.this.jLabel9MousePressed(evt);
            }

            public void mouseReleased(MouseEvent evt) {
                ComandoVisual.this.jLabel9MouseReleased(evt);
            }
        });
        this.jLabel9.addMouseMotionListener(new MouseMotionAdapter(){

            public void mouseMoved(MouseEvent evt) {
                ComandoVisual.this.mao(evt);
            }
        });
        this.getContentPane().add(this.jLabel9);
        this.jLabel9.setBounds(20, 190, 30, 20);
        this.jLabel10.addMouseListener(new MouseAdapter(){

            public void mousePressed(MouseEvent evt) {
                ComandoVisual.this.jLabel10MousePressed(evt);
            }

            public void mouseReleased(MouseEvent evt) {
                ComandoVisual.this.semluz(evt);
            }
        });
        this.jLabel10.addMouseMotionListener(new MouseMotionAdapter(){

            public void mouseMoved(MouseEvent evt) {
                ComandoVisual.this.mao(evt);
            }
        });
        this.getContentPane().add(this.jLabel10);
        this.jLabel10.setBounds(130, 190, 30, 20);
        this.jLabel11.addMouseListener(new MouseAdapter(){

            public void mousePressed(MouseEvent evt) {
                ComandoVisual.this.jLabel11MousePressed(evt);
            }

            public void mouseReleased(MouseEvent evt) {
                ComandoVisual.this.semluz(evt);
            }
        });
        this.jLabel11.addMouseMotionListener(new MouseMotionAdapter(){

            public void mouseMoved(MouseEvent evt) {
                ComandoVisual.this.mao(evt);
            }
        });
        this.getContentPane().add(this.jLabel11);
        this.jLabel11.setBounds(20, 270, 30, 20);
        this.jLabel2.addMouseListener(new MouseAdapter(){

            public void mousePressed(MouseEvent evt) {
                ComandoVisual.this.jLabel2MousePressed(evt);
            }

            public void mouseReleased(MouseEvent evt) {
                ComandoVisual.this.jLabel2MouseReleased(evt);
            }
        });
        this.jLabel2.addMouseMotionListener(new MouseMotionAdapter(){

            public void mouseMoved(MouseEvent evt) {
                ComandoVisual.this.mao(evt);
            }
        });
        this.getContentPane().add(this.jLabel2);
        this.jLabel2.setBounds(130, 20, 30, 30);
        this.jLabel3.addMouseListener(new MouseAdapter(){

            public void mousePressed(MouseEvent evt) {
                ComandoVisual.this.jLabel3MousePressed(evt);
            }

            public void mouseReleased(MouseEvent evt) {
                ComandoVisual.this.semluz(evt);
            }
        });
        this.jLabel3.addMouseMotionListener(new MouseMotionAdapter(){

            public void mouseMoved(MouseEvent evt) {
                ComandoVisual.this.mao(evt);
            }
        });
        this.getContentPane().add(this.jLabel3);
        this.jLabel3.setBounds(70, 50, 30, 30);
        this.jLabel19.addMouseListener(new MouseAdapter(){

            public void mousePressed(MouseEvent evt) {
                ComandoVisual.this.jLabel19MousePressed(evt);
            }

            public void mouseReleased(MouseEvent evt) {
                ComandoVisual.this.semluz(evt);
            }
        });
        this.jLabel19.addMouseMotionListener(new MouseMotionAdapter(){

            public void mouseMoved(MouseEvent evt) {
                ComandoVisual.this.mao(evt);
            }
        });
        this.getContentPane().add(this.jLabel19);
        this.jLabel19.setBounds(20, 220, 30, 30);
        this.jLabel20.addMouseListener(new MouseAdapter(){

            public void mousePressed(MouseEvent evt) {
                ComandoVisual.this.jLabel20MousePressed(evt);
            }

            public void mouseReleased(MouseEvent evt) {
                ComandoVisual.this.semluz(evt);
            }
        });
        this.jLabel20.addMouseMotionListener(new MouseMotionAdapter(){

            public void mouseMoved(MouseEvent evt) {
                ComandoVisual.this.mao(evt);
            }
        });
        this.getContentPane().add(this.jLabel20);
        this.jLabel20.setBounds(130, 220, 30, 30);
        this.jLabel21.addMouseListener(new MouseAdapter(){

            public void mousePressed(MouseEvent evt) {
                ComandoVisual.this.jLabel21MousePressed(evt);
            }

            public void mouseReleased(MouseEvent evt) {
                ComandoVisual.this.semluz(evt);
            }
        });
        this.jLabel21.addMouseMotionListener(new MouseMotionAdapter(){

            public void mouseMoved(MouseEvent evt) {
                ComandoVisual.this.mao(evt);
            }
        });
        this.getContentPane().add(this.jLabel21);
        this.jLabel21.setBounds(70, 260, 30, 20);
        this.jLabel23.addMouseListener(new MouseAdapter(){

            public void mousePressed(MouseEvent evt) {
                ComandoVisual.this.jLabel23MousePressed(evt);
            }

            public void mouseReleased(MouseEvent evt) {
                ComandoVisual.this.semluz(evt);
            }
        });
        this.jLabel23.addMouseMotionListener(new MouseMotionAdapter(){

            public void mouseMoved(MouseEvent evt) {
                ComandoVisual.this.mao(evt);
            }
        });
        this.getContentPane().add(this.jLabel23);
        this.jLabel23.setBounds(130, 260, 30, 30);
        this.jLabel24.addMouseListener(new MouseAdapter(){

            public void mousePressed(MouseEvent evt) {
                ComandoVisual.this.jLabel24MousePressed(evt);
            }

            public void mouseReleased(MouseEvent evt) {
                ComandoVisual.this.semluz(evt);
            }
        });
        this.jLabel24.addMouseMotionListener(new MouseMotionAdapter(){

            public void mouseMoved(MouseEvent evt) {
                ComandoVisual.this.mao(evt);
            }
        });
        this.getContentPane().add(this.jLabel24);
        this.jLabel24.setBounds(60, 290, 60, 20);
        this.jLabel25.addMouseListener(new MouseAdapter(){

            public void mousePressed(MouseEvent evt) {
                ComandoVisual.this.jLabel25MousePressed(evt);
            }

            public void mouseReleased(MouseEvent evt) {
                ComandoVisual.this.semluz(evt);
            }
        });
        this.jLabel25.addMouseMotionListener(new MouseMotionAdapter(){

            public void mouseMoved(MouseEvent evt) {
                ComandoVisual.this.mao(evt);
            }
        });
        this.getContentPane().add(this.jLabel25);
        this.jLabel25.setBounds(10, 310, 30, 30);
        this.jLabel26.addMouseListener(new MouseAdapter(){

            public void mousePressed(MouseEvent evt) {
                ComandoVisual.this.jLabel26MousePressed(evt);
            }

            public void mouseReleased(MouseEvent evt) {
                ComandoVisual.this.semluz(evt);
            }
        });
        this.jLabel26.addMouseMotionListener(new MouseMotionAdapter(){

            public void mouseMoved(MouseEvent evt) {
                ComandoVisual.this.mao(evt);
            }
        });
        this.getContentPane().add(this.jLabel26);
        this.jLabel26.setBounds(50, 320, 30, 10);
        this.jLabel27.addMouseListener(new MouseAdapter(){

            public void mousePressed(MouseEvent evt) {
                ComandoVisual.this.jLabel27MousePressed(evt);
            }

            public void mouseReleased(MouseEvent evt) {
                ComandoVisual.this.semluz(evt);
            }
        });
        this.jLabel27.addMouseMotionListener(new MouseMotionAdapter(){

            public void mouseMoved(MouseEvent evt) {
                ComandoVisual.this.mao(evt);
            }
        });
        this.getContentPane().add(this.jLabel27);
        this.jLabel27.setBounds(90, 320, 30, 10);
        this.jLabel28.addMouseListener(new MouseAdapter(){

            public void mousePressed(MouseEvent evt) {
                ComandoVisual.this.jLabel28MousePressed(evt);
            }

            public void mouseReleased(MouseEvent evt) {
                ComandoVisual.this.semluz(evt);
            }
        });
        this.jLabel28.addMouseMotionListener(new MouseMotionAdapter(){

            public void mouseMoved(MouseEvent evt) {
                ComandoVisual.this.mao(evt);
            }
        });
        this.getContentPane().add(this.jLabel28);
        this.jLabel28.setBounds(130, 310, 30, 30);
        this.jLabel30.addMouseListener(new MouseAdapter(){

            public void mousePressed(MouseEvent evt) {
                ComandoVisual.this.jLabel30MousePressed(evt);
            }

            public void mouseReleased(MouseEvent evt) {
                ComandoVisual.this.semluz(evt);
            }
        });
        this.jLabel30.addMouseMotionListener(new MouseMotionAdapter(){

            public void mouseMoved(MouseEvent evt) {
                ComandoVisual.this.mao(evt);
            }
        });
        this.getContentPane().add(this.jLabel30);
        this.jLabel30.setBounds(20, 350, 30, 20);
        this.jLabel31.addMouseListener(new MouseAdapter(){

            public void mousePressed(MouseEvent evt) {
                ComandoVisual.this.jLabel31MousePressed(evt);
            }

            public void mouseReleased(MouseEvent evt) {
                ComandoVisual.this.semluz(evt);
            }
        });
        this.jLabel31.addMouseMotionListener(new MouseMotionAdapter(){

            public void mouseMoved(MouseEvent evt) {
                ComandoVisual.this.mao(evt);
            }
        });
        this.getContentPane().add(this.jLabel31);
        this.jLabel31.setBounds(70, 350, 30, 20);
        this.jLabel32.addMouseListener(new MouseAdapter(){

            public void mousePressed(MouseEvent evt) {
                ComandoVisual.this.jLabel32MousePressed(evt);
            }

            public void mouseReleased(MouseEvent evt) {
                ComandoVisual.this.semluz(evt);
            }
        });
        this.jLabel32.addMouseMotionListener(new MouseMotionAdapter(){

            public void mouseMoved(MouseEvent evt) {
                ComandoVisual.this.mao(evt);
            }
        });
        this.getContentPane().add(this.jLabel32);
        this.jLabel32.setBounds(130, 350, 30, 20);
        this.jLabel33.addMouseListener(new MouseAdapter(){

            public void mousePressed(MouseEvent evt) {
                ComandoVisual.this.jLabel33MousePressed(evt);
            }

            public void mouseReleased(MouseEvent evt) {
                ComandoVisual.this.semluz(evt);
            }
        });
        this.jLabel33.addMouseMotionListener(new MouseMotionAdapter(){

            public void mouseMoved(MouseEvent evt) {
                ComandoVisual.this.mao(evt);
            }
        });
        this.getContentPane().add(this.jLabel33);
        this.jLabel33.setBounds(20, 380, 30, 20);
        this.jLabel34.addMouseListener(new MouseAdapter(){

            public void mousePressed(MouseEvent evt) {
                ComandoVisual.this.jLabel34MousePressed(evt);
            }

            public void mouseReleased(MouseEvent evt) {
                ComandoVisual.this.semluz(evt);
            }
        });
        this.jLabel34.addMouseMotionListener(new MouseMotionAdapter(){

            public void mouseMoved(MouseEvent evt) {
                ComandoVisual.this.mao(evt);
            }
        });
        this.getContentPane().add(this.jLabel34);
        this.jLabel34.setBounds(70, 380, 30, 20);
        this.jLabel35.addMouseListener(new MouseAdapter(){

            public void mousePressed(MouseEvent evt) {
                ComandoVisual.this.jLabel35MousePressed(evt);
            }

            public void mouseReleased(MouseEvent evt) {
                ComandoVisual.this.semluz(evt);
            }
        });
        this.jLabel35.addMouseMotionListener(new MouseMotionAdapter(){

            public void mouseMoved(MouseEvent evt) {
                ComandoVisual.this.mao(evt);
            }
        });
        this.getContentPane().add(this.jLabel35);
        this.jLabel35.setBounds(130, 380, 30, 20);
        this.jLabel36.addMouseListener(new MouseAdapter(){

            public void mousePressed(MouseEvent evt) {
                ComandoVisual.this.jLabel36MousePressed(evt);
            }

            public void mouseReleased(MouseEvent evt) {
                ComandoVisual.this.semluz(evt);
            }
        });
        this.jLabel36.addMouseMotionListener(new MouseMotionAdapter(){

            public void mouseMoved(MouseEvent evt) {
                ComandoVisual.this.mao(evt);
            }
        });
        this.getContentPane().add(this.jLabel36);
        this.jLabel36.setBounds(10, 420, 30, 20);
        this.jLabel37.addMouseListener(new MouseAdapter(){

            public void mousePressed(MouseEvent evt) {
                ComandoVisual.this.jLabel37MousePressed(evt);
            }

            public void mouseReleased(MouseEvent evt) {
                ComandoVisual.this.semluz(evt);
            }
        });
        this.jLabel37.addMouseMotionListener(new MouseMotionAdapter(){

            public void mouseMoved(MouseEvent evt) {
                ComandoVisual.this.mao(evt);
            }
        });
        this.getContentPane().add(this.jLabel37);
        this.jLabel37.setBounds(50, 420, 30, 20);
        this.jLabel38.addMouseListener(new MouseAdapter(){

            public void mousePressed(MouseEvent evt) {
                ComandoVisual.this.jLabel38MousePressed(evt);
            }

            public void mouseReleased(MouseEvent evt) {
                ComandoVisual.this.semluz(evt);
            }
        });
        this.jLabel38.addMouseMotionListener(new MouseMotionAdapter(){

            public void mouseMoved(MouseEvent evt) {
                ComandoVisual.this.mao(evt);
            }
        });
        this.getContentPane().add(this.jLabel38);
        this.jLabel38.setBounds(90, 420, 30, 20);
        this.jLabel39.addMouseListener(new MouseAdapter(){

            public void mousePressed(MouseEvent evt) {
                ComandoVisual.this.jLabel39MousePressed(evt);
            }

            public void mouseReleased(MouseEvent evt) {
                ComandoVisual.this.semluz(evt);
            }
        });
        this.jLabel39.addMouseMotionListener(new MouseMotionAdapter(){

            public void mouseMoved(MouseEvent evt) {
                ComandoVisual.this.mao(evt);
            }
        });
        this.getContentPane().add(this.jLabel39);
        this.jLabel39.setBounds(130, 410, 30, 30);
        this.jLabel40.addMouseListener(new MouseAdapter(){

            public void mousePressed(MouseEvent evt) {
                ComandoVisual.this.jLabel40MousePressed(evt);
            }

            public void mouseReleased(MouseEvent evt) {
                ComandoVisual.this.semluz(evt);
            }
        });
        this.jLabel40.addMouseMotionListener(new MouseMotionAdapter(){

            public void mouseMoved(MouseEvent evt) {
                ComandoVisual.this.mao(evt);
            }
        });
        this.getContentPane().add(this.jLabel40);
        this.jLabel40.setBounds(10, 470, 30, 30);
        this.jLabel42.addMouseListener(new MouseAdapter(){

            public void mousePressed(MouseEvent evt) {
                ComandoVisual.this.jLabel42MousePressed(evt);
            }

            public void mouseReleased(MouseEvent evt) {
                ComandoVisual.this.semluz(evt);
            }
        });
        this.jLabel42.addMouseMotionListener(new MouseMotionAdapter(){

            public void mouseMoved(MouseEvent evt) {
                ComandoVisual.this.mao(evt);
            }
        });
        this.getContentPane().add(this.jLabel42);
        this.jLabel42.setBounds(90, 470, 30, 30);
        this.jLabel29.addMouseListener(new MouseAdapter(){

            public void mousePressed(MouseEvent evt) {
                ComandoVisual.this.jLabel29MousePressed(evt);
            }

            public void mouseReleased(MouseEvent evt) {
                ComandoVisual.this.semluz(evt);
            }
        });
        this.jLabel29.addMouseMotionListener(new MouseMotionAdapter(){

            public void mouseMoved(MouseEvent evt) {
                ComandoVisual.this.mao(evt);
            }
        });
        this.getContentPane().add(this.jLabel29);
        this.jLabel29.setBounds(70, 220, 30, 30);
        this.jLabel44.addMouseListener(new MouseAdapter(){

            public void mousePressed(MouseEvent evt) {
                ComandoVisual.this.jLabel44MousePressed(evt);
            }

            public void mouseReleased(MouseEvent evt) {
                ComandoVisual.this.semluz(evt);
            }
        });
        this.jLabel44.addMouseMotionListener(new MouseMotionAdapter(){

            public void mouseMoved(MouseEvent evt) {
                ComandoVisual.this.mao(evt);
            }
        });
        this.getContentPane().add(this.jLabel44);
        this.jLabel44.setBounds(20, 50, 30, 30);
        this.jComboBox1.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent evt) {
                ComandoVisual.this.jComboBox1ActionPerformed(evt);
            }
        });
        this.getContentPane().add(this.jComboBox1);
        this.jComboBox1.setBounds(20, 510, 140, 20);
        this.jLabel18.setBackground(new Color(51, 153, 0));
        this.jLabel18.setForeground(new Color(0, 204, 51));
        this.jLabel18.setIcon(new ImageIcon(this.getClass().getResource("/meocomando/Imagens/luz.JPG")));
        this.jLabel18.setFocusable(false);
        this.jLabel18.setMaximumSize(new Dimension(15, 15));
        this.jLabel18.setMinimumSize(new Dimension(15, 15));
        this.getContentPane().add(this.jLabel18);
        this.jLabel18.setBounds(43, 33, 5, 5);
        this.jLabel1.setIcon(new ImageIcon(this.getClass().getResource("/meocomando/Imagens/comando.jpg")));
        this.jLabel1.addMouseMotionListener(new MouseMotionAdapter(){

            public void mouseMoved(MouseEvent evt) {
                ComandoVisual.this.cnormal(evt);
            }
        });
        this.getContentPane().add(this.jLabel1);
        this.jLabel1.setBounds(0, 0, 172, 650);
        this.pack();
    }

    private void jComboBox1ActionPerformed(ActionEvent evt) {
        Configuracoes.ip = Configuracoes.comandos.get(this.jComboBox1.getSelectedIndex()).getIp();
        Configuracoes.nome = Configuracoes.comandos.get(this.jComboBox1.getSelectedIndex()).getNome();
        Configuracoes.porta = Configuracoes.comandos.get(this.jComboBox1.getSelectedIndex()).getPorta();
    }

    private void jLabel2MousePressed(MouseEvent evt) {
        s.enviaKey(233);
        new AePlayWave("click.wav").start();
        this.jLabel18.setVisible(true);
    }

    private void jLabel2MouseReleased(MouseEvent evt) {
        this.jLabel18.setVisible(false);
    }

    private void mao(MouseEvent evt) {
        this.setCursor(12);
    }

    private void cnormal(MouseEvent evt) {
        this.setCursor(0);
    }

    private void jLabel9MousePressed(MouseEvent evt) {
        s.enviaKey(175);
        new AePlayWave("click.wav").start();
        this.jLabel18.setVisible(true);
    }

    private void jLabel9MouseReleased(MouseEvent evt) {
        this.jLabel18.setVisible(false);
    }

    private void jLabel44MousePressed(MouseEvent evt) {
        s.enviaKey(49);
        new AePlayWave("click.wav").start();
        this.jLabel18.setVisible(true);
    }

    private void jLabel3MousePressed(MouseEvent evt) {
        s.enviaKey(50);
        new AePlayWave("click.wav").start();
        this.jLabel18.setVisible(true);
    }

    private void jLabel5MousePressed(MouseEvent evt) {
        s.enviaKey(51);
        new AePlayWave("click.wav").start();
        this.jLabel18.setVisible(true);
    }

    private void jLabel6MousePressed(MouseEvent evt) {
        s.enviaKey(52);
        new AePlayWave("click.wav").start();
        this.jLabel18.setVisible(true);
    }

    private void jLabel7MousePressed(MouseEvent evt) {
        s.enviaKey(53);
        new AePlayWave("click.wav").start();
        this.jLabel18.setVisible(true);
    }

    private void jLabel12MousePressed(MouseEvent evt) {
        s.enviaKey(54);
        new AePlayWave("click.wav").start();
        this.jLabel18.setVisible(true);
    }

    private void jLabel13MousePressed(MouseEvent evt) {
        s.enviaKey(55);
        new AePlayWave("click.wav").start();
        this.jLabel18.setVisible(true);
    }

    private void jLabel14MousePressed(MouseEvent evt) {
        s.enviaKey(56);
        new AePlayWave("click.wav").start();
        this.jLabel18.setVisible(true);
    }

    private void jLabel15MousePressed(MouseEvent evt) {
        s.enviaKey(57);
        new AePlayWave("click.wav").start();
        this.jLabel18.setVisible(true);
    }

    private void jLabel17MousePressed(MouseEvent evt) {
        s.enviaKey(48);
        new AePlayWave("click.wav").start();
        this.jLabel18.setVisible(true);
    }

    private void jLabel11MousePressed(MouseEvent evt) {
        s.enviaKey(174);
        new AePlayWave("click.wav").start();
        this.jLabel18.setVisible(true);
    }

    private void jLabel10MousePressed(MouseEvent evt) {
        s.enviaKey(33);
        new AePlayWave("click.wav").start();
        this.jLabel18.setVisible(true);
    }

    private void jLabel23MousePressed(MouseEvent evt) {
        s.enviaKey(34);
        new AePlayWave("click.wav").start();
        this.jLabel18.setVisible(true);
    }

    private void jLabel19MousePressed(MouseEvent evt) {
        s.enviaKey(37);
        new AePlayWave("click.wav").start();
        this.jLabel18.setVisible(true);
    }

    private void jLabel4MousePressed(MouseEvent evt) {
        s.enviaKey(38);
        new AePlayWave("click.wav").start();
        this.jLabel18.setVisible(true);
    }

    private void jLabel20MousePressed(MouseEvent evt) {
        s.enviaKey(39);
        new AePlayWave("click.wav").start();
        this.jLabel18.setVisible(true);
    }

    private void jLabel21MousePressed(MouseEvent evt) {
        s.enviaKey(40);
        new AePlayWave("click.wav").start();
        this.jLabel18.setVisible(true);
    }

    private void jLabel29MousePressed(MouseEvent evt) {
        s.enviaKey(13);
        new AePlayWave("click.wav").start();
        this.jLabel18.setVisible(true);
    }

    private void jLabel24MousePressed(MouseEvent evt) {
        s.enviaKey(36);
        new AePlayWave("click.wav").start();
        this.jLabel18.setVisible(true);
    }

    private void jLabel25MousePressed(MouseEvent evt) {
        s.enviaKey(8);
        new AePlayWave("click.wav").start();
        this.jLabel18.setVisible(true);
    }

    private void jLabel26MousePressed(MouseEvent evt) {
        s.enviaKey(27);
        new AePlayWave("click.wav").start();
        this.jLabel18.setVisible(true);
    }

    private void jLabel27MousePressed(MouseEvent evt) {
        s.enviaKey(112);
        new AePlayWave("click.wav").start();
        this.jLabel18.setVisible(true);
    }

    private void jLabel28MousePressed(MouseEvent evt) {
        s.enviaKey(114);
        new AePlayWave("click.wav").start();
        this.jLabel18.setVisible(true);
    }

    private void jLabel30MousePressed(MouseEvent evt) {
        s.enviaKey(159);
        new AePlayWave("click.wav").start();
        this.jLabel18.setVisible(true);
    }

    private void jLabel31MousePressed(MouseEvent evt) {
        s.enviaKey(156);
        new AePlayWave("click.wav").start();
        this.jLabel18.setVisible(true);
    }

    private void jLabel32MousePressed(MouseEvent evt) {
        s.enviaKey(115);
        new AePlayWave("click.wav").start();
        this.jLabel18.setVisible(true);
    }

    private void jLabel33MousePressed(MouseEvent evt) {
        s.enviaKey(123);
        new AePlayWave("click.wav").start();
        this.jLabel18.setVisible(true);
    }

    private void jLabel34MousePressed(MouseEvent evt) {
        s.enviaKey(119);
        new AePlayWave("click.wav").start();
        this.jLabel18.setVisible(true);
    }

    private void jLabel35MousePressed(MouseEvent evt) {
        s.enviaKey(225);
        new AePlayWave("click.wav").start();
        this.jLabel18.setVisible(true);
    }

    private void jLabel36MousePressed(MouseEvent evt) {
        s.enviaKey(117);
        new AePlayWave("click.wav").start();
        this.jLabel18.setVisible(true);
    }

    private void jLabel37MousePressed(MouseEvent evt) {
        s.enviaKey(118);
        new AePlayWave("click.wav").start();
        this.jLabel18.setVisible(true);
    }

    private void jLabel38MousePressed(MouseEvent evt) {
        s.enviaKey(121);
        new AePlayWave("click.wav").start();
        this.jLabel18.setVisible(true);
    }

    private void jLabel39MousePressed(MouseEvent evt) {
        s.enviaKey(122);
        new AePlayWave("click.wav").start();
        this.jLabel18.setVisible(true);
    }

    private void jLabel40MousePressed(MouseEvent evt) {
        s.enviaKey(173);
        new AePlayWave("click.wav").start();
        this.jLabel18.setVisible(true);
    }

    private void jLabel42MousePressed(MouseEvent evt) {
        s.enviaKey(111);
        new AePlayWave("click.wav").start();
        this.jLabel18.setVisible(true);
    }

    private void semluz(MouseEvent evt) {
        this.jLabel18.setVisible(false);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable(){

            public void run() {
                new ComandoVisual().setVisible(true);
            }
        });
    }

}

