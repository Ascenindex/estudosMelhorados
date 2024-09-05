package com.estudosJava.CsobrecargaMetodos.teste;

import com.estudosJava.CsobrecargaMetodos.dominio.Anime;

public class AnimeTeste01 {
public static void main(String[] args) {
     Anime anime = new Anime();
     anime.init("Bleach", "TV", 360, "Acao");

     anime.imprime();
}
}
