package com.estudosJava.Bintroducaometodos.teste;

import com.estudosJava.Bintroducaometodos.dominio.Pessoa;

public class PessoaTeste01 {
public static void main(String[] args) {
     Pessoa pessoa = new Pessoa();
     pessoa.setNome("Felippi");
     pessoa.setIdade(-10);
     pessoa.imprime();

     System.out.println("-------");
     System.out.println(pessoa.getNome());
}
}
