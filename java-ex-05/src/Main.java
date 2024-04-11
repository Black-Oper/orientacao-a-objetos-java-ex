import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        List<Carro> carros = new ArrayList<>();

        int op;

        do{
            System.out.println("------------------------");
            System.out.println(">>        CARROS      <<");
            System.out.println("------------------------");
            System.out.println("[ 1 ] - Registrar novo carro");
            System.out.println("[ 2 ] - Acessar carro");
            System.out.println("[ 3 ] - Listar carros");
            System.out.println("[ 0 ] - Sair");
            System.out.println("------------------------");
            System.out.print(">> Insira opcao: ");
            op = leitor.nextInt();
            leitor.nextLine();

            switch (op) {
                case 1:
                    System.out.println(">> Registrando novo carro: ");
                    System.out.print(">> Informe a marca do carro: ");
                    String marca = leitor.nextLine();
                    System.out.print(">> Informe o modelo do carro: ");
                    String modelo = leitor.nextLine();
                    System.out.print(">> Informe a placa do carro: ");
                    String placa = leitor.nextLine();
                    System.out.print(">> Informe o ano do carro: ");
                    int ano = leitor.nextInt();
                    System.out.print(">> Informe a velocidade atual do carro: ");
                    int velo = leitor.nextInt();
                    leitor.nextLine();

                    carros.add(new Carro(marca, modelo, placa, ano, velo));
                    break;
                case 2:
                    System.out.println(">> Acessando carro: ");
                    System.out.print(">> Informe a placa do carro que deseja acessar: ");
                    String placaCarro = leitor.nextLine();
                    boolean check = false;

                    for (int i = 0; i < carros.size(); i++) {
                        if (placaCarro.equals(carros.get(i).getPlaca())) {
                            check = true;
                            System.out.println("------------------------");
                            System.out.println(">> INFORME AÇÃO QUE DESEJA REALIZAR <<");
                            System.out.println("------------------------");
                            int opcao = 0;
                            do {
                                System.out.println("[ 1 ] - Acelerar");
                                System.out.println("[ 2 ] - Freiar");
                                System.out.println("[ 0 ] - Sair");
                                System.out.println("------------------------");
                                System.out.print(">> Insira opcao: ");
                                opcao = leitor.nextInt();
                                leitor.nextLine();

                                switch (opcao) {
                                    case 1:
                                        System.out.println(">> Acelerando...");
                                        carros.get(i).acelerar();
                                        System.out.println(">> Nova velocidade: "+ carros.get(i).getVelo());
                                        break;
                                    case 2:
                                        System.out.println(">> Freiando...");
                                        carros.get(i).frear();
                                        System.out.println(">> Nova velocidade: "+ carros.get(i).getVelo());
                                        break;
                                    case 0:
                                        break;
                                    default:
                                        System.out.println("Opcao invalida!");
                                        break;
                                }
                            } while (opcao != 0);
                            break; // sair do loop for depois de encontrar o carro
                        }
                    }

                    if (!check) {
                        System.out.println("Carro nao encontrado!");
                    }
                    break;
                case 3:
                    System.out.println("------------------------");
                    System.out.println(">>   LISTANDO CARROS  <<");
                    System.out.println("------------------------");
                    for (int i = 0; i < carros.size(); i++) {
                        System.out.println("Marca: " + carros.get(i).getMarca());
                        System.out.println("Modelo: " + carros.get(i).getModelo());
                        System.out.println("Placa: " + carros.get(i).getPlaca());
                        System.out.println("Ano: " + carros.get(i).getAno());
                        System.out.println("Velocidade: " + carros.get(i).getVelo());
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