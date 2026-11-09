package ocp;

public class Checkout {
    public void finalizar(double valor, Pagamento pagamento) {
        pagamento.pagar(valor);
    }
}
