import java.util.Scanner;

public class ExercicioControleDeFluxo {

    public static void main(String[] args) {
        Scanner n1 = new Scanner(System.in);
        System.out.println("Digite a nota do primeiro bimestre: ");
        double result1 = n1.nextDouble();
        System.out.println("Digite a nota do segundo bimestre: ");
        double result2 = n1.nextDouble();
        System.out.println("Digite a nota do terceiro bimestre: ");
        double result3 = n1.nextDouble();
        System.out.println("Digite a nota do quarto bimestre: ");
        double result4 = n1.nextDouble();

        double media = (result1 + result2 + result3 + result4);
        System.out.println("Calculando media...");
        double aprov = (media /4);

        if (aprov >= 7) {
            System.out.println("Aluno aprovado com media: " + aprov);
        } else if (aprov <= 7 && aprov >= 5 ) {
            System.out.println("Aluno de recuperacao com media: " + aprov);
            System.out.println("Digite a nota da recuperacao: ");
            double result5 = n1.nextDouble();
            double recF = (media + result5)/5;
            if (recF >= 7){
                System.out.println("Aluno aprovado na recuperacao com nota: " + recF );
            }else {
                System.out.println("aluno reprovado com media: " + recF);
            }
        }else {
            System.out.println("aluno reprovado com nota: "+ aprov);
        }


    }

}

