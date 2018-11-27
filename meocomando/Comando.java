/*
 * Decompiled with CFR 0_132.
 */
package meocomando;

public class Comando {
    private String nome = "";
    private String ip = "";
    private int porta = 8082;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIp() {
        return this.ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public int getPorta() {
        return this.porta;
    }

    public void setPorta(int porta) {
        this.porta = porta;
    }
}

