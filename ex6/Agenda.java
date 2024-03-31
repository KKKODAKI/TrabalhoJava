import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Contato> contatos;
    
    public List<Contato> getContatos() {
        return contatos;
    }
    
    public Agenda() {
        contatos = new ArrayList<>();
    }

    public void novoContato(Contato novoContato) {
        contatos.add(novoContato);
    }

    public void excluirContato(String Contato) {
        for (int i = 0; i < contatos.size(); i++) {
            Contato contato = contatos.get(i);
            if (contato.getNome().equalsIgnoreCase(Contato)) {
                contatos.remove(i);
                break;
            }
        }
    }
    
    public Contato buscarContato(String Contato) {
        for (Contato contato : contatos) {
            if (contato.getNome().equalsIgnoreCase(Contato)) {
                return contato;
            }
        }
        return null;
    }

}