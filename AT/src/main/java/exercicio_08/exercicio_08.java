package exercicio_08;

import java.util.Scanner;

// Classe Funcionario
class Funcionario {
    // Atributos da classe Funcionario
    protected String nome;
    protected double salarioBase;

    // Construtor da classe Funcionario
    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    // Método para calcular o salário (vai ser sobrescrito nas subclasses)
    public double calcularSalario() {
        return salarioBase;
    }

    // Método para exibir os dados do funcionário
    public void exibirDetalhes() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário Base: " + salarioBase);
    }
}

// Subclasse Gerente
class Gerente extends Funcionario {
    // Construtor da classe Gerente
    public Gerente(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    // Sobrescrita do método calcularSalario, aplicando bônus de 20%
    @Override
    public double calcularSalario() {
        return salarioBase * 1.20; // Bônus de 20%
    }
}

// Subclasse Estagiario
class Estagiario extends Funcionario {
    // Construtor da classe Estagiario
    public Estagiario(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    // Sobrescrita do método calcularSalario, aplicando desconto de 10%
    @Override
    public double calcularSalario() {
        return salarioBase * 0.90; // Desconto de 10%
    }
}

// Classe principal com o método main
public class exercicio_08 {
    public static void Start() {
        // Criando objetos de Gerente e Estagiario
        Funcionario gerente = new Gerente("Johanna Liza", 5000);
        Funcionario estagiario = new Estagiario("Ana Oliveira", 1500);

        // Exibindo os detalhes e os salários finais
        System.out.println("Gerente:");
        gerente.exibirDetalhes();
        System.out.println("Salário final: " + gerente.calcularSalario());

        System.out.println("\nEstagiário:");
        estagiario.exibirDetalhes();
        System.out.println("Salário final: " + estagiario.calcularSalario());
    }
}
