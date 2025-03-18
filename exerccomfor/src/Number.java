import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        System.out.println("aqui voce vai digitar um numero e o indice vai ate ele! ");
        Scanner n = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int number = Integer.parseInt(n.next());

        for (int i = 1; i <= number; i++) {
            System.out.println(i);
        }
    }
}
