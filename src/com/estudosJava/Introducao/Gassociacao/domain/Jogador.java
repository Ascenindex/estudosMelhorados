package com.estudosJava.Gassociacao.domain;

public class Jogador {
     private String nome;

     // construtor
     public Jogador(String nome) {
          this.nome = nome;
     }

     // Metodo para imprimir
     public void imprimir() {
          System.out.println("Nome: " + this.nome);
     }

     // get and set
     public String getNome() {
          return nome;
     }
     public void setNome(String nome) {
          this.nome = nome;
     }    
}
