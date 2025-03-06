import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Listas listas = new Listas();

        adicionaPessoas(pessoa);
        redirecionaUsuario(pessoa, listas);
    }

    private static void redirecionaUsuario(Pessoa pessoa, Listas listas) {
        List<String> masculino = new ArrayList<>(Arrays.asList(listas.masculino));
        List<String> feminino = new ArrayList<>(Arrays.asList(listas.feminino));
        if (pessoa.getGenero().equals("M")){
            masculino.add(String.valueOf(pessoa));
            System.out.println(masculino);
        } else if (pessoa.getGenero().equals("F")) {
            feminino.add(String.valueOf(pessoa));
            System.out.println(feminino.get(0));
        }else {
            System.out.println("Genero desconhecido!");
        }
    }

    private static void adicionaPessoas(Pessoa pessoa) {
        Scanner n = new Scanner(System.in);

        //define o nome do usuario
        System.out.println("Digite o nome do usuario: ");
        String nUser = n.nextLine();
        pessoa.setNome(nUser);

        //define o genero do usuario
        System.out.println("Digite (M)asculino ou (F)eminino para definir o genero do usuario: ");
        String gUser = n.nextLine();
        pessoa.setGenero(gUser);

        //define a idade do usuario
        System.out.println("Digite a idade do usuario: ");
        int iUser = n.nextInt();
        pessoa.setIdade(iUser);
    }
}