package lsp;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Qualquer subclasse pode ser usada no lugar de Produto, sem erro.
        List<Produto> carrinho = List.of(
            new Pizza("calabresa", 45.0),
            new Hamburguer("artesanal", 30.0),
            new Bebida("Refrigerante", 8.0)
        );

        double total = 0;
        for (Produto p : carrinho) {
            System.out.println(p.getNome() + " - R$ " + p.calcularPreco());
            total += p.calcularPreco();
        }
        System.out.println("Total: R$ " + total);
    }
}
