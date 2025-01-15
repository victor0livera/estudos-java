/*
boxing auto boxing -> conversao de tipos primitivos para classes wrappers correspondentes
Boolean a = true;

 */


import com.sun.jdi.LongValue;

public class Main {
    public static void main(String args[]) {
        //boxing converte uma valor wrapper para primitivo
        Boolean status = true;
        Boolean status1 = Boolean.TRUE;

        Character c = 'a';

        Integer idade = 10;

        Long cpf = Long.valueOf(123123123);
        Long cpf1 = Long.valueOf(123123132);

        //unboxing - converte um valor primitivo para wrapper
        boolean status2 = Boolean.TRUE;
        char letra = Character.valueOf('a');
    }
}