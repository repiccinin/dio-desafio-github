package br.com.dio.metodos.aula1;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class saudacao {

    public static void main(String[] args) {
        Calendar calendario = Calendar.getInstance();
        int horaAtual = calendario.get(Calendar.HOUR_OF_DAY);
        System.out.println("Hora atual: " + new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime()));
        imprimeSaudacao(horaAtual);
    }

    public static void imprimeSaudacao(int horaAtual){
        if (horaAtual >= 5 && horaAtual < 12) {
            System.out.println("Bom dia!");
        } else if (horaAtual >= 12 && horaAtual < 18) {
            System.out.println("Boa tarde!");
        } else {
            System.out.println("Boa noite!");
        }
    }
}

