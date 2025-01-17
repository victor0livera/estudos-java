import java.util.ArrayList;
import java.util.List;

public class LoopWhile {
    //LOOP COM FOR,WHILE, DO, WHILE, BREAK AND CONTINUE

    /*
    O LOOP FOR É MAIS FIXO, PERMITE EXECUTAR O CONJUNTO DE SENTENCAS POR UM NUMERO
    DETERMINADO DE VEZES. O PRINCIPIO DO LOOP FOR É SER UM CONTADOR EXEMPLO:

    EXEMPLO 1:

     for(int i = 0; i < 10; i++){
        System.out.println("Linha" +i);
     }
    */

    public static void main (String args[]) {
        List<Integer> valores = new ArrayList<>();
        for(int i = 0; i <= 10; i++) {
            System.out.println("Linha" + i);
        }

        for (Integer i : valores) {
            System.out.println("linha" + i);
        }

        valores.forEach(i -> System.out.println("Linha" + i));
    }
}
