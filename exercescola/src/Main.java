import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        Scanner l = new Scanner(System.in);

        //nome do aluno
        System.out.println("Digite o nome aluno: ");
        String nome = l.nextLine();
        aluno.setNome(nome);

        //idade do aluno
        System.out.println("Digite a idade do aluno: ");
        int idade = Integer.parseInt(l.next());
        aluno.setIdade(idade);

        //nota 1 do aluno
        System.out.println("Digite a nota do primeiro bimestre: ");
        double nota1 = Double.parseDouble(l.next());
        aluno.setNota1(nota1);

        //nota 2 do aluno
        System.out.println("Digite a nota do segundo bimestre: ");
        double nota2 = Double.parseDouble(l.next());
        aluno.setNota2(nota2);

        //nota 3 do aluno
        System.out.println("Digite a nota do terceiro bimestre: ");
        double nota3 = Double.parseDouble(l.next());
        aluno.setNota3(nota3);

        //nota 4 do aluno
        System.out.println("Digite a nota do quarto bimestre: ");
        double nota4 = Double.parseDouble(l.next());
        aluno.setNota4(nota4);

        //frequencia do aluno
        System.out.println("Digite a frequencia do aluno: ");
        int freq = Integer.parseInt(l.next());
        aluno.setFrequencia(freq);

        double media = (nota1 + nota2 + nota3 + nota4);

        //separa por idade
        anoLetivo(nome, idade);

        //aprova por media
        aprovMedia(nome,media);

        //atividade extracurricular
        permAtv(nome, freq);
    }

    private static void permAtv(String nome, int freq) {
        int aulas = 175;
        int porcent = 80;
        int participacao = (aulas * porcent)/100;
        System.out.println("o aluno poderá frequentar atividades extra curriculares?");

        if (freq >= participacao){
            System.out.println("Sim, o aluno " + nome + " poderá participar de atividades extra curriculares.");
        }else {
            System.out.println("Nao, o aluno " + nome + " nao poderá participar de atividades extra curriculares.");
        }
    }

    private static void aprovMedia(String nome, double media) {
        Scanner nt = new Scanner(System.in);
        double aprov = (media /4);
        
        if (aprov >= 7){
            System.out.println("Aluno: " + nome + " aprovado por media: " + aprov);
        } else if (aprov <= 7 & aprov >= 5) {
            System.out.println("Aluno: " + nome + " de recuperacao por media: " + aprov);
            System.out.println("Digite a nota da recuperacao do aluno: ");
            double nota5 = Double.parseDouble(nt.next());
            double recF = (media + nota5)/5;

            if (recF >= 7){
                System.out.println("Aluno: " + nome + " aprovado por media na recuperacao: " + recF);
            }else{
                System.out.println("Aluno: " + nome + " reprovado por media na recuperacao: " + recF);
            }
        }else {
            System.out.println("Aluno: " + nome + " reprovado por nao alcancar nota da recuperacao ou aprovacao: " + aprov);
        }
    }

    private static void anoLetivo(String nome, int idade) {
        if (idade <= 8){
            System.out.println("Aluno: "+ nome + " matriculado no ensino fundamental I");
        } else if (idade >= 8 & idade <= 12) {
            System.out.println("Aluno: "+ nome + " matriculado no ensino fundamental II");
        }else if (idade >= 12 & idade <= 18){
            System.out.println("Aluno: "+ nome + " matriculado no ensino médio");
        }else {
            System.out.println("Aluno: "+ nome + " matriculado no ensino de jovens e adultos");
        }
    }

}