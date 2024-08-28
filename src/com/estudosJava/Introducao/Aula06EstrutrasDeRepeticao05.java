package com.estudosJava.Introducao;

public class Aula06EstrutrasDeRepeticao05 {
    public static void main(String[] args) {
        double valorTotal = 30000;

        // Loop para calcular o valor de cada parcela
        for (int parcela = (int) valorTotal; parcela >= 1; parcela--) {
            double valorParcela = valorTotal / parcela;

            // Se o valor da parcela for menor que 1000, continue para a próxima iteração
            if (valorParcela < 1000) {
                continue;
            }

            // Imprime o número da parcela e seu valor
            System.out.println("Parcela " + parcela + " R$ " + valorParcela);
        }
    }
}
