package com.estudosJava.Bintroducaometodos.teste;

import com.estudosJava.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste05 {
public static void main(String[] args) {
  Calculadora calculadora = new Calculadora();
  int[] numeros = {1, 2, 3, 4, 5};
  calculadora.somaArray(numeros);
  calculadora.somaVarArgs(10 , 10);
  
}
}
