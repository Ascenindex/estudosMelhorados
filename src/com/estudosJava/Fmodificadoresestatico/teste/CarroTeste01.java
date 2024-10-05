package com.estudosJava.Fmodificadoresestatico.teste;

import com.estudosJava.Fmodificadoresestatico.domain.Carro;


public class CarroTeste01 {
     public static void main(String[] args) {
     // Carro c1 = new Carro("BMW", 280);
     // Carro c2 = new Carro("Mercedes", 275);
     // Carro c3 = new Carro("Audi", 290);
     System.out.println(Carro.velocidadeLimite);
     Carro.velocidadeLimite = 280;
     System.out.println(Carro.velocidadeLimite);
     }
}
