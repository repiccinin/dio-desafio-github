package br.com.dio.condicional.aula1;

public class OperadoresRelacionais {

    public static void main(String[] args) {
        int i1 = 10;
        int i2 = 20;
        System.out.println("i1="+i1+" i2="+i2);
        checaInteiro(i1, i2);
        float f1 = 4.5f;
        float f2 = 3.5f;
        System.out.println("f1="+f1+" f2="+f2);
        checaFloat(f1, f2);
        char c1 = 'x';
        char c2 = 'y';
        System.out.println("c1="+c1+" c2="+c2);
        checaChar(c1,c2);
        String s1 = "Fulano";
        String s2 = "Ciclano";
        System.out.println("s1="+s1+" s2="+s2);
        checaString(s1,s2);
        boolean b1 = true;
        boolean b2 = false;
        System.out.println("b1="+b1+" b2="+b2);
        checaBoolean(b1, b2);
        checaDiversosTipos(i1, f1, c1, s1, b1);
    }

    public static void checaInteiro(int i1, int i2){
        if (i1 == i2){
            System.out.println("i1 é igual a i2");
        }
        if (i1 != i2){
            System.out.println("i1 é diferente de i2");
        }
        if (i1 > i2){
            System.out.println("i1 é maior que i2");
        }
        if (i1 <= i2){
            System.out.println("i1 é menor ou igual a i2");
        }
    }

    public static void checaFloat(float f1, float f2){
        if (f1 == f2){
            System.out.println("f1 é igual a f2");
        }
        if (f1 != f2){
            System.out.println("f1 é diferente de f2");
        }
        if (f1 >= f2){
            System.out.println("f1 é maior ou igual a f2");
        }
        if (f1 < f2){
            System.out.println("f1 é menor que f2");
        }
    }

    public static void checaChar(char c1, char c2){
        if (c1 == c2){
            System.out.println("c1 é igual a c2");
        }
        if (c1 != c2){
            System.out.println("c1 é diferente de c2");
        }
        if (c1 > c2){
            System.out.println("c1 é maior que c2");
        }
        if (c1 <= c2){
            System.out.println("c1 é menor ou igual a c2");
        }
    }

    public static void checaString(String s1, String s2){
        if (s1 == s2){
            System.out.println("s1 é igual a s2");
        }
        if (s1 != s2){
            System.out.println("s1 é diferente de s2");
        }
 /*
        if (s1 >= s2){
            System.out.println("s1 é maior ou igual a s2");
        }
        if (s1 < s2){
            System.out.println("s1 é menor que s2");
        }
  */
    }

    public static void checaBoolean(boolean b1, boolean b2){
        if (b1 == b2){
            System.out.println("b1 é igual a b2");
        }
        if (b1 != b2){
            System.out.println("b1 é diferente de b2");
        }
        /*
        if (b1 > b2){
            System.out.println("b1 é maior que b2");
        }
        if (b1 <= b2){
            System.out.println("b1 é menor ou igual a b2");
        }
         */
    }

    public static void checaDiversosTipos(int i1, float f1, char c1, String s1, boolean b1){
        if (i1 > f1){
            System.out.println("i1 é maior que f1");
        }
        if (f1 != c1){
            System.out.println("f1 é diferente de c1");
        }
        /*
        if (c1 > s1){
            System.out.println("c1 é maior que s1");
        }
        if (s1 <= b1){
            System.out.println("s1 é menor ou igual a b1");
        }
         */
    }

}
