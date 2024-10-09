package edu.fatec.lp2.exercicio1.tipomensagem;

import edu.fatec.lp2.exercicio1.Contatinho;
import edu.fatec.lp2.exercicio1.Mensagem;

public class MsgTexto extends Mensagem {
    // private int numChar;

    public MsgTexto(Contatinho destinatario, String horaEnvio, String conteudo) {
        super(destinatario, horaEnvio, conteudo);
        // this.numChar = conteudo.length();
    }

    @Override
    public Mensagem sendMessage(String conteudo) {
        return new MsgTexto(this.destinatario, this.horaEnvio, conteudo);
    }

    @Override
    public String toString() {
        return "Texto para " + destinatario.getNome() + ": " + conteudo + " (Enviado às " + horaEnvio + ")";
    }
}