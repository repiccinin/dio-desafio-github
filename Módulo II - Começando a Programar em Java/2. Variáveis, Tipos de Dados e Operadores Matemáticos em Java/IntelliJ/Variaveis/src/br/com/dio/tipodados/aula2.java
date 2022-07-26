package br.com.dio.tipodados;

import java.nio.charset.StandardCharsets;

public class aula2 {
    public static void main(String[] args) {
        //Numeral
        byte b = 15;
        //byte b2 = 150;

        short s = -15785;
        //short s2 = 35089;

        int i = 8515785;
        //int i2 = 8345515785;

        long l = 5938515785L;
        //long l2 = -19643455125938515785L;

        float f = 3.147945792f;
        //float f2 = 325794577239485739487592;

        double d = 37028570295870224579487593487539487539489348759384759348753948023948d;
        double d2 = 85.69;

        System.out.println(b);
        //System.out.println(b2);
        System.out.println(s);
        //System.out.println(s2);
        System.out.println(i);
        //System.out.println(i2);
        System.out.println(l);
        //System.out.println(l2);
        System.out.println(f);
        //System.out.println(f2);
        System.out.println(d);
        System.out.println(d2);

        //Textual
        char c = 'T';
        //char c2 = "T"; Somente string é com aspas duplas
        char c3 = '\u0084';

        System.out.println(c);
        //System.out.println(c2);
        System.out.println(c3);

        String st = "especial";
        String st2 = "25/07/2022";
        System.out.println(st);
        System.out.println(st2);

        boolean boo = false;
        System.out.println(boo);
    }
}
