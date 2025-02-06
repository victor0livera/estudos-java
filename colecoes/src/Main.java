public class Main {
    public static void main(String[] args) {
        /*
        Collecoes ou collections
        é um conjunto bem definido de interfaces e classes para representar
        e tratar gruposs de dados como uma unica unidade, que pode ser
        chamada colecao, ou collection. a collections contem os seguintes
        elementos:

        --> interfaces : tipos abstratos que representam as colecoes.
        permitem que colecoes sejam manipuladas tendo como base o conceito
        "programar para interfaces e nao para implementacoes", desde que o
        acesso aos objetos se restrinja apenas ao uso de metodos definidos nas interfaces.

       --> implementacoes: sao as implementacoes concretas das interfaces

       --> algoritmos: sao os metodos que realizam as operacoes sobre os
       objetos das colecoes, tais como busca de ordenacao.

       *INTERFACES*
       --> ITERATOR: esta no topo da hierarquia e possssibilita percorrer
       uma colecao e removeer seus elementos;

       --> COLLECTITON: nao existe implementacao direta dessa interface, mas
       ela define as operacoes basicas para as colecoes, como adicionar, remover, esvaziar, etc

       --> LIST: define uma colecao ordenada, podendo conter elementos
       duplicados, em geral, o usuario tem controle total sobre a posicao onde
       cada elemento é inserido e pode recupera-los
       atraves de seus indices. prefira esta interface quando precisar de acesso aleatorio
       atraves do indice de elemento.

       --> QUEUE: um tipo de colecao para manter uma lista de prioridades, onde
       a ordem dos seus elementos, definida pela implementacao de comparable ou comparator
       determina essa prioridade, com a interface fila pode-se criar filas e pilhas;

       --> MAP: mapeia chaves para valores. cada elemento tem na verdade
       dois objetos: uma chave e um valor, valores podem ser duplicados
       , mas a chaves nao, sortedmap e uma interface que estende map, e permite
       classificacao ascendente das chaves. uma aplicacao dessa interface e a classe properties
       que e usada para persistir propriedades/configuracoes de um sistema, por exemplo.

       --> SET: interface que define uma colecao que nao permite elementos duplicados, a interface
       sortedset, que estende set, possibilita a classificacao natural dos elementos, tal como a ordem alfabetica






         */
    }
}