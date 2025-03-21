package exercicios;

public class Exercicio2 {
    public static void main(String[] args) {
        Exercicio3.Produto produto = new Exercicio3.Produto("Celular", 1500.00, 10);
        produto.exibirInformacoes();
    }
}

class Produto {
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    // Construtor
    public Produto(String nome, double preco, int quantidadeEmEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    // Método para exibir informações
    public void exibirInformacoes() {
        System.out.println("Exercicio3.Produto: " + nome);
        System.out.println("Preço: R$" + preco);
        System.out.println("Quantidade em Estoque: " + quantidadeEmEstoque);
    }
}
