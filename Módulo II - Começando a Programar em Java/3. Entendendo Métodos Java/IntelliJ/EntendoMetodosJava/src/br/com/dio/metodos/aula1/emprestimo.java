package br.com.dio.metodos.aula1;

import java.util.Scanner;

public class emprestimo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double valorEmprestimo;
        double numParcelas;

        System.out.println("Informe o valor do empréstimo: ");
        valorEmprestimo = scan.nextDouble();
        System.out.println("Informe o número de parcelas de pagamento: ");
        numParcelas = scan.nextDouble();

        double aliqJuros = calculaJuros(numParcelas);

        double valorParcela = calculaValorParcelas(numParcelas, valorEmprestimo, aliqJuros);
        System.out.println("Empréstimo de R$ "+valorEmprestimo + " que será pago em "+numParcelas+" parcelas");
        if (aliqJuros > 0) {
            System.out.println("O valor da parcela é de R$ " + valorParcela + ", incluindo juros de "+aliqJuros+"%");
        }else {
            System.out.println("O valor da parcela é de R$ " + valorParcela + ", sem juros");
        }
        System.out.println("Totalizando R$ "+ (valorParcela * numParcelas));
        if (aliqJuros > 0) {
            System.out.println("Valor total dos juros: R$ "+((valorParcela * numParcelas) - valorEmprestimo));
        }
    }


    public static double calculaJuros(double numParcelas){
        if (numParcelas <= 12) { //Até 12 parcelas
            return 0;
        } else if (numParcelas <= 24) { //Até 24 parcelas
            return 5; //5% de juros
        } else if (numParcelas <= 36) { //Até 36 parcelas
            return 10; //10% de juros
        } else { //Acima de 36 parcelas
            return 15; //15% de juros
        }
    }

    public static double calculaValorParcelas(double numParcelas, double valorEmprestimo, double aliqJuros) {
        double valorParcelaSemJuros = (valorEmprestimo / numParcelas);
        double valorJuros = (aliqJuros / 100);
        return valorParcelaSemJuros + (valorParcelaSemJuros * valorJuros);
    }
}
