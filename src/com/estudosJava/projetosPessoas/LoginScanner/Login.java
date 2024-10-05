package com.estudosJava.projetosPessoas.LoginScanner;

public class Login {
     private String nome;
     private String senha;
     
     // Constructor
     public Login(String nome, String senha) {
          this.nome = nome;
          this.senha = senha;
     }

     // blocks initialization
     {
          System.out.println("Login inicializado com nome: " + nome);
     }

     // Method to print login information
     public void imprimirLogin() {
          System.out.println("Nome: " + nome);
          System.out.println("Senha: " + senha);
     }

     // Getters and Setters
     public String getNome() {
          return nome;
     }
     
     public String getSenha() {
          return senha;
     }

     // Method to validate login credentials
     public boolean validarLogin(String nome2, String senha2) {
          return nome.equalsIgnoreCase(nome2) && senha.equals(senha2);
      }


}
