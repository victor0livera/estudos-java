/*
IMPLICITO = FAZ AUTOMATICAMENTE O METODO CASTING SEM DECLARAR NADA
EXPLICITO = EXIGE DECLARACAO PARA FAZER O METODO CASTING

Casting é um recurso que possibilita mudar um valor de um tipo para o outro
as vezes isso é feito automatico, que chamamos de casting IMPLICITO
e tambem pode ser feito por voce, chamado de casting EXPLICITO.
 */

public class Main {
    public static void main(String args[]) {
        /*
        casting explicito
        usamos o metodo casting explicitamente.
         */

        int num1 = 10;
        short num2 = (short) num1;

        long numL = 11111111111111l;
        System.out.println(numL);
        int numI = (int) numL;
        System.out.println(numI);

        /*
        Casting implicito
        byte b = 1;
        short s = b;

        Este e um casting implicito porque nao foi preciso deixar claro
        que estamos convertendo um byte para short, porque byte é menor
        que short. toda variavel que é menor pode ser feito o casting
        implicito para qualquer outro tipo maior.
         */
        int idade = 10;
        long idadeL = idade;

        byte b = 1;
        short s = b;

        byte b1 = (byte)s;
        int i = b1;

        int i1 = 1;
        byte s1 = (byte) i1;
        long l = i1;

        long l1 = 10202020;
        short l2 = (short) l1;
        double d = l1;

        double d1 = 1.0;
        long l3 = (long)d1;

    }
}