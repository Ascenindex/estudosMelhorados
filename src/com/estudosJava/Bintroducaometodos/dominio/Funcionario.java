package com.estudosJava.Bintroducaometodos.dominio;

public class Funcionario {
  private String nome;
  private int idade;
  private double[] salarios;
  private double media;

  
  public Funcionario(String nome, int idade, double[] salarios) {
    this.nome = nome;
    this.idade = idade;
    this.salarios = salarios;
  }
  
  public void imprime() {
    System.out.println(this.nome);
    System.out.println(this.idade);
    for (double salario : salarios) {
      System.out.println(salario);
    }
    imprimeMediaSalario();
  }
  
  public void imprimeMediaSalario() {
    for (double salario : salarios) {
      media += salario;
    }
    media /= salarios.length;
    System.out.println("Média salarial: " + media);
  }

  public String getNome() {
    return nome;
  }
  
  public void setNome(String nome) {
    this.nome = nome;
  }
  
  public int getIdade() {
    return idade;
  }
  
  public void setIdade(int idade) {
    this.idade = idade;
  }
  
  public double[] getSalarios() {
    return salarios;
  }
  
  public void setSalarios(double[] salarios) {
    this.salarios = salarios;
  }
  
  public double getMedia() {
    return media;
  }
  
  public void setMedia(double media) {
    this.media = media;
  }
}
