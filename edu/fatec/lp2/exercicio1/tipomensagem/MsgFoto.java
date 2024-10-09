package edu.fatec.lp2.exercicio1.tipomensagem;

import edu.fatec.lp2.exercicio1.Contatinho;
import edu.fatec.lp2.exercicio1.Mensagem;

public class MsgFoto extends Mensagem {
    private int tamanho;

    public MsgFoto(Contatinho destinatario, String horaEnvio, String conteudo, int tamanho) {
        super(destinatario, horaEnvio, conteudo);
        this.tamanho = tamanho;
    }

    @Override
    public Mensagem sendMessage(String conteudo) {
        return new MsgFoto(this.destinatario, this.horaEnvio, conteudo, this.tamanho);
    }

    @Override
    public String toString() {
        return "Foto para " + destinatario.getNome() + ": " + conteudo + " (Tamanho: " + tamanho + "KB, Enviado às " + horaEnvio + ")";
    }
}