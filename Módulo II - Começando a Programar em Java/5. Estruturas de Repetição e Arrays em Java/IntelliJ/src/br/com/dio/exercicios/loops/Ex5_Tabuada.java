package br.com.dio.exercicios.loops;

/*
Desenvolva um gerador de tabuada,
capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
O usuário deve informar de qual numero ele deseja ver a tabuada.
A saída deve ser conforme o exemplo abaixo:

Tabuada de 5:
5 X 1 = 5
5 X 2 = 10
...
5 X 10 = 50
*/

import java.util.Scanner;

public class Ex5_Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a tabuada desejada:");
        int numero = scan.nextInt();
        int i;
        System.out.println("Tabuada do "+numero);
        for (i = 0; i <= 10; i++){
            System.out.println(numero+" x "+i+" = "+ numero*i);
        }
        /*
        do {
            System.out.println(numero+" x "+contador+" = "+ numero*contador);
            contador++;
        } while (contador <= 10);
        */
        System.out.println("Até mais! ;-)");

    }
}
