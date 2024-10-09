package edu.fatec.lp2.exercicio1.tipomensagem;

import edu.fatec.lp2.exercicio1.Contatinho;
import edu.fatec.lp2.exercicio1.Mensagem;


public class MsgAudio extends Mensagem {
    private int duracao;

    public MsgAudio(Contatinho destinatario, String horaEnvio, String conteudo, int duracao) {
        super(destinatario, horaEnvio, conteudo);
        this.duracao = duracao;
    }

    @Override
    public Mensagem sendMessage(String conteudo) {
        return new MsgAudio(this.destinatario, this.horaEnvio, conteudo, this.duracao);
    }

    @Override
    public String toString() {
        return "Áudio para " + destinatario.getNome() + ": " + conteudo + " (Duração: " + duracao + "s, Enviado às " + horaEnvio + ")";
    }
}
