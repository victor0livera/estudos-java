public class Produto {
    public static void main(String args[]) {
        Cliente cliente = new Cliente();
        cliente.setCodigo(1);
        cliente.setEndereco("Rua 1");
        System.out.println(cliente.getCodigo());
        System.out.println(cliente.getEndereco());
        String end = cliente.retornarEndereco();
        System.out.println(end);
        System.out.println(cliente.valorTotal());
    }
}
