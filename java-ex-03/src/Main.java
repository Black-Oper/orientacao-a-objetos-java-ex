import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        List<ContaBancaria> contas = new ArrayList<>();

        int op;

        do {
            System.out.println("------------------------");
            System.out.println(">>    BANCO VIRTUAL    <<");
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
                    System.out.print(">> Informe o nome do titular: ");
                    String nome = leitor.nextLine();
                    System.out.print(">> Informe o saldo inicial: ");
                    double saldo = leitor.nextDouble();
                    leitor.nextLine();

                    System.out.println("------------------------");

                    contas.add(new ContaBancaria(nome, saldo));
                    break;
                case 2:
                    System.out.print(">> Informe o numero da conta que deseja entrar: ");
                    int numeroConta = leitor.nextInt();

                    boolean check = false;

                    for (int i = 0; i < contas.size(); i++) {
                        if (numeroConta == contas.get(i).getNumero_conta()) {
                            check = true;
                            break;
                        }
                    }

                    if (check) {
                        System.out.println("------------------------");
                        System.out.println(">> INFORME AÇÃO QUE DESEJA REALIZAR <<");
                        System.out.println("------------------------");
                        int opcao = 0;
                        do {
                            System.out.println("[ 1 ] - Sacar dinheiro");
                            System.out.println("[ 2 ] - Depositar dinheiro");
                            System.out.println("[ 0 ] - Sair");
                            System.out.println("------------------------");
                            System.out.print(">> Insira opcao: ");
                            opcao = leitor.nextInt();
                            leitor.nextLine();

                            switch (opcao) {
                                case 1:
                                    System.out.print(">> Informe o valor que deseja sacar: ");
                                    double valor = leitor.nextDouble();
                                    leitor.nextLine();
                                    contas.get(numeroConta).sacar(valor);
                                    break;
                                case 2:
                                    System.out.print(">> Informe o valor que deseja depositar: ");
                                    double valo = leitor.nextDouble();
                                    leitor.nextLine();
                                    contas.get(numeroConta).depositar(valo);
                                    break;
                                case 0:
                                    break;
                                default:
                                    System.out.println("Opcao invalida!");
                                    break;
                            }
                        } while (opcao != 0);
                    } else {
                        System.out.println("Conta não encontrada!");
                    }
                    break;
                case 3:
                    System.out.println("------------------------");
                    System.out.println(">>  LISTANDO CONTAS  <<");
                    System.out.println("------------------------");
                    for (int i = 0; i < contas.size(); i++) {
                        System.out.println("Nome do titular: " + contas.get(i).getNome_titular());
                        System.out.println("Numero da conta: " + contas.get(i).getNumero_conta());
                        System.out.println("Saldo: " + contas.get(i).getSaldo());
                        System.out.println("------------------------");
                    }
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        } while (op != 0);

        leitor.close();
    }
}
