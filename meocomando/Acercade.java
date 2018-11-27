/*
 * Decompiled with CFR 0_132.
 */
package meocomando;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;
import java.net.URL;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.LayoutStyle;
import javax.swing.UIManager;
import javax.swing.border.Border;
import meocomando.BareBonesBrowserLaunch;

public class Acercade
extends JFrame {
    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JLabel jLabel1;
    private JLabel jLabel14;
    private JLabel jLabel15;
    private JScrollPane jScrollPane1;
    private JTextArea jTextArea1;

    public Acercade() {
        this.initComponents();
    }

    private void initComponents() {
        this.jLabel1 = new JLabel();
        this.jScrollPane1 = new JScrollPane();
        this.jTextArea1 = new JTextArea();
        this.jLabel14 = new JLabel();
        this.jButton1 = new JButton();
        this.jButton2 = new JButton();
        this.jLabel15 = new JLabel();
        this.jButton3 = new JButton();
        this.setDefaultCloseOperation(2);
        this.setAlwaysOnTop(true);
        this.setResizable(false);
        this.setUndecorated(true);
        this.addMouseMotionListener(new MouseMotionAdapter(){

            public void mouseMoved(MouseEvent evt) {
                Acercade.this.cnormal(evt);
            }
        });
        this.jLabel1.setFont(new Font("Tahoma", 1, 24));
        this.jLabel1.setHorizontalAlignment(0);
        this.jLabel1.setText("Meo Comando");
        this.jLabel1.addMouseMotionListener(new MouseMotionAdapter(){

            public void mouseMoved(MouseEvent evt) {
                Acercade.this.cnormal(evt);
            }
        });
        this.jTextArea1.setBackground(UIManager.getDefaults().getColor("Button.background"));
        this.jTextArea1.setColumns(20);
        this.jTextArea1.setEditable(false);
        this.jTextArea1.setRows(5);
        this.jTextArea1.setText("\n\nThomson Key Generator, realizado para o uso caseiro e n\u00e3o comercial.\nEste software \u00e9 free para qualquer utilizador.\n\n\n\n\n\n\nver.1.3 build 152\nmade by kangaSoft\n");
        this.jTextArea1.setBorder(BorderFactory.createEtchedBorder());
        this.jTextArea1.addMouseMotionListener(new MouseMotionAdapter(){

            public void mouseMoved(MouseEvent evt) {
                Acercade.this.cnormal(evt);
            }
        });
        this.jScrollPane1.setViewportView(this.jTextArea1);
        this.jLabel14.addMouseListener(new MouseAdapter(){

            public void mousePressed(MouseEvent evt) {
                Acercade.this.jLabel14MousePressed(evt);
            }
        });
        this.jLabel14.addMouseMotionListener(new MouseMotionAdapter(){

            public void mouseMoved(MouseEvent evt) {
                Acercade.this.mao(evt);
            }
        });
        this.jButton1.setText("Mail To");
        this.jButton1.addMouseMotionListener(new MouseMotionAdapter(){

            public void mouseMoved(MouseEvent evt) {
                Acercade.this.mao(evt);
            }
        });
        this.jButton1.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent evt) {
                Acercade.this.jButton1ActionPerformed(evt);
            }
        });
        this.jButton2.setText("Fechar");
        this.jButton2.addMouseMotionListener(new MouseMotionAdapter(){

            public void mouseMoved(MouseEvent evt) {
                Acercade.this.mao(evt);
            }
        });
        this.jButton2.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent evt) {
                Acercade.this.jButton2ActionPerformed(evt);
            }
        });
        this.jLabel15.setIcon(new ImageIcon(this.getClass().getResource("/meocomando/botao/doar.JPG")));
        this.jLabel15.addMouseListener(new MouseAdapter(){

            public void mousePressed(MouseEvent evt) {
                Acercade.this.jLabel15MousePressed(evt);
            }
        });
        this.jLabel15.addMouseMotionListener(new MouseMotionAdapter(){

            public void mouseMoved(MouseEvent evt) {
                Acercade.this.jLabel15MouseMoved(evt);
            }
        });
        this.jButton3.setText("HomePage");
        this.jButton3.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent evt) {
                Acercade.this.jButton3ActionPerformed(evt);
            }
        });
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.jLabel15, -1, 102, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jButton1, -2, 106, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jButton3, -2, 111, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jButton2, -2, 102, -2)).addComponent(this.jLabel1, GroupLayout.Alignment.TRAILING, -1, 437, 32767).addComponent(this.jScrollPane1, -1, 437, 32767)).addContainerGap()).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(0, 213, 32767).addComponent(this.jLabel14).addGap(31, 244, 32767))));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addContainerGap().addComponent(this.jLabel1).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(this.jScrollPane1, -2, 220, -2).addGap(18, 18, 18).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(12, 12, 12).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jButton3, -2, 32, -2).addComponent(this.jButton2, -2, 30, -2).addComponent(this.jButton1, -2, 30, -2))).addGroup(layout.createSequentialGroup().addGap(11, 11, 11).addComponent(this.jLabel15, -2, 34, -2))).addGap(36, 36, 36)).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(277, 277, 277).addComponent(this.jLabel14).addGap(30, 88, 32767))));
        this.pack();
    }

    private void jLabel14MousePressed(MouseEvent evt) {
        BareBonesBrowserLaunch.openURL("https://www.paypal.com/cgi-bin/webscr?cmd=_donations&business=C8UZWNDWTFY7S&lc=PT&item_name=KangaRemote&item_number=comandomeo&currency_code=EUR&bn=PP%2dDonationsBF%3abtn_donateCC_LG%2egif%3aNonHosted");
        this.dispose();
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        BareBonesBrowserLaunch.openURL("mailto:somemailaddress@somedomain.com");
        this.dispose();
    }

    private void jButton2ActionPerformed(ActionEvent evt) {
        this.dispose();
    }

    private void mao(MouseEvent evt) {
        this.setCursor(12);
    }

    private void cnormal(MouseEvent evt) {
        this.setCursor(0);
    }

    private void jLabel15MousePressed(MouseEvent evt) {
        BareBonesBrowserLaunch.openURL("https://www.paypal.com/cgi-bin/webscr?cmd=_donations&business=C8UZWNDWTFY7S&lc=PT&item_name=KangaRemote&item_number=comandomeo&currency_code=EUR&bn=PP%2dDonationsBF%3abtn_donateCC_LG%2egif%3aNonHosted");
        this.dispose();
    }

    private void jButton3ActionPerformed(ActionEvent evt) {
        BareBonesBrowserLaunch.openURL("http://kangasoft.com.sapo.pt/");
        this.dispose();
    }

    private void jLabel15MouseMoved(MouseEvent evt) {
        this.setCursor(12);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable(){

            public void run() {
                new Acercade().setVisible(true);
            }
        });
    }

}

