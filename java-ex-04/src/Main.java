import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        List<Jogador> jogadores = new ArrayList<>();

        int op;

        do{
            System.out.println("------------------------");
            System.out.println(">>      PONTUACAO     <<");
            System.out.println("------------------------");
            System.out.println("[ 1 ] - Registrar nova conta");
            System.out.println("[ 2 ] - Acessar conta");
            System.out.println("[ 3 ] - Listar contas");
            System.out.println("[ 0 ] - Sair");
            System.out.println("------------------------");
            System.out.print(">> Insira opcao: ");
            op = leitor.nextInt();
            leitor.nextLine();

            switch (op) {
                case 1:
                    System.out.print(">> Informe o nome do jogador: ");
                    String nome = leitor.nextLine();
                    System.out.print(">> Informe a pontuacao inicial: ");
                    int pontuacao = leitor.nextInt();
                    System.out.print(">> Informe o nivel inicial: ");
                    int nivel = leitor.nextInt();

                    System.out.println("------------------------");

                    jogadores.add(new Jogador(nome, pontuacao, nivel));
                    break;
                case 2:
                    System.out.print(">> Informe o nome do jogador que deseja acessar a conta: ");
                    String nome_j = leitor.nextLine();

                    boolean check = false;

                    for (int i = 0; i < jogadores.size(); i++) {
                        if (nome_j.equals(jogadores.get(i).getNome())) {
                            check = true;
                            System.out.println("------------------------");
                            System.out.println(">> INFORME AÇÃO QUE DESEJA REALIZAR <<");
                            System.out.println("------------------------");
                            int opcao = 0;
                            do {
                                System.out.println("[ 1 ] - Mudar pontuacao");
                                System.out.println("[ 2 ] - Mudar nivel");
                                System.out.println("[ 0 ] - Sair");
                                System.out.println("------------------------");
                                System.out.print(">> Insira opcao: ");
                                opcao = leitor.nextInt();
                                leitor.nextLine();

                                switch (opcao) {
                                    case 1:
                                        System.out.print(">> Informe o valor da nova pontuacao: ");
                                        int valor = leitor.nextInt();
                                        leitor.nextLine();
                                        jogadores.get(i).setPontuacao(valor);
                                        break;
                                    case 2:
                                        System.out.print(">> Informe o valor do novo nivel: ");
                                        int valo = leitor.nextInt();
                                        leitor.nextLine();
                                        jogadores.get(i).setNivel(valo);
                                        break;
                                    case 0:
                                        break;
                                    default:
                                        System.out.println("Opcao invalida!");
                                        break;
                                }
                            } while (opcao != 0);
                            break;
                        }
                    }

                    if (!check) {
                        System.out.println("Conta não encontrada!");
                    }
                    break;
                case 3:
                    System.out.println("------------------------");
                    System.out.println(">>  LISTANDO CONTAS  <<");
                    System.out.println("------------------------");
                    for (int i = 0; i < jogadores.size(); i++) {
                        System.out.println("Nome do jogador: " + jogadores.get(i).getNome());
                        System.out.println("Nivel do jogador: " + jogadores.get(i).getNivel());
                        System.out.println("Pontuacao do jogador: " + jogadores.get(i).getPontuacao());
                        System.out.println("------------------------");
                    }
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    break;
            }
        } while (op != 0);

        leitor.close();
    }
}
