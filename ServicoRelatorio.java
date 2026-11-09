package isp;

public class ServicoRelatorio implements GeradorRelatorio {
    @Override
    public void gerarRelatorio() {
        System.out.println("Relatório de vendas gerado.");
    }
}
