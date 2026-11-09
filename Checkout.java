package ocp;

// Fechada para modificação: não muda quando surge um novo tipo de pagamento.
public class Checkout {
    public void finalizar(double valor, Pagamento pagamento) {
        pagamento.pagar(valor);
    }
}
