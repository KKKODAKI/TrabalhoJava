import java.util.List;

public class Style8 {
    
    static void print(String texto){
        System.out.print(texto);
    }

    static void Cardapio(List<Pizza> cardapio) {
        System.out.print("╔════════════════════════════════════╗\n");
        System.out.print("║             Cardápio:              ║\n");
        System.out.print("╠════════════════════════════════════╣\n");
        System.out.print("║ 0. Sair do Cardápio                ║\n");
        for (int i = 0; i < cardapio.size(); i++) {
            Pizza pizza = cardapio.get(i);
            System.out.print("║ " + (i + 1) + ". " + pizza.getNome());
            for (int j = 0; j < 25 - pizza.getNome().length(); j++) {
                System.out.print(" ");
            }
            System.out.print("R$" + pizza.getValor() + " ║\n");
        }
        System.out.print("║ 4. Cancelar último pedido          ║\n");
        System.out.print("╚════════════════════════════════════╝\n");
    }

}
