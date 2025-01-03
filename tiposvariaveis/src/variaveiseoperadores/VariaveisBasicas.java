package variaveiseoperadores;

public class VariaveisBasicas {
    //int - numeros inteiros de 32bits
    //float - numeros em notacao de ponto flutuante
    //boolean - pode assumir dois valores true e false
    //String - armazena caractere em notacao de 16 bits, aceita dados alfanumericos
    //byte - aloca numero inteiro de 8 bits
    //short - armazena numeros inteiros de 16bits
    //long  - aloca numeros inteiros de 64bits
    //double - numeros em notacao de ponto flutuante.

    private int codigo; //esta variavel pode ser usada dentro de um escopo de metodo
    private long codigoMaior;
    private float valorDecimal;
    private double valorDecimall;
    private String texto;
    private boolean status;
    private short shor;
    private byte by;

    public String retornaTexto() {
        this.codigo = 0;
        return "aaaaaa";

    }

    public int retornaInteiro() {
        int val = 10; // esta variavel so pode ser usada dentro desse escopo
        String texto = "texto";
        this.texto = null;
        return val;
    }

    public long retornaLong(long num) {
        return num;
    }


}
