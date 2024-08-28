package com.estudosJava.Introducao;

import java.util.Date;


public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nomeDoRecebedor = "Felippi";
        String endereço = "Rua doze Conj. Marcos Freire N°26";
        float salario = (float) 1550.50;
        Date data = new Date();

        System.out.println("Eu "+nomeDoRecebedor+ " morando no endereço: "+endereço+ " confirmo que recebi o salario " +
                salario+", na data: "+data);
    }
}
