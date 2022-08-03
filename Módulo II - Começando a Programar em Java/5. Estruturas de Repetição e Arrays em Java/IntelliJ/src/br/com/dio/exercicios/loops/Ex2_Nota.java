package br.com.dio.exercicios.loops;

/*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido
e continue pedindo
até que o usuário informe um valor válido.
*/

import java.util.Scanner;

public class Ex2_Nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float nota;
        while (true){
            System.out.println("Digite a nota entre 0 e 10:");
            nota = scan.nextFloat();
            if (nota < 0 | nota > 10) {
                System.out.println("Nota inválida! Tente novamente");
            } else {
                System.out.println("Nota inserida: "+nota);
                break;
            }
        }

    }


}
