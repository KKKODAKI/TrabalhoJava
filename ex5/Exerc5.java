import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exerc5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Carro> carros = new ArrayList<>();

        Style5.print("Digite o número de carros: ");
        int numCarros = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numCarros; i++) {
            Style5.print("\nCarro " + (i + 1) + "\n");

            Style5.print("Digite a marca do carro: ");
            String marca = scanner.nextLine();

            Style5.print("Digite o modelo do carro: ");
            String modelo = scanner.nextLine();

            Style5.print("Digite o ano do carro: ");
            int ano = scanner.nextInt();

            scanner.nextLine();
            Style5.print("Digite a placa do carro: ");
            String placa = scanner.nextLine();

            Carro carro = new Carro(marca, modelo, ano, placa);
            carros.add(carro);
        }

        while (true) {
            Style5.print("\nEscolha um carro (0 para sair):" + "\n");
            for (int i = 0; i < carros.size(); i++) {
                Style5.print((i + 1) + ". " + carros.get(i).getModelo() + " - Placa: " + carros.get(i).getPlaca() + "\n");
            }
            int escolha = scanner.nextInt();
            scanner.nextLine();
            
            if (escolha == 0){
                break;
            }
            
            if (escolha > 0 && escolha <= carros.size()) {

                boolean temp = false;

                do{
                    Style5.escolha();
                    int novaEscolha = scanner.nextInt();
                    scanner.nextLine();
                    
                    switch(novaEscolha){
                        case 0:
                        temp = false;
                        break;
                        
                        case 1:
                            Carro carroEscolhido = carros.get(escolha - 1);
                            int velociade = carroEscolhido.getVelociade();
                            if(velociade < 300){
                                carroEscolhido.acelerar(10);
                            }
                            else{
                                Style5.print(">> Velocidade máxima atingida!!" + " <<\n");
                            }
                            temp = true;
                        break;
                        
                        case 2:
                            carroEscolhido = carros.get(escolha - 1);
                            velociade = carroEscolhido.getVelociade();
                            if(velociade > 0){
                                carroEscolhido.frear(10);
                            }
                            else{
                                Style5.print(">> Velocidade mínima atingida!!" + " <<\n");
                            }
                            temp = true;
                        break;
                        
                        default:
                            Style5.print("Escolha inválida!\n");
                            temp = true;
                        break;                    
                    }
                }while(temp);
            } 
            else {
                Style5.print("Escolha inválida!\n");
            }
        }

        Style5.infosCarro();

        for (int i = 0; i < carros.size(); i++) {
            Carro carro = carros.get(i);
            Style4.print("Marca: " + carro.getMarca() + "\n");
            Style4.print("Modelo: " + carro.getModelo() + "\n");
            Style4.print("Ano: " + carro.getAno() + "\n");
            Style4.print("Placa: " + carro.getPlaca() + "\n");
            Style4.print("Velociade Final: " + carro.getVelociade() + " Km/h\n");
            Style4.print("--------------------\n");
        }
        scanner.close();
    }
}
