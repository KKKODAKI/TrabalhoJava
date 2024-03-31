public class Banco {

    private int numConta;
    private String nome;
    private float saldo;

    Banco(int numConta, String nome, float saldo){
        this.numConta = numConta;
        this.nome = nome;
        this.saldo = saldo;
    }

    void visualizarConta(){

        Style3.print("-----------------------\n");
        Style3.print("Numero da conta: " + numConta + "\n");
        Style3.print("Dono da conta: " + nome + "\n");
        Style3.print("Saldo: " + saldo + "\n");
        Style3.print("-----------------------\n");    
    }

}
