package com.estudosJava.projetosPessoas.LoginScanner;

import java.util.Scanner;

public class Sistema {
     /**
      * @param args
      */
     public static void main(String[] args) {

          Scanner scanner = new Scanner(System.in);
          Login login = new Login("admin", "123456");
          boolean sair = false;
          
          while (!sair) {
               System.out.println("Digite seu nome:");
               String nome = scanner.nextLine();

               System.out.println("Digite sua senha:");
               String senha = scanner.nextLine();

               try {
                    if (login.validarLogin(nome, senha)) {
                         System.out.println("Login efetuado com sucesso!");
                         sair = true;
                    } else {
                         System.out.println("Nome ou senha inválidos!");
                    }
               } catch (Exception e) {
                    System.out.println("Erro ao efetuar o login: " + e.getMessage());
               }
          }
     }
}