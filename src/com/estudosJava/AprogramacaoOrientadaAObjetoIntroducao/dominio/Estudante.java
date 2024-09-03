package com.estudosJava.AprogramacaoOrientadaAObjetoIntroducao.dominio;

public class Estudante {
    public String nome;
    public int idade;
    public char sexo;

    // Construtor que adiciona o estudante à lista automaticamente
    public Estudante(String nome, int idade, char sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }
}
