package dip;

public class Main {
    public static void main(String[] args) {
        new SistemaPedidos(new EmailNotificador()).confirmarPedido(1);
        new SistemaPedidos(new SmsNotificador()).confirmarPedido(2);
        new SistemaPedidos(new WhatsAppNotificador()).confirmarPedido(3);
    }
}
