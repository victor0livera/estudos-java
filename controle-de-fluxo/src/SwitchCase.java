import java.util.Scanner;

public class SwitchCase {
    public static  void main(String args[]) {
        /*
        SWITCH, CASE E DEFAULT
        O SWITCH VERIFICA UMA VARIAVEL E AGE DE ACORDO COM OS SEUS CASOS.
         */

        //EXEMPLO:
        Scanner i = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int idade = i.nextInt();
        String idad = getIdade(idade);
        System.out.println(idad);

    }

    private static String getIdade(int idade) {
        String result;
        switch (idade){
            case 0:
            case 5:
                result = "voce e um bebe";
                break;
            case 6:
            case 10:
                result = "voce e uma crianca";
                break;
            case 11:
            case 18:
                result = "voce e um adolesccnte";
                break;
            default:
                result = "voce e um adulto";
                break;
        }
        return result;
    }
}
