package com.estudosJava.Dconstrutores.teste;

import com.estudosJava.Dconstrutores.dominio.Anime;

public class AnimeTeste01 {
     public static void main(String[] args) {
          Anime anime1 = new Anime("Bleach", "TV", 360, "Acao", "Ginili");
          anime1.imprime();
          System.out.println("--------------------------------");
          Anime anime2 = new Anime("One Piece", "Manga", 160, "Shounen", "Manga", "lippo");
          anime2.imprime();
     }
}
