package com.estudosJava.Dconstrutores.dominio;

public class Anime {
     private String nome;
     private String tipo;
     private int episodios;
     private String genero;
     private String estudio;
     private String personPrincipal;


     public Anime(String nome, String tipo, int episodios, String genero) {
          this.nome = nome;
          this.tipo = tipo;
          this.episodios = episodios;
          this.genero = genero;
     }

     public Anime(String nome, String tipo, int episodios, String genero, String estudio) {
          this(nome, tipo, episodios, genero);
          this.estudio = estudio;
     }

     public Anime(String nome, String tipo, int episodios, String genero, String estudio, String personPrincipal) {
          this(nome, tipo, episodios, genero, estudio);
          this.personPrincipal = personPrincipal;
     }
     
     
     public void imprime() {
          System.out.println(this.nome);
          System.out.println(this.tipo);
          System.out.println(this.episodios);
          System.out.println(this.genero);
          System.out.println(this.estudio);
          System.out.println(this.personPrincipal);
     }
     
     public String getTipo() {
          return tipo;
     }
     public void setTipo(String tipo) {
          this.tipo = tipo;
     }
     public int getEpisodios() {
          return episodios;
     }
     public void setEpisodios(int episodios) {
          this.episodios = episodios;
     }
     public String getNome() {
          return nome;
     }
     
     public void setNome(String nome) {
          this.nome = nome;
     }
     

     public String getGenero() {
          return genero;
     }

     public void setGenero(String genero) {
          this.genero = genero;
     }
     

     public String getEstudio() {
          return estudio;
     }

     public void setEstudio(String estudio) {
          this.estudio = estudio;
     }
}
