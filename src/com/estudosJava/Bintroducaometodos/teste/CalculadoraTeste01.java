package com.estudosJava.Bintroducaometodos.teste;

import com.estudosJava.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste01 {
public static void main(String[] args) {
     Calculadora calculadora = new Calculadora();
     calculadora.someDoisNumeros();
     System.out.println("---------------");
     calculadora.subtraiaDoisNumeros();
}
}
