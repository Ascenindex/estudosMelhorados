package com.estudosJava.Bintroducaometodos.teste;

import com.estudosJava.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTeste01 {
  public static void main(String[] args) {
    Funcionario funcionario = new Funcionario("Joao", 20, new double[] {1000, 2000, 3000});
    Funcionario funcionario2 = new Funcionario("Maria", 30, new double[] {4000, 5000, 6000});
    funcionario.imprime();
    funcionario2.imprime();
  }
}
