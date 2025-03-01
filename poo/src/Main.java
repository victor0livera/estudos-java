import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Personagem personagem = new Personagem();
        HeroiA sh = new HeroiA();
        HeroiB bt = new HeroiB();

        colheInformacoes(personagem, sh, bt);
        exibeInformacoes(personagem, sh, bt);

    }

    private static void exibeInformacoes(Personagem personagem, HeroiA sh, HeroiB bt) {
        System.out.println(personagem.getNome());
        System.out.println(personagem.getCpf());
        System.out.println(personagem.getIdade());

        if (personagem.getNome().equals("clark")){
            System.out.println(sh.getNomeA() + " id: " + personagem.getCpf() + " idade: "+personagem.getIdade());
            System.out.println(sh.getHabilidadeEspecialA());
        } else if (personagem.getNome().equals("bruce")) {
            System.out.println(bt.getNomeB() + " id: " + personagem.getCpf() + " idade: " + personagem.getIdade());
            System.out.println(bt.getHabilidadeEspecialB());
        }else {
            System.out.println("Personagem desconhecid(a)");
            System.out.println("habilidade desconhecida");
        }
    }

    private static void colheInformacoes(Personagem personagem, HeroiA sh, HeroiB bt) {
        //nome
        Scanner l = new Scanner(System.in);
        System.out.println("Digite o nome do personagem da DC COMICS: ");
        String nPerson = l.nextLine();
        personagem.setNome(nPerson);

        //cpf
        System.out.println("Digite o id do personagem: ");
        int cpfPerson = l.nextInt();
        personagem.setCpf(cpfPerson);

        //idade
        System.out.println("Digite a idade do personagem: ");
        int idadPerson = l.nextInt();
        personagem.setIdade(idadPerson);
    }
}