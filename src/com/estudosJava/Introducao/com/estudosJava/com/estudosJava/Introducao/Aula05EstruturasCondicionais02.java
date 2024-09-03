package com.estudosJava.Introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        int idade = 45;
        String categoria;

        if (idade < 15){
            categoria = ("Categoria infantil");
        } else if (idade >= 15 && idade < 18) {
            categoria = ("Categoria juvenil");
        }else{
            categoria = ("Categoria adulto");
        }
    }
}
