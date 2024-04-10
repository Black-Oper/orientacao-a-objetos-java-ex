import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        List<Livro> lista = new ArrayList<>();

        int op;

        do{
            System.out.println("------------------------");
            System.out.println(">> BIBLIOTECA VIRTUAL <<");
            System.out.println("------------------------");
            System.out.println("[ 1 ] - Registrar novo livro");
            System.out.println("[ 2 ] - Consultar lista de livros");
            System.out.println("[ 0 ] - Sair");
            System.out.println("------------------------");
            System.out.print(">> Insira opcao: ");
            op = leitor.nextInt();
            leitor.nextLine();

            switch (op) {
                case 1:
                    System.out.print(">> Informe o titulo do livro: ");
                    String titulo = leitor.nextLine();
                    System.out.print(">> Informe o autor do livro: ");
                    String autor = leitor.nextLine();
                    System.out.print(">> Informe o ano do livro: ");
                    int ano = leitor.nextInt();
                    leitor.nextLine();

                    lista.add(new Livro(titulo, autor, ano));
                    break;
                case 2:
                System.out.println("------------------------");
                    for (int i = 0; i < lista.size(); i++) {
                        System.out.println("Livro "+ (i + 1) + ":");
                        System.out.println("Titulo: " + lista.get(i).getTitulo());
                        System.out.println("Autor: " + lista.get(i).getAutor());
                        System.out.println("Ano: " + lista.get(i).getAno());
                        System.out.println("------------------------");
                    }
                default:
                System.out.println("Opcao invalida!");
                    break;
            }
        }while(op != 0);

        leitor.close();
    }
}
