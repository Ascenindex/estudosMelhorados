package com.estudosJava.Introducao;

public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int[][] arrayInt = new int[2][];
        for (int[] arrayBase : arrayInt){
            for (int num : arrayBase){
                System.out.println(num);
            }
        }
    }
}
