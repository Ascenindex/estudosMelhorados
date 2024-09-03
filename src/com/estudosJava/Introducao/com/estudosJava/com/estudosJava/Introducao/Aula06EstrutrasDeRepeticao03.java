package com.estudosJava.Introducao;

public class Aula06EstrutrasDeRepeticao03 {
    // Imprima os primeiros 25 numeros de um dado valor. Por exemplo 50
    public static void main(String[] args) {
        int valorMaximo = 50;
        for (int i = 0; i <= valorMaximo; i++) {
            if (i > 25) {
                break;
            }
            System.out.println(i);
        }
    }
}
