package br.com.dio.exercicios.loops;
/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/

import java.util.Scanner;

public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float numero = 0;
        float maior = 0;
        float media = 0;
        int count = 0;

        do {
            System.out.println("Digite o número:");
            numero = scan.nextFloat();
            if (numero > maior){
                maior = numero;
            }
            media = media + numero;
            count = ++count;
        } while (count < 5);
        media = media / 5;
        System.out.println("O maior número digitado foi "+ maior);
        System.out.println("A média dos números digitados foi "+media);
    }
}
