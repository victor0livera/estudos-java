//if and else

/*
sao tomadas de decisoes que definem o que é verdadeiro e o que e falso

--- IF significa que a instrucao é verdadeira e else que é false.
Se (if) for tal coisa, faca isso, caso contrario (else), faca aquela outra coisa.
O if pode ser declarado sozinho mas o else só pode ser definido se o if for definido primeiro.
Em conjunto com os controles de fluxos utilizamos os operadores lógicos.---

if
else
else if
for
while
do while
switch
break
continue
 */

public class Main {
   public static void main(String[] args) {
        // exemplo 1
        int result = 2;
        if (result > 1){
            System.out.println("resultado maior que 1");
        }else{
            System.out.println("resultado menor que 1");
        }

        //exemplo 2
        int result1 = 6;
        if(result1 > 1 && result1 < 5){
            System.out.println("resultado maior que 1 e menor que 5");
        }else if(result1 >= 5 && result1 < 8){
            System.out.println("resultado maior ou igual a 5 e menor que 8");
        }else{
            System.out.println("resultado menor que 1");
        }

        //exemplo 3
        int num = 0;
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
                System.out.println("resultado igual a 0");
            }
        }
    }
}