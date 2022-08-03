package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!=5.4.3.2.1=120
*/
public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número:");
        int numero = scan.nextInt();
        int multiplicacao = 1;

        System.out.print(numero+"!=");
        for (int i = numero; i > 0; i--){
            multiplicacao *= i;
            if (i != 1){
                System.out.print(i+".");
            } else {
                System.out.print(i+"= " + multiplicacao);
            }
        }

    }
}
