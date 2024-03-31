import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Exerc7 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        List<Produto> estoque = new ArrayList<>();
        exibirMenu(estoque);
    }

    private static void exibirMenu(List<Produto> estoque) {
        boolean temp = true;

        do {
            Style7.Menu();
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    adicionarProduto(estoque);
                    break;
                case 2:
                    removerProduto(estoque);
                    break;
                case 3:
                    exibirRelatorioEstoque(estoque);
                    break;
                case 4:
                    temp = false;
                    break;
                default:
                    Style7.print("Opção inválida!\n");
            }
        }while (temp);
    }

    private static void adicionarProduto(List<Produto> estoque) {
        
        Style7.print("\nAdicionar Produto\n");
        
        scanner.nextLine();
        Style7.print("Nome do Produto: ");
        String nome = scanner.nextLine();

        Style7.print("Código do Produto: ");
        int codigo = scanner.nextInt();

        Style7.print("Quantidade em Estoque: ");
        int quantidade = scanner.nextInt();

        Style7.print("Preço: ");
        float preco = scanner.nextFloat();

        Produto novoProduto = new Produto(nome, codigo, quantidade, preco);
        estoque.add(novoProduto);
        Style7.print("Produto adicionado com sucesso!\n");
    }

    private static void removerProduto(List<Produto> estoque) {
        Style7.print("\nRemover Produto\n");
        Style7.print("Digite o código do produto a ser removido: ");
        int codigo = scanner.nextInt();
    
        boolean encontrado = false;
        for (int i = 0; i < estoque.size(); i++) {
            Produto produto = estoque.get(i);
            if (produto.getCodigo() == codigo) {
                estoque.remove(produto);
                Style7.print("Produto removido com sucesso!\n");
                encontrado = true;
                break;
            }
        }
    
        if (!encontrado) {
            Style7.print("Produto não encontrado!\n");
        }
    }

    private static void exibirRelatorioEstoque(List<Produto> estoque) {
        Style7.print("Relatório de Estoque:\n\n");
        for (int i = 0; i < estoque.size(); i++) {
            Produto produto = estoque.get(i);
            Style7.print("Nome: " + produto.getNome() + "\n");
            Style7.print("Código: " + produto.getCodigo() + "\n");
            Style7.print("Quantidade em Estoque: " + produto.getQtdEstoque() + "\n");
            Style7.print("Preço: " + produto.getPreco() + "\n");
            System.out.println("--------------------\n");
        } 
    }
}
