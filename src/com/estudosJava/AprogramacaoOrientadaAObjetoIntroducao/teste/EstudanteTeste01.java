package com.estudosJava.AprogramacaoOrientadaAObjetoIntroducao.teste;

import com.estudosJava.AprogramacaoOrientadaAObjetoIntroducao.dominio.Estudante;

public class EstudanteTeste01 {
     public static void main(String[] args) {
          Estudante leko = new Estudante();
          String nome = leko.nome = "Leko";
          int idade = leko.idade = 19;
          char sexo = leko.sexo = 'G';

          System.out.println(nome);
          System.out.println(idade);
          System.out.println(sexo);
     }
}
