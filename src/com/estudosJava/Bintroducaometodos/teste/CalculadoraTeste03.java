package com.estudosJava.Bintroducaometodos.teste;

import com.estudosJava.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste03 {
public static void main(String[] args) {
     Calculadora calculadora = new Calculadora();
     double valor = calculadora.dividirDoisNumeros(20,0);
     System.out.println(valor);
}
}
