package edu.fatec.lp2.exercicio1;

import java.util.ArrayList;
import java.util.List;

public class Whatsapp {
    private List<Contatinho> contatos;
    private List<Mensagem> mensagens;

    public Whatsapp() {
        this.contatos = new ArrayList<>();
        this.mensagens = new ArrayList<>();
    }

    public void adicionarContato(Contatinho contato) {
        contatos.add(contato);
    }

    public void enviarMensagem(Mensagem mensagem) {
        mensagens.add(mensagem);
    }

    public void listarContatos() {
        for (Contatinho contato : contatos) {
            System.out.println(contato);
        }
    }

    public void listarMensagens() {
        for (Mensagem mensagem : mensagens) {
            System.out.println(mensagem);
        }
    }
}