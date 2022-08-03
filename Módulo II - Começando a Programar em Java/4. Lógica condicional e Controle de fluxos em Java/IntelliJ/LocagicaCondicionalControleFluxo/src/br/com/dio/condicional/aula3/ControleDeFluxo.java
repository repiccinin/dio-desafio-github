package br.com.dio.condicional.aula3;

import java.util.Scanner;

public class ControleDeFluxo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o numero do mês: ");
        int mes = scan.nextInt();
        verificaMes(mes);

        System.out.println("Digite o dia da semana:");
        String diaDaSemana = scan.next();
        verificaDia(diaDaSemana);
    }

    public static void verificaMes(int mes){
        if (mes ==1){
            System.out.println("Janeiro");
            System.out.println("Férias");
        } else if (mes == 2) {
            System.out.println("Fevereiro");
        } else if (mes == 3) {
            System.out.println("Março");
        } else if (mes == 4) {
            System.out.println("Abril");
        } else if (mes == 5) {
            System.out.println("Maio");
        } else if (mes == 6) {
            System.out.println("Junho");
        } else if (mes == 7) {
            System.out.println("Julho");
            System.out.println("Férias");
        } else if (mes == 8) {
            System.out.println("Agosto");
        } else if (mes == 9) {
            System.out.println("Setembro");
        } else if (mes == 10) {
            System.out.println("Outubro");
        } else if (mes == 11) {
            System.out.println("Novembro");
        } else if (mes == 12){
            System.out.println("Dezembro");
            System.out.println("Férias");
        } else {
            System.out.println("Mês Inválido!");
        }
    }

    public static void verificaDia(String diaDaSemana){
        int dia;
        switch (diaDaSemana) {
            case "segunda":
                dia = 2;
                System.out.println("Dia "+dia+ " Segunda. Certo!");
                break;
            case "terça":
                dia = 3;
                System.out.println("Dia "+dia+ " Terça. Certo!");
                break;
            case "quarta":
                dia = 4;
                System.out.println("Dia "+dia+ " Quarta. Errado!");
                break;
            case "quinta":
                dia = 5;
                System.out.println("Dia "+dia+ " Quinta. Talvez!");
                break;
            case "sexta":
                dia = 6;
                System.out.println("Dia "+dia+ " Sexta. Valor indefinido!");
                break;
            case "sábado":
                dia = 7;
                System.out.println("Dia "+dia+ " Sábado. Valor Indefinido!");
                break;
            case "domingo":
                dia = 1;
                System.out.println("Dia "+dia+ " Domingo. Certo!");
                break;
            default:
                System.out.println("Dia inválido!");
        }
    }
}
