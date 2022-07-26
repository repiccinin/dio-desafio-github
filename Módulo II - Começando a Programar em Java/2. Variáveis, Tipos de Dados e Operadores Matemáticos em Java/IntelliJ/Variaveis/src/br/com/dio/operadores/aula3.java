package br.com.dio.operadores;

public class aula3 {
    public static void main(String[] args) {
        int k = 15%4;
        System.out.println("k: "+k);
        int i = ++k; // i = k + 1;
        System.out.println("i: "+i);
        int j = k--; // j = k; k = k + 1;
        System.out.println("j: " + j);
        float f = 1.5f + 4.5f;
        System.out.println("f: "+f);
        long l = 10398L * 5L;
        System.out.println("l: "+l);
        double d = 45d / 4d;
        System.out.println("d: "+d);


        double d2 = f;
        System.out.println("d2: "+d2);
        i += 5; //i = i + 5;
        System.out.println("i: "+i);
        j -= 3; //j = j - 3;
        System.out.println("j: "+j);
        d /= 2.7d; //d = d / 2.7d;
        System.out.println("d: "+d);
        l *= 3; // l = l * 3;
        System.out.println("l: "+l);
        k %= 2; //k = k % 2;
        System.out.println("k: "+k);


    }
}
