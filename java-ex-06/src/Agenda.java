import java.util.*;

public class Agenda {
    public List<Contato> contatos = new ArrayList<>();

    public void adicionarNovoContatoALista(String nome, String email, int telefone) {
        contatos.add(new Contato(nome, nome, telefone));
    }

    public void buscarContatos(String nome) {
        for (Contato contato : contatos) {
            if (contato.getNome().equals(nome)) {
                System.out.println(">> Nome: "+ contato.getNome());
                System.out.println(">> Email: "+ contato.getEmail());
                System.out.println(">> Telefone: "+ contato.getTelefone());
            }
        }
    }
}