package ocp;

public class PagamentoDinheiro implements Pagamento {
    @Override
    public void pagar(double valor) {
        System.out.println("Pago R$ " + valor + " em dinheiro.");
    }
}
