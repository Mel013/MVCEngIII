package br.edu.fatecrl.mvcdemo.models;

public class Animal {

    private String nome;
    private String tipo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Animal(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }
}
