public class Notas {
    public static void main(String args[]) {
        notas();
    }

    private static void notas() {
        double nota1 = 7.6;
        double nota2 = 5.4;
        double nota3 = 5.7;
        double nota4 = 5.1;
        int media = 7;

        double notaFinal = (nota1 + nota2 + nota3 + nota4)/4;
        System.out.println(notaFinal);

        boolean aprovacao = notaFinal >= media;
        System.out.println("Aprovado: " + aprovacao);
    }
}
