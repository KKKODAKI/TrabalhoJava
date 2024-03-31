import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exerc3 {

    public static int recebeNumConta(Scanner scanner){

        Style3.print("Digite o numero da conta: ");
        int numConta = scanner.nextInt();
        return numConta;
    }


    public static String recebeNome(Scanner scanner){

        scanner.nextLine();

        Style3.print("Digite o nome do dono da conta: ");
        String nome = scanner.nextLine();

        return nome;
    }

    public static float recebeSaldo(Scanner scanner){

        Style3.print("Digite o saldo da conta: ");
        float saldo = scanner.nextFloat();

        return saldo;
    }

    public static float depositar(Scanner scanner, float saldo){

        Style3.print("Quanto será depositado: ");
        float saldoDiff = scanner.nextFloat();

        saldo = saldo + saldoDiff;

        Style3.print("Seus saldo atual é: " + saldo + "\n");

        return saldo;
    }

    public static float sacar(Scanner scanner, float saldo){

        Style3.print("Quanto será sacado: ");
        float saldoDiff = scanner.nextFloat();

        saldo = saldo - saldoDiff;

        Style3.print("Seus saldo atual é: " + saldo + "\n");

        return saldo;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numConta;
        String nome;
        float saldo;
        boolean x = true;

        numConta = recebeNumConta(scanner);
        nome = recebeNome(scanner);
        saldo = recebeSaldo(scanner);
        
        do{
        Banco conta1 = new Banco(numConta, nome, saldo);
        
        List<Banco> banco = new ArrayList<Banco>();
        
        banco.add(conta1);
        
        Style3.titulo();

        int escolha = scanner.nextInt();
            switch(escolha){
                case 1:
                for (int i = 0; i < 1; i++){
                    banco.get(i).visualizarConta();
                }

                break;

                case 2:
                saldo = depositar(scanner, saldo);
                break;

                case 3:
                saldo = sacar(scanner, saldo);
                break;
            }

            Style3.print("Deseja fazer outra ação? (s/n)\n");
            scanner.nextLine();
            String continuar = scanner.nextLine();
                if(continuar.equals("s")){
                    x = true;
                }
                else{
                    x = false;
                }
        }while(x);
        scanner.close();
    }
}
