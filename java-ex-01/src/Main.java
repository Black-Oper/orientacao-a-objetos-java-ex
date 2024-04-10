import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Calculadora calc = new Calculadora();

        System.out.println("#######################");
        System.out.println("###   CALCULADORA   ###");
        System.out.println("#######################");

        Scanner leitor = new Scanner(System.in);

        System.out.println();
        System.out.print(">> Informe o primeiro número: ");
        calc.n1 = leitor.nextInt();

        System.out.print(">> Informe o segundo número: ");
        calc.n2 = leitor.nextInt();
        leitor.nextLine();

        System.out.print(">> Informe o operador (+, -, *, /): ");
        calc.op = leitor.nextLine();

        calc.result = Calculadora.calcularResultado(calc.n1, calc.n2, calc.op);

        System.out.println(">> Resultado: " + calc.result);
    }
}
