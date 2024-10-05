package com.estudosJava.Eblocosdeinicializacao.domain;

public class Anime {
    private String nome;
    private int[] episodios;

    // Bloco de inicialização
    {
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }


    // Segundo bloco de inicialização
    static {
        System.out.println("Nome do anime: Dragon Ball Z");
    }

    // Construtor
    public Anime() {
        // Este pode estar vazio ou incluir inicializações específicas
        System.out.print("Episódios: ");
        imprimeEpisodios();
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int[] episodios) {
        this.episodios = episodios;
    }

    public void imprimeEpisodios() {
        for (int episodio : this.episodios) {
            System.out.print(episodio + " ");
        }
    }
}
