public class Jogador {

    private String nome;
    private int pontuacao;
    private int nivel;

    Jogador(String nome, int pontuacao) {
        this.nome = nome;
        this.pontuacao = pontuacao;
        this.nivel = 1;
    }

    void aumentarPontuacao(int pontos) {
        this.pontuacao += pontos;
        Style4.print(">> Pontuação aumentada para: " + this.pontuacao + "\n");
    }

    void setNivel(int nivel) {
        this.nivel = nivel;
        Style4.print(">> Nível alterado para: " + nivel + "\n");
    }

    String getNome() {
        return this.nome;
    }

    int getPontuacao() {
        return this.pontuacao;
    }

    int getNivel() {
        return this.nivel;
    }

}
