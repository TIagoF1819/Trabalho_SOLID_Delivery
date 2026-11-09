package ocp;

public class Main {
    public static void main(String[] args) {
        Checkout checkout = new Checkout();

        checkout.finalizar(50.0, new PagamentoCartao());
        checkout.finalizar(50.0, new PagamentoPix());
        checkout.finalizar(50.0, new PagamentoDinheiro());
        checkout.finalizar(50.0, new PagamentoBoleto()); // novo tipo, Checkout não mudou
    }
}
