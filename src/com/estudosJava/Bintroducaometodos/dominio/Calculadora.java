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
}
