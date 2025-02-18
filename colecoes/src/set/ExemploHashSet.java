package set;

import java.util.HashSet;
import java.util.Set;

// nao repete valores na lista

public class ExemploHashSet {
    public static void main(String[] args) {
        exemploListaSimples();
        exemploListaSimplesOrdemAscendente();
        exemploNovo();
    }

    private static void exemploNovo() {
        System.out.println("******* exemplo novo ******");
        Set<Integer> lista = new HashSet<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        System.out.println(lista);
    }

    private static void exemploListaSimples() {
        System.out.println("******* exemplolistasimples ******");
        Set<String> lista = new HashSet<>();
        lista.add("joao da silva");
        lista.add("antonio da silva");
        lista.add("lucia ferreira");
        lista.add("joao da silva");
        System.out.println(lista);
        System.out.println("");
    }

    private static void exemploListaSimplesOrdemAscendente() {
        System.out.println("******* exemplolistasimplesordemascendente");
        Set<String> lista = new HashSet<>();
        lista.add("joao da silva");
        lista.add("joao da silva");
        lista.add("joao da silva");
        lista.add("joao da silva");
        System.out.println(lista);
        System.out.println("");
    }

}
