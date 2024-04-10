public class ContaBancaria {
    private static int contador = 0; // Contador para gerar números de conta únicos
    private int numero_conta;
    private String nome_titular;
    private double saldo;

    public ContaBancaria(String nome_titular, double saldo){
        this.numero_conta = contador++; // Atribuir número de conta único
        this.nome_titular = nome_titular;
        this.saldo = saldo;
    }

    // Métodos getters
    public int getNumero_conta() {
        return numero_conta;
    }

    public String getNome_titular() {
        return nome_titular;
    }

    public double getSaldo() {
        return saldo;
    }

    // Métodos de operações bancárias
    public void depositar(double valor){
        this.saldo += valor;
        System.out.println(">> Valor depositado com sucesso!");
        System.out.println(">> Saldo atual: " + this.saldo);
        System.out.println();
    }

    public void sacar(double valor){
        if(this.saldo < valor){
            System.out.println("Impossível realizar saque! Saldo insuficiente.");
        }else{
            this.saldo -= valor;
            System.out.println(">> Valor sacado com sucesso!");
            System.out.println(">> Saldo atual: " + this.saldo);
            System.out.println();
        }
    }
}
