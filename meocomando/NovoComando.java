/*
 * Decompiled with CFR 0_132.
 */
package meocomando;

import java.awt.Component;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import meocomando.Comando;
import meocomando.ComandoVisual;
import meocomando.Configuracoes;

public class NovoComando
extends JFrame {
    private JButton jButton1;
    private JButton jButton2;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JSeparator jSeparator1;
    private JTextField jTextField1;
    private JTextField jTextField2;

    public NovoComando(int i) {
        this.initComponents();
        if (i == 0) {
            this.jButton2.setEnabled(false);
        }
    }

    private void initComponents() {
        this.jLabel1 = new JLabel();
        this.jLabel2 = new JLabel();
        this.jLabel3 = new JLabel();
        this.jTextField1 = new JTextField();
        this.jTextField2 = new JTextField();
        this.jButton1 = new JButton();
        this.jButton2 = new JButton();
        this.jSeparator1 = new JSeparator();
        this.setDefaultCloseOperation(3);
        this.getContentPane().setLayout(null);
        this.jLabel1.setText("Adicionar aparelho:");
        this.getContentPane().add(this.jLabel1);
        this.jLabel1.setBounds(10, 0, 100, 14);
        this.jLabel2.setText("Nome:");
        this.getContentPane().add(this.jLabel2);
        this.jLabel2.setBounds(10, 40, 34, 14);
        this.jLabel3.setText("IP:");
        this.getContentPane().add(this.jLabel3);
        this.jLabel3.setBounds(10, 70, 14, 14);
        this.jTextField1.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent evt) {
                NovoComando.this.jTextField1ActionPerformed(evt);
            }
        });
        this.getContentPane().add(this.jTextField1);
        this.jTextField1.setBounds(60, 40, 120, 20);
        this.jTextField2.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent evt) {
                NovoComando.this.jTextField2ActionPerformed(evt);
            }
        });
        this.getContentPane().add(this.jTextField2);
        this.jTextField2.setBounds(60, 70, 120, 20);
        this.jButton1.setText("OK");
        this.jButton1.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent evt) {
                NovoComando.this.jButton1ActionPerformed(evt);
            }
        });
        this.getContentPane().add(this.jButton1);
        this.jButton1.setBounds(10, 120, 80, 23);
        this.jButton2.setText("Cancelar");
        this.jButton2.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent evt) {
                NovoComando.this.jButton2ActionPerformed(evt);
            }
        });
        this.getContentPane().add(this.jButton2);
        this.jButton2.setBounds(100, 120, 90, 23);
        this.getContentPane().add(this.jSeparator1);
        this.jSeparator1.setBounds(10, 20, 190, 10);
        this.pack();
    }

    private void jTextField1ActionPerformed(ActionEvent evt) {
    }

    private void jTextField2ActionPerformed(ActionEvent evt) {
    }

    private void jButton2ActionPerformed(ActionEvent evt) {
        this.dispose();
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        Comando novo = new Comando();
        novo.setIp(this.jTextField2.getText());
        novo.setNome(this.jTextField1.getText());
        novo.setPorta(8082);
        Configuracoes.comandos.add(novo);
        Configuracoes.j.addItem(novo.getNome());
        try {
            FileOutputStream out = new FileOutputStream("Config.ini");
            PrintStream p = new PrintStream(out);
            p.println("******Meo Comando Config File******");
            p.println("ncmds:" + Configuracoes.comandos.size());
            for (int i = 0; i < Configuracoes.comandos.size(); ++i) {
                p.println("nome:" + Configuracoes.comandos.get(i).getNome());
                p.println("ip:" + Configuracoes.comandos.get(i).getIp());
                p.println("porta:" + Configuracoes.comandos.get(i).getPorta());
            }
            p.close();
            if (!this.jButton2.isEnabled()) {
                Configuracoes.c.setVisible(true);
            }
            this.dispose();
        }
        catch (Exception e) {
            System.err.println("Error writing to file:\n" + e);
        }
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable(){

            public void run() {
                new NovoComando(0).setVisible(true);
            }
        });
    }

}

