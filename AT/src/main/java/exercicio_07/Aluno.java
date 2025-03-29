package exercicio_07;

public class Aluno {
    // Atributos
    private String nome;
    private String matricula;
    private double nota1, nota2, nota3;

    // Construtor
    public Aluno(String nome, String matricula, double nota1, double nota2, double nota3) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    // Método para calcular a média
    public double calcularMedia() {
        return (nota1 + nota2 + nota3) / 3;
    }

    // Método para verificar aprovação
    public void verificarAprovacao() {
        double media = calcularMedia();
        if (media >= 7.0) {
            System.out.println("Aluno " + nome + " aprovado!");
        } else {
            System.out.println("Aluno " + nome + " reprovado.");
        }
    }

    // Método para exibir os detalhes do aluno
    public void exibirDetalhes() {
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Notas: " + nota1 + ", " + nota2 + ", " + nota3);
        System.out.println("Média: " + calcularMedia());
    }
}
