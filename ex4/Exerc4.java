import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exerc4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Jogador> jogadores = new ArrayList<>();

        Style4.print("Digite o número de jogadores: ");
        int numJogadores = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 0; i < numJogadores; i++) {
            Style4.print("\nJogador " + (i + 1) + "\n");
            Style4.print("Digite o nome do jogador: ");
            String nome = scanner.nextLine();
            Style4.print("Digite a pontuação inicial do jogador: ");
            int pontuacaoInicial = scanner.nextInt();
            scanner.nextLine();

            Jogador jogador = new Jogador(nome, pontuacaoInicial);
            jogadores.add(jogador);
        }

        while (true) {
            Style3.print("\nEscolha o jogador para ganhar pontuação (0 para sair):" + "\n");
            for (int i = 0; i < jogadores.size(); i++) {
                Style4.print((i + 1) + ". " + jogadores.get(i).getNome() + "\n");
            }
            int escolha = scanner.nextInt();
            scanner.nextLine();

            if (escolha == 0)
                break;

            if (escolha > 0 && escolha <= jogadores.size()) {
                Jogador jogadorEscolhido = jogadores.get(escolha - 1);
                jogadorEscolhido.aumentarPontuacao(50);
                int nivelAtual = jogadorEscolhido.getNivel();
                int novaPontuacao = jogadorEscolhido.getPontuacao();
                int novoNivel = novaPontuacao / 250 + 1;
                if (novoNivel > nivelAtual) {
                    jogadorEscolhido.setNivel(novoNivel);
                }
            } else {
                Style4.print("Escolha inválida!\n");
            }
        }

        Style4.tituloJogadores();

        for (int i = 0; i < jogadores.size(); i++) {
            Jogador jogador = jogadores.get(i);
            Style4.print("Nome: " + jogador.getNome() + "\n");
            Style4.print("Pontuação: " + jogador.getPontuacao() + "\n");
            Style4.print("Nível: " + jogador.getNivel() + "\n");
            Style4.print("--------------------\n");
        }
        scanner.close(); 
    }
}