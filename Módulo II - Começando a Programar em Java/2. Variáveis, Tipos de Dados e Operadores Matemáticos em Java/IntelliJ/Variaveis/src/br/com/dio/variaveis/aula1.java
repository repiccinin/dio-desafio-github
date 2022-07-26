package br.com.dio.variaveis;

public class aula1 {
    public static void main(String[] args) {

        int i;
        //int i;
        int I;
        //int 1a; //Não pode iniciar com números
        int _1a; //Evitar -> Não é boa prática
        int $aq; //Evitar -> Não é boa prática

        i = 5;
        I = 10;
        _1a = 20;
        $aq = 7;

        final int j = 10;
        //j = 15; -> não é possível alterar o conteúdo de uma variável final
        int asrn24678md;
        //int asrn246 78md; //Não pode ter espaços
        int asrn2$4678_md = 10; //Evitar -> Não é boa prática
        //int asen2$46%78_md = 10; //% é inválido assim como (,),@...

        asrn24678md = 100;

        int quantidadeProduto = 50;
        int QuantidadeProduto; //Evitar -> Não é boa prática
        final int NUMERO_TENTATIVAS = 5;
        final int numeroTentativas = 5; //Evitar -> Não é boa prática
        //int NUMERO_TENTATIVAS = 5; //Evitar -> Não é boa prática
        int qtdProd; //Evitar -> Não é boa prática (não expressivo)

        System.out.println("i = "+i);
        System.out.println("I = "+I);
        System.out.println("_1a = "+_1a);
        System.out.println("$aq = "+$aq);

        System.out.println("j = "+j);
        System.out.println("asrn24678md = "+asrn24678md);
        System.out.println("asrn2$4678_md = "+asrn2$4678_md);
    }
}
