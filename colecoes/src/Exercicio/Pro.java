package Exercicio;


import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;


public class Pro {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o nome do user: ");
        String nome = ler.next();
        System.out.println("Digite o genero do user: ");
        String g = ler.next();
        adcPessoas(nome,g);
    }

    private static void adcPessoas(String nome, String g) {
        List<Pessoas> masculino = new ArrayList<Pessoas>();
        List<Pessoas> feminino = new ArrayList<Pessoas>();

        Pessoas pessoa = new Pessoas(nome, g);
        feminino.add(pessoa);
        System.out.println(feminino);

        if (g.equals("F")) {
            System.out.println("adicionando a lista feminina");
            feminino.add(pessoa);
            System.out.println(feminino);
            System.out.println("");
        } else if (g.equals("M")) {
            System.out.println("adicionando a lista masculina");
            masculino.add(pessoa);
            System.out.println(masculino);
            System.out.println("");
        } else {
            System.out.println("erro por favor tente novamente");
        }
    }
}
