import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private static int proximoId = 1;
    private int numPedido;
    private List<Pizza> pizzas;
    private String endereco;

    public Pedido() {
        this.numPedido = proximoId++;
        this.pizzas = new ArrayList<>();
    }

    public int getId() {
        return numPedido;
    }

    public void adicionarPizza(Pizza pizza) {
        pizzas.add(pizza);
    }

    public void setEnderecoEntrega(String endereco) {
        this.endereco = endereco;
    }

    public void cancelarPedido() {
        pizzas.clear();
        endereco = "";
    }

    public float calcularPreço() {
        float total = 0;
        for (Pizza pizza : pizzas) {
            total += pizza.getValor();
        }
        return total;
    }

    public void exibirPedido() {
        Style8.print("Pedido " + numPedido + ":");
        Style8.print("--------------------\n");
        for (Pizza pizza : pizzas) {
            Style8.print(pizza.getNome() + "\n");
        }
        Style8.print("Endereço de entrega: " + endereco + "\n");
        Style8.print("Preço: R$" + calcularPreço() + "\n");
    }
}
