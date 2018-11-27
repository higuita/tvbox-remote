/*
 * Decompiled with CFR 0_132.
 */
package meocomando;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import meocomando.Acercade;
import meocomando.BareBonesBrowserLaunch;
import meocomando.ComandoVisual;
import meocomando.Send;

public class PopUpMenu {
    JPopupMenu Pmenu = new JPopupMenu();
    JMenuItem menuItem = new JMenuItem("Procurar");

    public PopUpMenu(JLabel j) {
        this.Pmenu.add(this.menuItem);
        this.menuItem.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e) {
                if (e.toString().contains("Procurar")) {
                    ComandoVisual.s.enviaKey(106);
                }
            }
        });
        this.menuItem = new JMenuItem("Favoritos");
        this.Pmenu.add(this.menuItem);
        this.menuItem.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e) {
                if (e.toString().contains("Favoritos")) {
                    ComandoVisual.s.enviaKey(113);
                }
            }
        });
        this.menuItem = new JMenuItem("Sobre");
        this.Pmenu.add(this.menuItem);
        this.menuItem.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e) {
                if (e.toString().contains("Sobre")) {
                    Acercade a = new Acercade();
                    int w = 500;
                    int h = 400;
                    a.setSize(w, h);
                    Dimension screenDim = Toolkit.getDefaultToolkit().getScreenSize();
                    a.setLocation((screenDim.width - w) / 2, (screenDim.height - h) / 2);
                    a.setVisible(true);
                }
            }
        });
        this.menuItem = new JMenuItem("Donate");
        this.Pmenu.add(this.menuItem);
        this.menuItem.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e) {
                if (e.toString().contains("Donate")) {
                    BareBonesBrowserLaunch.openURL("https://www.paypal.com/cgi-bin/webscr?cmd=_donations&business=C8UZWNDWTFY7S&lc=PT&item_name=KangaRemote&item_number=comandomeo&currency_code=EUR&bn=PP%2dDonationsBF%3abtn_donateCC_LG%2egif%3aNonHosted");
                }
            }
        });
        j.addMouseListener(new MouseAdapter(){

            public void mouseReleased(MouseEvent Me) {
                if (Me.isPopupTrigger()) {
                    PopUpMenu.this.Pmenu.show(Me.getComponent(), Me.getX(), Me.getY());
                }
            }
        });
    }

}

