package com.estudosJava.Introducao;

public class Aula06EstrutrasDeRepeticao02 {
    public static void main(String[] args) {
        // Variável para contar até 1000
        int numero = 0;

        // Loop que percorre de 0 até 1000
        for (int i = 0; i <= 1000; i++) {
            // Verifica se o número é par
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
