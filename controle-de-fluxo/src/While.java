public class While {
    /*
    é um fluxo de controle que executa uma comparacao, caso esta
    comparacao seja verdadeira o fluxo entra no loop. esta comparacao
    e feita em primeiro lugar, caso o resultado seja verdadeiro ele executa
    o codigo dentro do jogo.

    Diferenca entre for e while:
    a principal diferenca entre o controle de fluxo for e while é que o for voce sabe
    quando sua execucao vai parar, pois voce atribui uma variavel de controle.
    ja no while ele continuara executando o codigo ate que uma condicao (voce nao sabe quando isso ira acontecer)
    seja atingida

    for = para
    while = enquanto

    para 1 ate 10 imprima hello
    enquanto 10 for menor que 20 imprima hello
     */
    public static void main(String[] args) {
        int count = 0;
        while(count < 2){
            System.out.println("repeticao nr: " + count);
            count++;
        }

    }
}
