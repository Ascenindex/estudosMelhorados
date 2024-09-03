package com.estudosJava.Introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        double salarioAnual = 700;
        double primeiraFaixa = 9.70 / 100;
        double segundaFaixa = 37.35 / 100;
        double terceiraFaixa = 49.50 / 100;

        double valorImposto;

        if (salarioAnual <= 34712){
            System.out.println(salarioAnual * primeiraFaixa);
        } else if (salarioAnual >= 34712 && salarioAnual <=68507) {
            System.out.println(salarioAnual * segundaFaixa);
        }else{
            System.out.println(salarioAnual * terceiraFaixa);
        }

        System.out.println("O salario do mano é " + salarioAnual);
    }
}
