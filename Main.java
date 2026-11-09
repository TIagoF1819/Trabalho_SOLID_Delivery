package srp;

public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido(1, "Maria", "Pizza de calabresa", 45.0); // criar
        new PedidoRepository().salvar(pedido);                              // salvar
        new PedidoExibidor().exibir(pedido);                                // exibir
    }
}
