public class Calculadora {
    int n1;
    int n2;
    String op;
    float result;

    public static float calcularResultado(int n1, int n2, String op) {

        switch (op) {
            case "+":
                return n1 + n2;
            case "-":
                return n1 - n2;
            case "*":
                return n1 * n2;
            case "/":
                if (n2 != 0) {
                    return (float)n1 / n2;
                } else {
                    System.out.println("Erro ao dividir numero por zero!");
                    return Float.NaN; // Retorna um valor de ponto flutuante que representa "não é um número"
                }
            default:
                System.out.println("Operador invalido!");
                return Float.NaN;
        }
    }
}
