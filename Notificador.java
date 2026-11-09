package dip;

// Abstração da qual a classe principal depende.
public interface Notificador {
    void enviar(String mensagem);
}
