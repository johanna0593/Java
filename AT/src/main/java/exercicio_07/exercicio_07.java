package exercicio_07;

import java.util.Scanner;

public class exercicio_07 {

    public static void start(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar dados do aluno
        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();
        System.out.print("Digite a matrícula do aluno: ");
        String matricula = scanner.nextLine();
        System.out.print("Digite a nota 1 do aluno: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Digite a nota 2 do aluno: ");
        double nota2 = scanner.nextDouble();
        System.out.print("Digite a nota 3 do aluno: ");
        double nota3 = scanner.nextDouble();

        // Criar o objeto Aluno
        Aluno aluno = new Aluno(nome, matricula, nota1, nota2, nota3);

        // Exibir os detalhes do aluno
        aluno.exibirDetalhes();

        // Verificar aprovação do aluno
        aluno.verificarAprovacao();

        // Fechar o scanner
        scanner.close();
    }
}
