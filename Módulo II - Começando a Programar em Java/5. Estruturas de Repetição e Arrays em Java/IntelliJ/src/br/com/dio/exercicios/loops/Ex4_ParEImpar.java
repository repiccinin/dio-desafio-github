package br.com.dio.exercicios.loops;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/

import java.util.Scanner;

public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int qtdeNumeros = 0, numero = 0;
        int qtdePar = 0, qtdeImpar = 0;
        int contador = 0;
        System.out.println("Digite a quantidade de números:");
        qtdeNumeros = scan.nextInt();
        do{
            System.out.println("Digite o número: ");
            numero = scan.nextInt();
            if (numero % 2 == 0){
                qtdePar++;
            }else{
                qtdeImpar++;
            }
            contador = ++contador;
        } while (contador < qtdeNumeros);
        System.out.println("Números pares: "+qtdePar+" de "+qtdeNumeros);
        System.out.println("Números ímpares: "+qtdeImpar+" de "+qtdeNumeros);
    }
}
