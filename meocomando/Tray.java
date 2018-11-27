/*
 * Decompiled with CFR 0_132.
 */
package meocomando;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.SystemTray;
import java.awt.Toolkit;
import java.awt.TrayIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintStream;
import java.net.URL;
import meocomando.Acercade;
import meocomando.ComandoVisual;
import meocomando.Configuracoes;
import meocomando.NovoComando;

public class Tray {
    public Tray() {
        TrayIcon trayIcon = null;
        if (SystemTray.isSupported()) {
            SystemTray tray = SystemTray.getSystemTray();
            URL im = this.getClass().getResource("trayicon.jpg");
            Image image = Toolkit.getDefaultToolkit().getImage(im);
            ActionListener listener = new ActionListener(){

                public void actionPerformed(ActionEvent e) {
                    if (e.toString().contains("Ver Comando")) {
                        Configuracoes.c.setVisible(true);
                    } else if (e.toString().contains("Adicionar")) {
                        NovoComando c = new NovoComando(1);
                        int w = 200;
                        int h = 200;
                        c.setSize(w, h);
                        Dimension screenDim = Toolkit.getDefaultToolkit().getScreenSize();
                        c.setLocation((screenDim.width - w) / 2, (screenDim.height - h) / 2);
                        c.setVisible(true);
                    } else if (e.toString().contains("Sobre")) {
                        Acercade a = new Acercade();
                        int w = 500;
                        int h = 400;
                        a.setSize(w, h);
                        Dimension screenDim = Toolkit.getDefaultToolkit().getScreenSize();
                        a.setLocation((screenDim.width - w) / 2, (screenDim.height - h) / 2);
                        a.setVisible(true);
                    } else if (e.toString().contains("Fechar")) {
                        System.exit(0);
                    }
                }
            };
            PopupMenu popup = new PopupMenu();
            MenuItem defaultItem = new MenuItem();
            defaultItem.addActionListener(listener);
            MenuItem menuItem1 = new MenuItem("Ver Comando");
            menuItem1.addActionListener(listener);
            MenuItem menuItem2 = new MenuItem("Fechar");
            menuItem2.addActionListener(listener);
            MenuItem menuItem3 = new MenuItem("Adicionar");
            menuItem3.addActionListener(listener);
            MenuItem menuItem4 = new MenuItem("Sobre");
            menuItem4.addActionListener(listener);
            popup.add(menuItem1);
            popup.add(menuItem3);
            popup.add(menuItem4);
            popup.add(menuItem2);
            trayIcon = new TrayIcon(image, "Gateway", popup);
            trayIcon.addActionListener(listener);
            try {
                tray.add(trayIcon);
            }
            catch (AWTException e) {
                System.err.println(e);
            }
        }
    }

}

