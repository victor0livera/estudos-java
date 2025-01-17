import java.util.Scanner;

public class ExemploAnimal {
    public static void main(String args[]){
        Scanner a = new Scanner(System.in);

        System.out.println("Digite o nome de um animal: ");
        String texto = a.next();
        String animal = exampleOFIF(texto);
        System.out.println(animal);
    }

    public static String exampleOFIF(String animal) {
        String result;
        if (animal.equals("DOG") || animal.equals("CAT")){
            result = "domestic animal";
        } else if (animal.equals("TIGER")) {
            result = "wild animal";
        }else {
            result = "unknown animal";
        }
        return result;
    }
}
