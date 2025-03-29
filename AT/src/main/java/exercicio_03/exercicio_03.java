package exercicio_03;

import java.util.Scanner;

public class exercicio_03 {
    public void Start() {  // Alterado para Start() para ser chamado no Start.java
        Scanner scanner = new Scanner(System.in);

        // Solicita o nome
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();  // Lê o nome do usuário

        // Solicita o salário
        double salarioMensal = 0;
        boolean salarioValido = false;
        while (!salarioValido) {
            try {
                System.out.print("Digite seu salário mensal: R$ ");
                salarioMensal = scanner.nextDouble();  // Lê o salário mensal
                scanner.nextLine(); // Consumindo a quebra de linha pendente
                salarioValido = true;  // Se a entrada for válida, sai do loop
            } catch (Exception e) {
                System.out.println("Entrada inválida. Por favor, insira um valor numérico para o salário.");
                scanner.nextLine();  // Limpa o buffer do scanner
            }
        }

        // Calculando o imposto
        double salarioAnual = salarioMensal * 12;
        double imposto = calcularImposto(salarioAnual);
        double salarioLiquido = salarioAnual - imposto;

        // Exibe os resultados
        System.out.println("\n----- Resultado -----");
        System.out.println("Nome: " + nome);
        System.out.println("Salário Anual: R$ " + salarioAnual);
        System.out.println("Imposto a ser pago: R$ " + imposto);
        System.out.println("Salário Líquido: R$ " + salarioLiquido);

        scanner.close();
    }

    public static double calcularImposto(double salarioAnual) {
        double imposto = 0;

        if (salarioAnual <= 22847.76) {
            imposto = 0;
        } else if (salarioAnual <= 33919.80) {
            imposto = salarioAnual * 0.075;
        } else if (salarioAnual <= 45012.60) {
            imposto = salarioAnual * 0.15;
        } else {
            imposto = salarioAnual * 0.275;
        }

        return imposto;
    }
}
