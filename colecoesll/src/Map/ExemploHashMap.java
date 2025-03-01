package Map;

import java.util.*;

public class ExemploHashMap {
    public static void main(String[] args) {
        exemploListaSimples(); 
        exemploListaSimplesIterandoValores();
        exemploListaSimplesIterandoChaves();
        exemploListaSimplesIterandoChaveValor();
    }

    private static void exemploListaSimplesIterandoChaveValor() {
        System.out.println("******** exemploListaSimplesIterandoChaveValor *********");
        Map<Integer, String> lista = new HashMap<>();
        lista.put(1,"Joao da silva");
        lista.put(2,"Antonio Sousa");
        lista.put(3,"Lucia Ferreira");
        lista.put(4,"Victor Oliveira");

        System.out.println("****** for comum *******");
        Set<Map.Entry<Integer, String>> entry = lista.entrySet();
        for (Map.Entry<Integer, String> e : entry){
            System.out.println("Chave: " + e.getKey());
            System.out.println("Valor: " + e.getValue());
        }

        System.out.println("******* forEach stream *********");
        lista.entrySet().forEach(e -> {
            System.out.println("Chave: " + e.getKey());
            System.out.println("Valor: " + e.getValue());
        });

        System.out.println("******** forEach stream 1 ******** ");
        lista.keySet().stream().forEach(System.out::println);

        System.out.println("******** forEach stream 2 ******** ");
        lista.values().stream().forEach(System.out::println);

        System.out.println("******** forEach stream 3 ******** ");
        lista.forEach((key, value) -> System.out.println(key + " " + value));

        System.out.println("******** iterator ******** ");
        Iterator<Map.Entry<Integer, String>> it = lista.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, String> entry1 = it.next();
            System.out.println("Chave: " + entry1.getKey());
            System.out.println("Valor: " + entry1.getValue());
        }
    }

    private static void exemploListaSimplesIterandoChaves() {
        System.out.println("********* exemploListaSimplesIterandoChaves **********");
        Map<Integer, String> lista = new HashMap<>();
        lista.put(1,"Joao da silva");
        lista.put(2,"Antonio Sousa");
        lista.put(3,"Lucia Ferreira");
        lista.put(4,"Victor Oliveira");
        for (Integer value : lista.keySet()) {
            System.out.println(value);
        }

    }

    private static void exemploListaSimplesIterandoValores() {
        System.out.println("***************** exemploListaSimplesIterandoValores *************");
        Map<Integer, String> lista = new HashMap<>();
        lista.put(1,"Joao da silva");
        lista.put(2,"Antonio Sousa");
        lista.put(3,"Lucia Ferreira");
        lista.put(4,"Victor Oliveira");
        for (String value : lista.values()) {
            System.out.println(value);
        }

    }

    private static void exemploListaSimples() {
        System.out.println("******** EXEMPLO LISTA SIMPLES ********");
        Map<Integer, String> lista = new HashMap<>();

        lista.put(1, "Joao da silva");
        lista.put(2, "Antonio de Sousa");
        lista.put(3, "Lucia ferreira");
        lista.put(4, "Joao de oliveira");
        lista.put(5, "Victor Albuquerque");

        System.out.println(lista);
        System.out.println(" ");
    }

}
