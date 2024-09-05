package com.estudosJava.projetosPessoas.Lippi.libraryProject;
// Classe Main
import java.util.Scanner;

import com.estudosJava.projetosPessoas.Lippi.libraryProject.Biblioteca;
import com.estudosJava.projetosPessoas.Lippi.libraryProject.Livro;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();

        while (true) {
            System.out.println("1. Adicionar Livro");
            System.out.println("2. Remover Livro");
            System.out.println("3. Listar Livros");
            System.out.println("4. Buscar Livro");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    System.out.print("Título: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Autor: ");
                    String autor = scanner.nextLine();
                    System.out.print("Ano: ");
                    int ano = scanner.nextInt();
                    scanner.nextLine(); // Limpar o buffer
                    biblioteca.adicionarLivro(new Livro(titulo, autor, ano));
                    break;
                case 2:
                    System.out.print("Título do livro a remover: ");
                    String tituloRemover = scanner.nextLine();
                    biblioteca.removerLivro(tituloRemover);
                    break;
                case 3:
                    biblioteca.listarLivros();
                    break;
                case 4:
                    System.out.print("Título ou autor para buscar: ");
                    String termo = scanner.nextLine();
                    biblioteca.buscarLivro(termo);
                    break;
                case 5:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}