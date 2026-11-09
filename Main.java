package srp;

public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido(1, "Maria", "Pizza de calabresa", 45.0); 
        new PedidoRepository().salvar(pedido);                              
        new PedidoExibidor().exibir(pedido);                               
    }
}
