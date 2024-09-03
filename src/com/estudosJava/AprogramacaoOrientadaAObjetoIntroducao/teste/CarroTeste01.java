package com.estudosJava.AprogramacaoOrientadaAObjetoIntroducao.teste;

import com.estudosJava.AprogramacaoOrientadaAObjetoIntroducao.dominio.Carro;

public class CarroTeste01 {
     public static void main(String[] args) {
     System.out.println("----------------------------------");
     Carro monza = new Carro("Monza", "Pica", 2007, 200);
     System.out.println("Nome: " + monza.nome + "\nModelo: "
               + monza.modelo + "\nAno: " + monza.ano + "\nkms Rodados: " + monza.kmRodado + "km");
     System.out.println("----------------------------------");
     

     }    
}
