package com.estudosJava.Bintroducaometodos.dominio;

public class Calculadora {
     public void someDoisNumeros() {
          System.out.println(10 + 10);
     }

     public void subtraiaDoisNumeros() {
          System.out.println(20 - 5);   
     }

     public void multiplicarDoisNumeros(int num1, int num2 ) {
          System.out.println(num1 * num2 );    
     }


     public double dividirDoisNumeros(double num1, double num2 ) {
          if (num2 == 0) {
               return 0;
          }
          return num1/num2;
     }

     public void alterarDoisNumeros(int numero1, int numero2) {
          numero1 = 99;
          numero2 = 33;
          System.out.println("Dentro do altera dois números");
          System.out.println("numero1: " + numero1);
          System.out.println("numero2: " + numero2);
     }

     public void somaArray(int[] numeros) {
          int soma = 0;
          for (int numero : numeros) {
               soma += numero;
          }
          System.out.println(soma);
     }

     public void somaVarArgs(int... numeros) {
          int soma = 0;
          for (int numero : numeros) {
               soma += numero;
          }
          System.out.println(soma);
     }
}
