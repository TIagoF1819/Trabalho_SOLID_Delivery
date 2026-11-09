package ocp;

// Abstração: novas formas de pagamento só precisam implementar esta interface.
public interface Pagamento {
    void pagar(double valor);
}
