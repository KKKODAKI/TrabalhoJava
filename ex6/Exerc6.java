import java.util.List;

public class Exerc6 {
    public static void main(String[] args) {
        // Preguiça de ficar digitando pra testar, ent já vou colocar aq 🤠👍
        Contato contato1 = new Contato("Lucas", "123456789");
        Contato contato2 = new Contato("Vitor", "987654321");
        Contato contato3 = new Contato("Pedro", "192837465");
        Contato contato4 = new Contato("Kauã", "111222333");
        Contato contato5 = new Contato("Rafael", "444555666");

        Agenda agenda = new Agenda();

        agenda.novoContato(contato1);
        agenda.novoContato(contato2);
        agenda.novoContato(contato3);
        agenda.novoContato(contato4);
        agenda.novoContato(contato5);

        Contato contatoEncontrado = agenda.buscarContato("Pedro");
        if (contatoEncontrado != null) {
            Style6.print(">> Contato encontrado: \n" + contatoEncontrado.getNome() + ", Telefone: " + contatoEncontrado.getTelefone() + "\n");
            Style6.print("--------------------\n");
        } 
        else {
            Style6.print(">> Contato não encontrado.\n");
            Style6.print("--------------------\n");
        }

        agenda.excluirContato("Lucas");

        contatoEncontrado = agenda.buscarContato("Paulin");
        if (contatoEncontrado != null) {
            Style6.print(">> Contato encontrado: \n" + contatoEncontrado.getNome() + ", Telefone: " + contatoEncontrado.getTelefone() + "\n");
            Style6.print("--------------------\n");
        } 
        else {
            Style6.print(">> Contato não encontrado.\n");
            Style6.print("--------------------\n");
        }

        Style6.print("\n>> Lista de Contatos Atualizada <<");

        Style6.listaContatos();

        List<Contato> contatos = agenda.getContatos();
        for (int i = 0; i < contatos.size(); i++) {
            Contato contato = contatos.get(i);
            Style6.print("Nome: " + contato.getNome() + "\nTelefone: " + contato.getTelefone() + "\n");
            Style6.print("--------------------\n");
        }
    }
}
    