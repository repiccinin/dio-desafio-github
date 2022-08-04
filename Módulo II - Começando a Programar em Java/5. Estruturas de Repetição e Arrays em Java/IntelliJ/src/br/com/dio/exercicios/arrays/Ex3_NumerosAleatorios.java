package br.com.dio.exercicios.arrays;

import java.util.Random;

/*
Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor.
Ao final mostre os números e seus sucessores.
*/
public class Ex3_NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();
        int[] vetor = new int[20];

        for (int i = 0; i < 20; i++){
            vetor[i] = random.nextInt(100);
        }

        int j = 0;
        while (j < vetor.length){
            System.out.print(vetor[j]+" ");
            j++;
        }
    }
}
