package exercicio_09;

import java.util.Scanner;

// Classe ContaBancaria
class ContaBancaria {
    private String titular;
    private double saldo;

    // Construtor da classe ContaBancaria
    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    // Método para depositar um valor na conta
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    // Método para sacar um valor da conta, com validação de saldo suficiente
    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para realizar o saque.");
        }
    }

    // Método para exibir o saldo da conta
    public void exibirSaldo() {
        System.out.println("Saldo atual: R$ " + saldo);
    }
}

// Classe principal para testar a ContaBancaria
public class exercicio_09 {
    public static void Start() {
        // Criando uma conta bancária com titular "Johanna Liza" e saldo inicial de R$ 1000
        ContaBancaria conta = new ContaBancaria("Johanna Liza", 1000);

        // Exibindo o saldo inicial
        conta.exibirSaldo();

        // Realizando algumas operações
        conta.depositar(500);  // Depósito de R$ 500
        conta.exibirSaldo();   // Exibe o saldo após o depósito

        conta.sacar(200);      // Saque de R$ 200
        conta.exibirSaldo();   // Exibe o saldo após o saque

        conta.sacar(2000);     // Tentando sacar mais do que o saldo
        conta.exibirSaldo();   // Exibe o saldo após a tentativa de saque

        conta.depositar(-100); // Tentando fazer um depósito negativo
    }
}
