package exercicios;


public class Exercicio9 {

    // Classe Conta
    public static class Conta {
        private String titular;
        private int numero;
        private String agencia;
        private double saldo;
        private String dataAbertura;

        // Construtor
        public Conta(String titular, int numero, String agencia, double saldo, String dataAbertura) {
            this.titular = titular;
            this.numero = numero;
            this.agencia = agencia;
            this.saldo = saldo;
            this.dataAbertura = dataAbertura;
        }

        // Método para sacar da conta
        public void sacar(double valor) {
            if (valor <= saldo) {
                saldo -= valor;
                System.out.println("Saque de R$" + valor + " realizado com sucesso!");
            } else {
                System.out.println("Erro: Saldo insuficiente para o saque.");
            }
        }

        // Método para depositar na conta
        public void depositar(double valor) {
            if (valor > 0) {
                saldo += valor;
                System.out.println("Depósito de R$" + valor + " realizado com sucesso!");
            } else {
                System.out.println("Erro: O valor do depósito deve ser maior que zero.");
            }
        }

        // Método para calcular o rendimento da conta (10% sobre o saldo)
        public double calcularRendimento() {
            return saldo * 0.1;  // Rendimento de 10%
        }

        // Método para exibir as informações da conta
        public void exibirInformacoes() {
            System.out.println("\nConta Bancária:");
            System.out.println("Titular: " + titular);
            System.out.println("Número da Conta: " + numero);
            System.out.println("Agência: " + agencia);
            System.out.println("Saldo: R$" + saldo);
            System.out.println("Data de Abertura: " + dataAbertura);
        }

        // Getters e Setters para os atributos
        public String getTitular() {
            return titular;
        }

        public void setTitular(String titular) {
            this.titular = titular;
        }

        public int getNumero() {
            return numero;
        }

        public void setNumero(int numero) {
            this.numero = numero;
        }

        public String getAgencia() {
            return agencia;
        }

        public void setAgencia(String agencia) {
            this.agencia = agencia;
        }

        public double getSaldo() {
            return saldo;
        }

        public void setSaldo(double saldo) {
            this.saldo = saldo;
        }

        public String getDataAbertura() {
            return dataAbertura;
        }

        public void setDataAbertura(String dataAbertura) {
            this.dataAbertura = dataAbertura;
        }
    }

    // Classe TestaConta (classe de teste)
    public static void main(String[] args) {
        // Instanciando um objeto da classe Conta
        Conta conta = new Conta("João Silva", 123456, "Agência Central", 5000.00, "01/01/2023");

        // Exibindo as informações da conta antes das operações
        System.out.println("Antes das operações:");
        conta.exibirInformacoes();

        // Realizando um saque
        System.out.println("\nRealizando um saque de R$1000,00...");
        conta.sacar(1000.00);
        System.out.println("Saldo atual: R$" + conta.getSaldo());

        // Realizando um depósito
        System.out.println("\nRealizando um depósito de R$500,00...");
        conta.depositar(500.00);
        System.out.println("Saldo atual: R$" + conta.getSaldo());

        // Calculando o rendimento
        System.out.println("\nCalculando o rendimento (10%)...");
        double rendimento = conta.calcularRendimento();
        System.out.println("Rendimento de 10% sobre o saldo: R$" + rendimento);

        // Exibindo as informações da conta após as operações
        System.out.println("\nApós as operações:");
        conta.exibirInformacoes();
    }
}
