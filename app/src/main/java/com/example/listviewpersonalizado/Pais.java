package com.example.listviewpersonalizado;

public class Pais {


    String nome;
    int populacao;
    int image;
    public Pais(String nome, int populacao, int imagem) {
        this.nome = nome;
        this.populacao = populacao;
        image = imagem;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPopulacao() {
        return populacao;
    }

    public void setPopulacao(int populacao) {
        this.populacao = populacao;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        image = image;
    }


}
