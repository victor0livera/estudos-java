public class Continue {
    public static void main(String[] args) {
        /*
        O comando continue e diferente do comando break, ele nao para a execucao e sim continua
         */
        for (int contador=1; contador<=100; contador++){
            if(contador%5!=0){
                continue;
            }System.out.println("contador: " + contador);
        }
    }
}
