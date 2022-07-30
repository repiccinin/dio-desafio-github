package br.com.dio.metodos.aula2;

import java.util.Scanner;

public class sobrecarga {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double baseQuadrilatero;
        double base2Quadrilatero;
        double alturaQuadrilatero;
        double areaQuadrilatero = 0;
        System.out.println("Informe qual quadrilatero deseja calcular a área: ");
        System.out.println("1-Quadrado; 2-Retângulo, 3-Trapézio");
        int tipoQuadrilatero = scan.nextInt();
        switch (tipoQuadrilatero){
            case 1: //Quadrado
                System.out.println("Informe a medida do quadrado: ");
                baseQuadrilatero = scan.nextDouble();
                areaQuadrilatero = areaQuadrilatero(baseQuadrilatero);
                break;
            case 2: //Retângulo
                System.out.println("Informe a base do retângulo: ");
                baseQuadrilatero = scan.nextDouble();
                System.out.println("Informe a altura do retângulo: ");
                alturaQuadrilatero = scan.nextDouble();
                areaQuadrilatero = areaQuadrilatero(baseQuadrilatero, alturaQuadrilatero);
                break;
            case 3:
                System.out.println("Informe a base1 do trapézio: ");
                baseQuadrilatero = scan.nextDouble();
                System.out.println("Informe a base2 do trapézio: ");
                base2Quadrilatero = scan.nextDouble();
                System.out.println("Informe a altura do trapézio: ");
                alturaQuadrilatero = scan.nextDouble();
                areaQuadrilatero = areaQuadrilatero(baseQuadrilatero, base2Quadrilatero, alturaQuadrilatero);
                break;
            default:
                System.out.println("Opção Inválida!");
                break;
        }
        System.out.println("A área do quadrilátero é: "+areaQuadrilatero);
    }


    public static double areaQuadrilatero(double base){
        return base * base;
    }
    public static double areaQuadrilatero(double base, double altura){
        return base * altura;
    }
    public static double areaQuadrilatero(double base, double base2, double altura){
        return ((base + base2)/2) * altura;
    }

}