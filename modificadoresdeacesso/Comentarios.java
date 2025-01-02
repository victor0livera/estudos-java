package modificadoresdeacesso;

/**
 * @author jv813
 */
public class Comentarios {
    //comentario em linha
    /* comentario
    em
    bloco */

    //javadoc abaixoo

    /**
     * @deprecated
     */
    public void teste() {

    }

    /**
     * @deprecated
     *
     * metodo que faz o calculo do valor total
     *
     * @return retorna o valor total
     *
     * @see int getValorTotal()
     *
     * @since
     */


    public int getValorTotal() {
        return 20;
    }

    public int getValorTotal(int count) {
        return 20;
    }


}
