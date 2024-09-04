package com.estudosJava.Bintroducaometodos.teste;

import com.estudosJava.Bintroducaometodos.dominio.Estudante;
import com.estudosJava.Bintroducaometodos.dominio.ImpressoraEstudante;

/**
 * This class is used to test the Estudante and ImpressoraEstudante classes.
 * It demonstrates the creation of Estudante objects and the use of ImpressoraEstudante
 * to print their information.
 *
 * The main method creates three Estudante objects with different attributes
 * and uses an ImpressoraEstudante object to print their details.
 *
 * @author Felippi
 * @version 1.0
 * @since 1.0
 */

public class EstudanteTeste01 {
  public static void main(String[] args) {
    Estudante estudante = new Estudante("João", 20, 'M');
    Estudante estudante2 = new Estudante("Maria", 21, 'F');
    Estudante estudante3 = new Estudante("José", 22, 'M');
    
    ImpressoraEstudante impressoraEstudante = new ImpressoraEstudante();
    impressoraEstudante.imprime(estudante);
    impressoraEstudante.imprime(estudante2);
    impressoraEstudante.imprime(estudante3);  
  }
}