import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploArrayList {
    public static void main(String[] args) {
        exemploListaSimples();
        exemploListaSimplesAscendente();
        exemploListaDeNumeros();
}

    private static void exemploListaDeNumeros() {
        System.out.println("*************** EXEMPLO LISTA DE NUMEROS SIMPLES ************************ ");
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println(numbers);
        System.out.println("");
    }

    private static void exemploListaSimplesAscendente() {
        System.out.println("***************** Exemplo lista simples ascendente **********");
        List<String> nomes = new ArrayList<>();
        nomes.add("Joao");
        nomes.add("Victor");
        nomes.add("Oliveira");
        Collections.sort(nomes);
        System.out.println(nomes);
        System.out.println("");
    }

    private static void exemploListaSimples() {
        System.out.println("**********Exemplo de lista simples********");
        List<String> nomes = new ArrayList<>();
        nomes.add("Joao victor");
        nomes.add("victor");
        nomes.add("joao");
        System.out.println(nomes);
        System.out.println("");

        nomes.remove(0);
        boolean contem = nomes.contains("Joao victor");
        System.out.println(nomes);
        System.out.println(contem);
    }
}
