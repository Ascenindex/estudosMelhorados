package com.estudosJava.Bintroducaometodos.teste;

import com.estudosJava.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste04 {
public static void main(String[] args) {
  int num1 = 1;
  int num2 = 2;
  Calculadora calculadora = new Calculadora();
  calculadora.alterarDoisNumeros(num1, num2);
  System.out.println("Dentro do CalculadoraTeste04");
  System.out.println("Num1: " + num1);
  System.out.println("Num2: " + num2);
}
}
