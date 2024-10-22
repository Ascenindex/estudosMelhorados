package com.estudosJava.Gassociacao.test;

import com.estudosJava.Gassociacao.domain.Jogador;

public class JogadorTeste01 {
     public static void main(String[] args) {
          // Fazer 3 jogadores
          Jogador jogador1 = new Jogador("Leko");
          Jogador jogador2 = new Jogador("Ray");
          Jogador jogador3 = new Jogador("Tonhao");

          // Array dos 3 jogadores
          Jogador[] jogadores = {jogador1, jogador2, jogador3};

          for (Jogador jogador : jogadores) {
               jogador.imprimir();
          }


     }

}
