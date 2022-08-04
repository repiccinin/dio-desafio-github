package br.com.dio.exercicios.arrays;

import java.util.Random;

/*
Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9.
*/
public class Ex4_ArrayMultidimensional {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] M = new int[4][4];
        int i = 0; //contador de linhas
        int j = 0; //contador de colunas

        int coluna = 0;
        int linha = 0;
        int menor = Integer.MAX_VALUE;

        //Populando matriz
        while(i < M.length){
            System.out.println("");
            while(j < M[i].length){
                M[i][j] = random.nextInt(9);
                System.out.print("["+M[i][j]+"] ");
                if (M[i][j] < menor){
                    menor = M[i][j];
                    linha = i;
                    coluna = j;
                }
                j++;
            }
            j = 0; // Volta à primeira coluna para a próxima linha
            i++;
        }
        System.out.println("");
        System.out.println("Menor número: ["+menor+"] Linha: "+ ++linha + " Coluna: "+ ++coluna);
    }




}
