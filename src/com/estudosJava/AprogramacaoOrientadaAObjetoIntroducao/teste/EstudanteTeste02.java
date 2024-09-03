package com.estudosJava.AprogramacaoOrientadaAObjetoIntroducao.teste;

import com.estudosJava.AprogramacaoOrientadaAObjetoIntroducao.dominio.Estudante;

public class EstudanteTeste02 {
    public static void main(String[] args) {
        Estudante leko = new Estudante("Ray", 20, 'G');
        Estudante ray = new Estudante("Ray", 19, 'F');
        System.out.println("----------------");
        System.out.println(leko.nome);
        System.out.println(leko.idade);
        System.out.println(leko.sexo);
        System.out.println("-------------------");
        System.out.println(ray.nome);
        System.out.println(ray.idade);
        System.out.println(ray.sexo);
        System.out.println();
    }
}
