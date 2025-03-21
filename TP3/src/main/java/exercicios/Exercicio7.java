package exercicios;

public class Exercicio7 {
    public static void main(String[] args) {
        // Criando uma conta bancária
        Conta conta = new Conta("João Silva", 123456, "Agência Central", 5000.00, "01/01/2023");

        // Exibindo as informações da conta
        conta.exibirInformacoes();

        // Realizando um saque
        conta.sacar(1000.00);

        // Realizando um depósito
        conta.depositar(500.00);

        // Exibindo as informações da conta novamente para verificar as atualizações
        conta.exibirInformacoes();
    }

    // Classe Conta
    public static class Conta {
        private String titular;
        private int numero;
        private String agencia;
        private double saldo;
        private String dataAbertura;

        // Construtor para inicializar a conta
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
}
