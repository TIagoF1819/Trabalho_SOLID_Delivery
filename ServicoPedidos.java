package isp;

public class ServicoPedidos implements GerenciadorPedidos {
    @Override
    public void criarPedido(String descricao) {
        System.out.println("Pedido criado: " + descricao);
    }

    @Override
    public void cancelarPedido(int id) {
        System.out.println("Pedido " + id + " cancelado.");
    }
}
