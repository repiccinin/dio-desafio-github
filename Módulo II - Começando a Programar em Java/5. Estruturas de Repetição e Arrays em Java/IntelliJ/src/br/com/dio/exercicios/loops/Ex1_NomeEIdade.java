package br.com.dio.exercicios.loops;

/*
Faça um programa que leia conjuntos de dois valores,
o primeiro representando o nome do aluno e o segundo representando a sua idade.
(Pare o programa inserindo o valor 0 no campo nome)
*/

import java.util.Scanner;

public class Ex1_NomeEIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome;
        int idade;

        while (true) {
            System.out.println("Digite o nome do aluno");
            nome = scan.next();

            if (nome.equals("0")){
                System.out.println("Programa interrompido");
                break;
            }
            System.out.println("Digite a idade do aluno");
            idade = scan.nextInt();

            System.out.println("Aluno: "+nome+" Idade: "+idade);
        }

    }
}
