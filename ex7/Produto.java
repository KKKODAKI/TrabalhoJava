public class Produto {
    private String nome;
    private int codigo;
    private int qtdEstoque;
    private float preco;

    public Produto(String nome, int codigo, int qtdEstoque, float preco) {
        this.nome = nome;
        this.codigo = codigo;
        this.qtdEstoque = qtdEstoque;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
}

