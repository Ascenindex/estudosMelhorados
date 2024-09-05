package com.estudosJava.projetosPessoas.Lippi.LoginScreen.com.projetosPessoas.Lippi.LoginScreen;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
        System.out.println("Insira seu nome");
        String myName = scanner.nextLine();
        if (myName.equals("Felippi")){
            System.out.println("Acesso liberado");
            break;
        }else{
            System.out.println("Tente novamete");
        }
        }

    }
}
