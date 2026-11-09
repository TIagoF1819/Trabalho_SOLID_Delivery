package srp;

// Responsabilidade ÚNICA: exibir as informações de um pedido.
public class PedidoExibidor {

    public void exibir(Pedido pedido) {
        System.out.println("--- Pedido #" + pedido.getId() + " ---");
        System.out.println("Cliente: " + pedido.getCliente());
        System.out.println("Item: " + pedido.getItem());
        System.out.println("Valor: R$ " + pedido.getValor());
    }
}
