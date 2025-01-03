package variaveiseoperadores;

public class Operadores {
    /*
    operadores
    + - soma
    - - subtracao
    * - multiplicacao
    / - divisao

    int num1 = 10;
    int num2 = 20;

    int num3 = num1 + num2;
    int num4 = num1 - num2;
    int num5 = num1 * num2;
    int num6 = num1 / num2;
     */
    public static void main(String args[]){
        operacoesAritimeticas();
        operacoesAtribuicoes();
        operacoesDeIncrimentoDecremento();
        operadosRelacionais();
    }

    private static void operadosRelacionais() {
        System.out.println("***** Operadores relacionais *****");
        int num1 = 10;
        int num2 = 20;

        boolean isMaior = num1 > num2 ;
        System.out.println("isMaior: " + isMaior);

        boolean isIgual = num1 == num2;
        System.out.println("isIgual: " + isIgual);

        boolean isMenor = num1 < num2;
        System.out.println("isIgual: " + isMenor);

        boolean isDiff = num1 != num2;
        System.out.println("isDiff: " + isDiff);

        boolean isMaiorIgual = num1 >= num2;
        System.out.println("isIgual: " + isMaiorIgual);

        //1...10
        boolean isDentro10 = num1 >= 1 && num1 <=9;
        System.out.println("isDentro10: " + isDentro10);

        boolean isDentro_10 = num1 >= 1 || num1 <=9;
        System.out.println("isDentro_10: " + isDentro_10);

        boolean isNot = num1 >= 1;
        System.out.println("isNot: " + !isNot);
    }

    private static void operacoesDeIncrimentoDecremento() {
        System.out.println("***** Operacoes de incremento e decremento");
        /*
        sao operadores que nos permitem incrimentar as variaveis
        em uma unidade. podem ser usados diante ou atras da variavel
         */

        int num1 = 10;
        System.out.println(num1);

        num1++; //mesma coisa de fazer num1+1
        System.out.println(num1);

        num1--; //mesma coisa de fazer num1-1
        System.out.println(num1);
    }

    private static void operacoesAtribuicoes() {
        System.out.println("***** Operacoes de atribuicao *****");
        int numero1 = 110; //operador de atribuicao '='
        int numero2 = 110;
        int numero3 = numero1 + numero2;
        System.out.println(numero3);
        numero3 += numero3;
        int numero4 = numero3 + 200;
        System.out.println(numero3);
        System.out.println(numero4);
    }

    //operacoes aritmeticas
    public static void operacoesAritimeticas() {
        System.out.println("***** Operacoes aritmeticas *****");
        int num1 = 10;
        int num2 = 20;

        int num3 = num1 + num2;
        int num4 = num1 - num2;
        int num5 = num1 / num2;
        int num6 = num1 * num2;

        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(num6);

    }
}
