package br.com.dio.exercicios.arrays;
/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/
public class Ex1_OrdemInversa {
    public static void main(String[] args) {
        int[] vetor = {5,4,3,2,1,0};
        int count = 0;

        System.out.print("Vetor Original:");
        for (count = 0; count < vetor.length; count++){
            System.out.print(vetor[count]+" ");
        }
        System.out.println("");
        System.out.print("Vetor invertido:");
        for (count = vetor.length - 1; count >= 0; count--){
            System.out.print(vetor[count]+" ");
        }

    }
}
