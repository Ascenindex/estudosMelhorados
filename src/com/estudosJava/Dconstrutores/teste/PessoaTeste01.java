package com.estudosJava.Dconstrutores.teste;

import com.estudosJava.Dconstrutores.dominio.Pessoa;

public class PessoaTeste01 {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Felippi", 19);
        System.out.println(pessoa1.nome + pessoa1.idade);
    }
}
