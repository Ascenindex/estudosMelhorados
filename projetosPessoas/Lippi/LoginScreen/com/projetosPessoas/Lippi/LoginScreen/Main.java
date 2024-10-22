package com.estudosJava.projetosPessoas.Lippi.LoginScreen.com.projetosPessoas.Lippi.LoginScreen;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Login: ");  
        String login = scanner.nextLine();
        System.out.println("Senha: ");
        String senha = scanner.nextLine();
        Login loginApp = new Login(login, senha);
        if (loginApp.autenticar()) {
            System.out.println("Login efetuado com sucesso!");
        } else {
            System.out.println("Login ou senha incorretos!");
            System.exit(1); // Sai do programa com status de erro 1 (sinalizador de erro)  // exit(0) é o status padrão para o programa executado corretamente.  // exit(1) é o status
            // padrão para um erro na execução do programa.
            // exit(n) é o status padrão para um erro na execução do programa, onde n é um número inteiro.
            // Este número pode ser usado para indicar diversos tipos de erros.
            // Por exemplo, exit(2) é o status padrão para um erro de sintaxe, exit(3) é o status padrão para um erro de execução, etc.
            // exit(-1) é um status padrão para um erro genérico.
            // exit(n) não é um status padrão, mas é um valor que pode ser usado para indicar diversos tipos de erros.
        }

    }
}
