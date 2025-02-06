import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestPerfomanceList {
    public static void main(String[] args) {
        testeLinkedListAdd();
        testeLinkedListRemove();
        testeArrayListAdd();
        testeArrayListRemove();
    }

    private static void testeArrayListAdd() {
        final int MAX = 20000;
        long tInicio = System.currentTimeMillis();
        List<Integer> lista = new ArrayList<>();
        for(int i = 0; i < MAX; i++) {
            lista.add(i);
        }

        for (int i = 0;  i < MAX; i++) {
            lista.contains(i);
        }

        long tFim = System.currentTimeMillis();
        System.out.println("Tempo total arraylist ADD: " + (tFim - tInicio));
    }

    private static void testeLinkedListRemove() {
        final int MAX = 20000;
        long tInicio = System.currentTimeMillis();
        List<Integer> lista = new LinkedList<>();


        for (int i = 0; i < MAX; i++){
            lista.add(i);
        }

        for (int i = MAX -1; i > 0; i--) {
            lista.remove(i);
        }

        long tFim = System.currentTimeMillis();
        System.out.println("Tempo total LinkedList remove: " + (tFim - tInicio));
    }

    private static void testeLinkedListAdd() {
        final int MAX = 20000;
        long tInicio = System.currentTimeMillis();
        List<Integer> lista = new LinkedList<>();

        for(int i = 0; i < MAX; i++){
            lista.add(i);
        }

        for (int i = 0; i < MAX; i++){
            lista.contains(i);
        }

        long tFim = System.currentTimeMillis();
        System.out.println("Tempo total Linkedlist add: " + (tFim - tInicio));
    }

    private static void testeArrayListRemove() {
        final int MAX = 20000;
        long tInicio = System.currentTimeMillis();
        List<Integer> lista = new ArrayList<>();

        for(int i = 0; i < MAX; i++){
            lista.add(i);
        }

        for (int i = MAX -1; i > 0; i--){
            lista.remove(i);
        }

        long tFim = System.currentTimeMillis();
        System.out.println("Tempo total arraylist remove: " + (tFim - tInicio));
    }
}
