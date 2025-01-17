import java.util.Scanner;

public class ExemploIdade {
    public static void main(String args[]){
        Scanner i = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int idade = i.nextInt();

        if(idade >=0 && idade <= 5){
            System.out.println("voce e um bebe");
        } else if (idade >= 6 && idade <= 12) {
            System.out.println("voce é uma crianca");
        } else if (idade >= 13 && idade <= 18) {
            System.out.println("voce e um adolescente");
        }else {
            System.out.println("voce e um adulto de merda");
        }
    }
}
