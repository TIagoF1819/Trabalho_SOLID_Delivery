# Atividade SOLID - Sistema de Delivery (Java)

Implementação básica dos cinco princípios SOLID, cada um em seu próprio pacote com uma classe `Main` para executar.

| Pacote | Princípio | O que mostra |
|---|---|---|
| `srp` | Single Responsibility | `Pedido` guarda os dados, `PedidoRepository` salva e `PedidoExibidor` exibe |
| `ocp` | Open/Closed | Interface `Pagamento` com Cartão, PIX e Dinheiro. `PagamentoBoleto` foi adicionado sem alterar nenhuma classe existente |
| `lsp` | Liskov Substitution | `Pizza`, `Hamburguer` e `Bebida` substituem `Produto` sem comportamento incorreto |
| `isp` | Interface Segregation | Quatro interfaces pequenas (notificação, relatório, pedidos, entregas), e cada classe implementa só a sua |
| `dip` | Dependency Inversion | `SistemaPedidos` depende da interface `Notificador`, e Email, SMS e WhatsApp são injetados pelo construtor |

## Como executar

Na raiz do projeto:

```bash
mkdir out
javac -d out $(find src -name "*.java")

java -cp out srp.Main
java -cp out ocp.Main
java -cp out lsp.Main
java -cp out isp.Main
java -cp out dip.Main
```

No Windows (PowerShell), compile com `javac -d out (Get-ChildItem -Recurse src -Filter *.java).FullName`.

Também funciona abrindo a pasta `src` no IntelliJ, Eclipse ou VS Code e executando a `Main` de cada pacote.
