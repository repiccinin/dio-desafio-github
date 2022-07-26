package br.com.dio.conversao;

public class aula4 {
    public static void main(String[] args) {
        long l1;
        int i1 = 10;
        l1 = i1;
        System.out.println("i1="+i1+" l1="+l1);

        int i2;
        long l2 = 100;
        i2 = (int) l2;
        System.out.println("l2="+l2+" i2="+i2);

        double d1;
        float f1 = 10.5f;
        d1 = f1;
        System.out.println("f1="+f1+" d1="+d1);

        float f2;
        double d2 = 10.5d;
        f2 = (float)d2;
        System.out.println("d2="+d2+" f2="+f2);

        int i3;
        float f3 = 10.5f;
        i3 = (int)f3;
        System.out.println("f3="+f3+" i3="+i3);

        char c1;
        int i4 = 13;
        c1 = (char)i4;
        System.out.println("i4="+i4+" c1="+c1);
    }
}
