/*
 * Decompiled with CFR 0_132.
 */
package meocomando;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.net.Socket;
import java.net.UnknownHostException;
import meocomando.Configuracoes;

public class Send {
    private Socket socket;
    private PrintWriter saida;
    private BufferedReader entrada;

    public void enviaKey(int key) {
        try {
            String text = "key=" + key;
            this.socket = new Socket(Configuracoes.ip, Configuracoes.porta);
            this.saida = new PrintWriter(this.socket.getOutputStream(), true);
            this.entrada = new BufferedReader(new InputStreamReader(this.socket.getInputStream()));
            System.out.println("Texto enviado: " + text);
            this.saida.println(text);
            try {
                String linha = this.entrada.readLine();
                System.out.println("Texto recebido: " + linha);
                this.socket.close();
            }
            catch (IOException e) {
                System.out.println("Falha na leitura!");
                System.exit(1);
            }
        }
        catch (UnknownHostException e) {
            System.out.println("Host desconhecido: localhost");
            System.exit(1);
        }
        catch (IOException e) {
            System.out.println("N\u00e3o Existe Entrada nem Sa\u00edda de informa\u00e7\u00e3o");
            System.exit(1);
        }
    }
}

