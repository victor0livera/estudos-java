import java.util.Scanner;

public class ExemploPPT1Console {
    public static void main (String args[]) {
        // exemplo 1
        Scanner s = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int result = s.nextInt();

        if (result > 1) {
            System.out.println("resultado maior que 1");
        }else{
            System.out.println("resultado zero");
        }

        //exemplo 2
        System.out.println("Digite outro número");
        int result1 = s.nextInt();

        if(result1 > 1 && result1 < 5){
            System.out.println("resultado maior que 1 e menor que 5");
        }else if(result1 >= 5 && result1 <= 8){
            System.out.println("resultado maior ou igual a 5 e menor ou igual a 8");
        }else{
            System.out.println("resultado diferente das outras propostas");
        }

        //exemplo 3
        System.out.println("Digite um número: ");
        int num = s.nextInt();

        if (num >= 5){
            if (num >= 8){
                System.out.println("Resultado maior ou igual a 5 e maior ou igual a 8");
            }else if(num >=6){
                System.out.println("Resultado maior que 5 e igual a 7");
            }else{
                System.out.println("maior ou igual a 5 e menor igual a 8 e 6");
            }
        }else {
            if (num >= 1 && num <=3){
                System.out.println("Resultado 2");
            }else{
                System.out.println("resultado diferente das outras propostas");
            }
        }
    }
}
