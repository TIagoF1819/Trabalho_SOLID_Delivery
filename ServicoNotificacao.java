package isp;

// Só implementa notificação: não é obrigado a ter métodos de pedido, relatório ou entrega.
public class ServicoNotificacao implements Notificavel {
    @Override
    public void enviarNotificacao(String mensagem) {
        System.out.println("Notificação: " + mensagem);
    }
}
