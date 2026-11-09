package srp;

// Responsabilidade ÚNICA: representar os dados de um pedido.
public class Pedido {
    private final int id;
    private final String cliente;
    private final String item;
    private final double valor;

    public Pedido(int id, String cliente, String item, double valor) {
        this.id = id;
        this.cliente = cliente;
        this.item = item;
        this.valor = valor;
    }

    public int getId() { return id; }
    public String getCliente() { return cliente; }
    public String getItem() { return item; }
    public double getValor() { return valor; }
}
