package edu.fatec.lp2.exercicio1;

public class Contatinho {
    private String nome;
    private String celular;

    public Contatinho(String nome, String celular) {
        this.nome = nome;
        this.celular = celular;
    }

    public String getNome() {
        return nome;
    }

    public String getCelular() {
        return celular;
    }

    @Override
    public String toString() {
        return "Contatinho: " + nome + " - Celular: " + celular;
    }
}
