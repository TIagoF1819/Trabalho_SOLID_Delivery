package ocp;

// Exemplo de extensão: novo pagamento criado SEM alterar nenhuma classe existente.
public class PagamentoBoleto implements Pagamento {
    @Override
    public void pagar(double valor) {
        System.out.println("Boleto de R$ " + valor + " gerado.");
    }
}
