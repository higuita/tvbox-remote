/*
 * Decompiled with CFR 0_132.
 */
package meocomando;

import java.util.Vector;
import javax.swing.JComboBox;
import meocomando.Comando;
import meocomando.ComandoVisual;

public class Configuracoes {
    public static ComandoVisual c;
    public static JComboBox j;
    public static String nome;
    public static String ip;
    public static int porta;
    public static int ncmd;
    public static Vector<Comando> comandos;

    static {
        nome = "";
        ip = "";
        porta = 8082;
        ncmd = 0;
        comandos = new Vector();
    }
}

