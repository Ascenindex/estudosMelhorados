package com.projetosPessoas.Lippi.libraryProject;

// Classe Biblioteca
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros;

    public Biblioteca() {
        livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void removerLivro(String titulo) {
        boolean removido = livros.removeIf(livro -> livro.getTitulo().equalsIgnoreCase(titulo));
        if (!removido) {
            System.out.println("Não foi possível remover: livro não encontrado.");
        } else {
            System.out.println("Livro removido com sucesso.");
        }
    }

    public void listarLivros() {
        if (livros.isEmpty()) {
            System.out.println("Nenhum livro na biblioteca.");
        } else {
            livros.forEach(System.out::println);
        }
    }

    public void buscarLivro(String termo) {
        List<Livro> encontrados = new ArrayList<>();
        for (Livro livro : livros) {
            if (livro.getTitulo().contains(termo) || livro.getAutor().contains(termo)) {
                encontrados.add(livro);
            }
        }
        if (encontrados.isEmpty()) {
            System.out.println("Nenhum livro encontrado com o termo \"" + termo + "\".");
        } else {
            encontrados.forEach(System.out::println);
        }
    }
}
