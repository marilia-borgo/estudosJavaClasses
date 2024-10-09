package edu.fatec.lp2.exercicio1;

public abstract class Mensagem {
    protected Contatinho destinatario;
    protected String horaEnvio;
    protected String conteudo;

    public Mensagem(Contatinho destinatario, String horaEnvio, String conteudo) {
        this.destinatario = destinatario;
        this.horaEnvio = horaEnvio;
        this.conteudo = conteudo;
    }

    public Contatinho getDestinatario() {
        return destinatario;
    }

    public String getHoraEnvio() {
        return horaEnvio;
    }

    public String getConteudo() {
        return conteudo;
    }

    public abstract Mensagem sendMessage(String conteudo);

    @Override
    public abstract String toString();
} 