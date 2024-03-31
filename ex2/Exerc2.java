import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exerc2 {

    public static String recebeMat(Scanner scanner, int i){

        System.out.print("Digite a matrícula do aluno "+ (i+1) +": ");
        String matricula = scanner.nextLine();

        return matricula;
    }

    public static String recebeNome(Scanner scanner, int i){

        System.out.print("Digite o nome do livro "+ (i+1) +": ");
        String nome = scanner.nextLine();

        return nome;
    }

    public static String recebeAutor(Scanner scanner, int i){

        System.out.print("Digite o autor do livro "+ (i+1) +": ");
        String autor = scanner.nextLine();

        return autor;
    }

    public static int recebeAno(Scanner scanner, int i){

        System.out.print("Digite o ano de publicação do livro "+ (i+1) +": ");
        int ano = scanner.nextInt();

        return ano;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nm[] = new String[5];
        String aut[] = new String[5];
        int pu[] = new int[5];

        for(int i=0;i<5;i++){
            System.out.println("---------------");
            System.out.println("--- Livro "+ (i+1) +" ---");
            System.out.println("---------------");

            nm[i] = recebeNome(scanner, i);

            aut[i] = recebeAutor(scanner, i);

            pu[i] = recebeAno(scanner, i);

            scanner.nextLine();
        }

        Biblioteca livro1 = new Biblioteca(nm[0], aut[0], pu[0]);
        Biblioteca livro2 = new Biblioteca(nm[1], aut[1], pu[1]);
        Biblioteca livro3 = new Biblioteca(nm[2], aut[2], pu[2]);
        Biblioteca livro4 = new Biblioteca(nm[3], aut[3], pu[3]);
        Biblioteca livro5 = new Biblioteca(nm[4], aut[4], pu[4]);

        List<Biblioteca> biblioteca = new ArrayList<Biblioteca>();

        biblioteca.add(livro1);
        biblioteca.add(livro2);
        biblioteca.add(livro3);
        biblioteca.add(livro4);
        biblioteca.add(livro5);

        for (int i = 0; i < 5; i++){
            biblioteca.get(i).mostrarLivros();
        }
        scanner.close();
    }
}
