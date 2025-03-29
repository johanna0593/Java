package exercicio_04;

import java.util.Scanner;

public class exercicio_04 {
    public void Start() {  // Alterado para Start() para ser chamado no Start.java
        Scanner scanner = new Scanner(System.in);

        // Solicita o nome do cliente
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        // Solicita o valor do empréstimo
        double valorEmprestimo = 0;
        boolean valorValido = false;
        while (!valorValido) {
            try {
                System.out.print("Digite o valor do empréstimo: R$ ");
                valorEmprestimo = scanner.nextDouble();
                if (valorEmprestimo <= 0) {
                    System.out.println("O valor do empréstimo deve ser maior que zero.");
                } else {
                    valorValido = true;
                }
            } catch (Exception e) {
                System.out.println("Entrada inválida. Por favor, insira um valor numérico válido.");
                scanner.nextLine();  // Limpa o buffer do scanner
            }
        }

        // Solicita a quantidade de parcelas
        int parcelas = 0;
        boolean parcelasValidas = false;
        while (!parcelasValidas) {
            try {
                System.out.print("Digite a quantidade de parcelas (mínimo 6, máximo 48): ");
                parcelas = scanner.nextInt();
                if (parcelas < 6 || parcelas > 48) {
                    System.out.println("A quantidade de parcelas deve ser entre 6 e 48.");
                } else {
                    parcelasValidas = true;
                }
            } catch (Exception e) {
                System.out.println("Entrada inválida. Por favor, insira um número válido de parcelas.");
                scanner.nextLine();  // Limpa o buffer do scanner
            }
        }

        // Calcular o valor com juros
        double taxaJuros = 0.03;  // Juros de 3% ao mês
        double valorComJuros = valorEmprestimo * Math.pow(1 + taxaJuros, parcelas);  // Fórmula de juros compostos
        double parcelaMensal = valorComJuros / parcelas;

        // Exibe o resultado
        System.out.println("\n----- Resultado do Empréstimo -----");
        System.out.println("Nome do Cliente: " + nome);
        System.out.println("Valor do Empréstimo: R$ " + valorEmprestimo);
        System.out.println("Número de Parcelas: " + parcelas);
        System.out.println("Valor Total Pago: R$ " + valorComJuros);
        System.out.println("Valor da Parcela Mensal: R$ " + parcelaMensal);

        scanner.close();
    }
}
