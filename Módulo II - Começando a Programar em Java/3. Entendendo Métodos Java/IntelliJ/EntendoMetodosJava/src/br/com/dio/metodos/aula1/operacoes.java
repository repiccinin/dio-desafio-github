package br.com.dio.metodos.aula1;

import java.util.Scanner;

public class operacoes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double a, b;
        System.out.println("Informe o primeiro valor: ");
        a = scan.nextDouble();
        System.out.println("Informe o segundo valor: ");
        b = scan.nextDouble();

        double soma = soma(a, b);
        System.out.println("A soma de "+a+" + "+b+" = "+soma);

        double subtracao = subtracao(a, b);
        System.out.println("A subtração de "+a+" - "+b+" = "+subtracao);

        double multiplicacao = multiplicacao(a, b);
        System.out.println("A multiplicação de "+a+" * "+b+" = "+multiplicacao);

        double divisao = divisao(a, b);
        System.out.println("A divisão de "+a+" / "+b+" = "+divisao);
    }
    //Soma
    public static double soma(double a, double b){
        return a + b;
    }
    //Subtração
    public static double subtracao(double a, double b){
        return a - b;
    }
    //Multiplicação
    public static double multiplicacao(double a, double b){
        return a * b;
    }
    //Divisão
    public static double divisao(double a, double b){
        return a / b;
    }
}
