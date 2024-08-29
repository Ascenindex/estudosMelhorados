package com.estudosJava.Introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        String[] nomes = new String[4];
        nomes[0] = "Goku";
        nomes[1] = "Ichigo";
        nomes[2] = "Luffy";
        nomes[3] = "nagatoro";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
