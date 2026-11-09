package isp;

public class Main {
    public static void main(String[] args) {
        GerenciadorPedidos pedidos = new ServicoPedidos();
        GerenciadorEntregas entregas = new ServicoEntregas();
        Notificavel notificacao = new ServicoNotificacao();
        GeradorRelatorio relatorio = new ServicoRelatorio();

        pedidos.criarPedido("1 pizza de calabresa");
        entregas.iniciarEntrega(1);
        notificacao.enviarNotificacao("Seu pedido saiu para entrega!");
        entregas.finalizarEntrega(1);
        relatorio.gerarRelatorio();
    }
}
