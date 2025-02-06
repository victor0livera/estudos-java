package Alunos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListAluno {

    public static void main(String[] args) {
        exemploListaSimplesOrdenadaComparatorAluno();
        exemploListaSimplesOrdenadaClasseExterna();
    }

    private static void exemploListaSimplesOrdenadaClasseExterna() {
        System.out.println("************* exemploListaSimplesOrdenadaClasseExterna *************");
        List<Aluno> lista = new ArrayList<Aluno>();

        Aluno a = new Aluno("Joao Victor","Linux basico", 30);
        Aluno b = new Aluno("Joao", "Java", 50);
        Aluno c = new Aluno("Victor", "Python", 20);
        lista.add(a);
        lista.add(b);
        lista.add(c);
        System.out.println(lista);
        Collections.sort(lista);
        System.out.println(lista);
        System.out.println("");


    }

    private static void exemploListaSimplesOrdenadaComparatorAluno() {
        System.out.println("************* exemploListaSimplesOrdenadaClasseExterna *************");
        List<Aluno> lista = new ArrayList<Aluno>();

        Aluno a = new Aluno("Joao Victor","Linux basico", 20);
        Aluno b = new Aluno("Joao", "Java", 50);
        Aluno c = new Aluno("Victor", "Python", 30);
        lista.add(a);
        lista.add(b);
        lista.add(c);
        System.out.println("Lista sem ordenacao" + lista);
        Collections.sort(lista);
        System.out.println("Lista com ordenacao" + lista);

        ComparaNotaAluno comparaNotaAluno = new ComparaNotaAluno();
        Collections.sort(lista, comparaNotaAluno);
        System.out.println("Lista com ordenacao por nota" + lista);
        System.out.println("");

        lista.remove(0);
        System.out.println(lista);
        boolean contem = lista.contains("Joao");
        System.out.println(contem);

        System.out.println(lista.get(0));
    }


}
