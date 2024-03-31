public class Carro {

    private String marca;
    private String modelo;
    private int ano;
    private String placa;
    public int velociadeAtual;

    Carro(String marca, String modelo, int ano, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
        this.velociadeAtual = 0;
    }

    void acelerar(int velociade) {
        this.velociadeAtual += velociade;
        Style4.print(">> " + this.modelo + " Acelerou \n");
        Style4.print(">> Velociade Atual: " + this.velociadeAtual + " km/h\n");
        
    }

    void frear(int velocidade) {
        this.velociadeAtual -= velocidade;
        Style4.print(">> " + this.modelo + " Freou \n");
        Style4.print(">> Velociade Atual: " + this.velociadeAtual + " km/h\n");
        
    }


    String getMarca() {
        return this.marca;
    }

    String getModelo() {
        return this.modelo;
    }

    int getAno() {
        return this.ano;
    }

    String getPlaca() {
        return this.placa;
    }

    int getVelociade() {
        return this.velociadeAtual;
    }

}