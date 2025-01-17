import java.util.Scanner;

public class BreakContinue {
    /*
    BREAK E CONTINUE
    SAO DOIS COMANDOS DE CONTROLE QUE SAO USADOS JUNTOS COM OS CONTROLES DE FLUXOS FOR E WHILE.

    O COMANDO BREAK FAZ COM QUE UM LOOP PARE EM UMA DETERMINADA EXECUCAO

     */

    //EXEMPLO 1:

    public static void main(String[] args) {
        for (int contador = 1; contador<=1000; contador++){
            System.out.println("esta e repeticao nr:" +contador);
            if (contador==10)
                break;

        }
    }
}
