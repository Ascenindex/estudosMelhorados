package com.estudosJava.AprogramacaoOrientadaAObjetoIntroducao.teste;

import com.estudosJava.AprogramacaoOrientadaAObjetoIntroducao.dominio.Professor;

public class ProfessorTeste01 {
public static void main(String[] args) {
     Professor genivaldo = new Professor("Genivaldo", 10, 'P');
     System.out.println(genivaldo.nome);
     System.out.println(genivaldo.idade);
     System.out.println(genivaldo.sexo);
}
}
