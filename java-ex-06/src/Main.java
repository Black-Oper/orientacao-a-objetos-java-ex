import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Agenda agenda = new Agenda(); // Criando uma instância da classe Agenda
        int op;

        do {
            System.out.println("------------------------");
            System.out.println(">>       CONTATOS     <<");
            System.out.println("------------------------");
            System.out.println("[ 1 ] - Registrar novo contato");
            System.out.println("[ 2 ] - Buscar contato");
            System.out.println("[ 3 ] - Listar contatos");
            System.out.println("[ 0 ] - Sair");
            System.out.println("------------------------");
            System.out.print(">> Insira opcao: ");
            op = leitor.nextInt();
            leitor.nextLine();

            switch (op) {
                case 1:
                    System.out.println(">> Insira os detalhes do novo contato:");
                    System.out.print(">> Nome: ");
                    String nome = leitor.nextLine();
                    System.out.print(">> Email: ");
                    String email = leitor.nextLine();
                    System.out.print(">> Telefone: ");
                    int telefone = leitor.nextInt();
                    leitor.nextLine();
                    agenda.adicionarNovoContatoALista(nome, email, telefone);
                    System.out.println(">> Contato adicionado com sucesso!");
                    break;
                case 2:
                    System.out.print(">> Insira o nome do contato a ser buscado: ");
                    String nomeBusca = leitor.nextLine();
                    agenda.buscarContatos(nomeBusca);
                    break;
                case 3:
                    System.out.println(">> Listagem de contatos:");
                    for (Contato contato : agenda.contatos) {
                        System.out.println(">> Nome: " + contato.getNome());
                        System.out.println(">> Email: " + contato.getEmail());
                        System.out.println(">> Telefone: " + contato.getTelefone());
                        System.out.println("------------------------");
                    }
                    break;
                case 0:
                    System.out.println(">> Encerrando o programa...");
                    break;
                default:
                    System.out.println(">> Opção inválida! Por favor, escolha uma opção válida.");
                    break;
            }

        } while (op != 0);

        leitor.close();
    }
}
