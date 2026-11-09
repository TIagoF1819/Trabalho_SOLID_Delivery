package lsp;

// Classe principal. Define o contrato que TODAS as subclasses respeitam.
public class Produto {
    private final String nome;
    private final double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() { return nome; }

    public double calcularPreco() {
        return preco;
    }
}
