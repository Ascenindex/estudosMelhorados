package com.estudosJava.Bintroducaometodos.dominio;

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

  public void imprime() {
    System.out.println("----------------");
    System.out.println(this.nome);
    System.out.println(this.idade);
    System.out.println(this.sexo);
    System.out.println("----------------");
  }
}
