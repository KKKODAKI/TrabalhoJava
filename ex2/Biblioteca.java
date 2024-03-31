public class Biblioteca {
    
    String nome;
    String autor;
    int publi;

    Biblioteca(String nm, String aut, int pu){
        nome = nm;
        autor = aut;
        publi = pu;
    }

    void mostrarLivros(){

        System.out.println("-----------------------");
        System.out.println("Nome: " + nome);
        System.out.println("Autor: " + autor);
        System.out.println("Ano de publi: " + publi);
        System.out.println("-----------------------\n");    
    }

}
