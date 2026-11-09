package srp;

import java.util.ArrayList;
import java.util.List;

// Responsabilidade ÚNICA: salvar (guardar) pedidos.
public class PedidoRepository {
    private final List<Pedido> pedidos = new ArrayList<>();

    public void salvar(Pedido pedido) {
        pedidos.add(pedido);
        System.out.println("Pedido " + pedido.getId() + " salvo.");
    }
}
