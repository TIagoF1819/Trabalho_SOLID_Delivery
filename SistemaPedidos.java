package dip;

// Classe principal: depende da interface Notificador, nunca de Email/SMS/WhatsApp.
public class SistemaPedidos {
    private final Notificador notificador;

    // Injeção de dependência pelo construtor.
    public SistemaPedidos(Notificador notificador) {
        this.notificador = notificador;
    }

    public void confirmarPedido(int id) {
        System.out.println("Pedido " + id + " confirmado.");
        notificador.enviar("Seu pedido " + id + " foi confirmado!");
    }
}
