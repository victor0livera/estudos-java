import java.util.Scanner;

public class TabuadaDoGoku {
    public static void main(String[] args) {
        System.out.println("essa é a tabuada do goku!!!!!");

        Scanner n = new Scanner(System.in);
        System.out.println("Digite o numero a ser multiplicado: ");
        int multiplcador = Integer.parseInt(n.next());

        for (int i = 1; i <= 10; i++) {
            System.out.println("Multiplicacao: " + i + " X " + multiplcador + " = " + (i*multiplcador) );;
        }
    }
}
