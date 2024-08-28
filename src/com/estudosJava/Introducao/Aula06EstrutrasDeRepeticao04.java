package com.estudosJava.Introducao;

public class Aula06EstrutrasDeRepeticao04 {
    //Dado o valor de um carro, descubra quantas vezes ele pode ser parcelado
    // condicao valorParcela >=1000
    public static void main(String[] args) {
        double valorTotal = 13000;
        for (int parcela = 1; parcela < valorTotal ; parcela++) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela == 1000) {
                break;
            }
            System.out.println("Parcela "+ parcela+ "R$ "+valorParcela);
        }
    }
}
