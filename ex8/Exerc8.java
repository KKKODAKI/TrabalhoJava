import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exerc8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Pedido> pedidos = new ArrayList<>();

        List<Pizza> cardapio = List.of(
                new Pizza("Strogonoff de Frango", 45, List.of("Batata Palha", "Frango", "Champignon")),
                new Pizza("Calabresa", 28, List.of("Queijo", "Calabresa", "Catupiry")),
                new Pizza("Frango com Catupiry", 32, List.of("Queijo", "Frango", "Catupiry"))
        );

        while (true) {
            Style8.Cardapio(cardapio);

            Style8.print("Faça seu pedido: ");
            int escolha = scanner.nextInt();
            if (escolha == 0) {
                break;
            } 
            else if (escolha == 4) { 
                if (!pedidos.isEmpty()) {
                    pedidos.remove(pedidos.size() - 1);
                    Style8.print("Último pedido cancelado com sucesso.\n");
                } else {
                    Style8.print("Nenhum pedido para cancelar.\n");
                }
                continue;
            }
            else if (escolha < 1 || escolha > cardapio.size()) {
                Style8.print("Escolha inválida!\n");
                continue;
            }
            Pizza pizzaEscolhida = cardapio.get(escolha - 1);

            scanner.nextLine(); 
            Style8.print("Digite o endereço de entrega: ");
            String endereco = scanner.nextLine();

            Pedido pedido = new Pedido();
            pedido.adicionarPizza(pizzaEscolhida);
            pedido.setEnderecoEntrega(endereco);

            pedidos.add(pedido);
        }

        Style8.print("\nPedidos realizados:\n");
        for (Pedido pedido : pedidos) {
            pedido.exibirPedido();
            Style8.print("\n");
        }
        scanner.close();
    }
}