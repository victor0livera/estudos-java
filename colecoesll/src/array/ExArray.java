package array;

public class ExArray {
    public static void main(String[] args) {
        declaracaoArray();
        tamanhoArray();
        percorrendoArray();
        percorrendoArray2();
        arrayBidimensional();
    }

    private static void arrayBidimensional() {
        System.out.println("****** array bidimensional");
        int[][] array1 = {{1,2,3},{4,5,6}};
        int[][] array2 = {{1,2},{3,4}};

        System.out.println("valores no array1 passados na linha sao");
        outputArray(array1); //exibe o array 1 por linha

        System.out.println("valores no array2 passados na linha sao");
        outputArray(array2);//exibe o array 2 por linha
    }

    private static void outputArray(int[][] array) {
        //faz um loop pelas linhas do array
        for (int linha = 0; linha < array.length; linha++){
            //faz loop pelas colunas da linha atual
            for ( int coluna = 0; coluna < array[linha].length; coluna++) {
                System.out.printf("%d", array[linha][coluna]);
            }
            System.out.println();
        }
    }

    private static void percorrendoArray2() {
        System.out.println("******* percorrendoArray2 ******** ");
        int[] arrayNum = {29,86,32,43,65,22,32,44,55};
        int total = 0;
        for (int i = 0; i < arrayNum.length; i++) {
            System.out.println(arrayNum[i]);
        }
    }

    private static void percorrendoArray() {
        System.out.println("******* percorrendo array *******");
        int[] arrayUm = {889,90,76,454,23,11,666,342,909};
        int total = 0;
        //adiciona o valor de cada elemento ao total
        for (int i : arrayUm) {
            total += i;
        }
        System.out.println("1 - total de elementos arrayUm: " + total);
    }

    private static void tamanhoArray() {
        System.out.println("******** tamanhoArray *******");
        int[] arrayUm = {12,3,4,6,4,24,88,100};
        int[] arrayDois = {43,42,77,1,33,88,99,100,200,300};

        if (arrayDois.length > 8){
            System.out.println("tamanho do ArrayDois - maior que 8!");
        } else {
            System.out.println("tamanho do ArrayDois - menor que 8");
        }
        System.out.println("\nTamanho do ArrayUm = " +arrayUm.length);
    }

    private static void declaracaoArray() {
        System.out.println("****** declaracaoArray *******");
        // [ ] - sao inseridos em uma variavel que referencia um array
        int[] a = new int[4];
        // outra maneira de fazer declaracao e array
        int[] b = new int[10];
        // declarando varios arrays
        int[] r = new int[44], k = new int[23];

        //{} = inicializar valores em um array sua declaracao
        int[] iniciaValores = {12,32,54,6,8,89,64,64,66};

        //declara um array de inteiros
        int[] meuArray;

        // aloca memoria para 10 inteiros
        meuArray = new int[10];

        // inicializa o primeiro elemento
        meuArray [0] = 100;
        meuArray [1] = 99;
        meuArray [2] = 98;
        meuArray [3] = 97;
        meuArray [4] = 96;
        meuArray [5] = 95;
        meuArray [6] = 94;
        meuArray [7] = 93;
        meuArray [8] = 92;
        meuArray [9] = 91;
        // meuArray [10] = 100; estoura a pilha pois nao existe o indice 10

        System.out.println(meuArray[9]);
        System.out.println(meuArray[2]);
    }
}
