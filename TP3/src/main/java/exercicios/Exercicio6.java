package exercicios;

public class Exercicio6 {
    public static void main(String[] args) {
        // Criando um objeto Produto usando o construtor
        Produto produto = new Produto("Celular", 1500.00, 10);

        // Exibir informações do produto
        produto.exibirInformacoes();
    }

    // Classe Produto
    public static class Produto {
        private String nome;
        private double preco;
        private int quantidadeEmEstoque;

        // Construtor que recebe os parâmetros nome, preco e quantidadeEmEstoque
        public Produto(String nome, double preco, int quantidadeEmEstoque) {
            this.nome = nome; // Atribui o valor do parâmetro nome ao atributo nome
            this.preco = preco; // Atribui o valor do parâmetro preco ao atributo preco
            this.quantidadeEmEstoque = quantidadeEmEstoque; // Atribui o valor do parâmetro quantidadeEmEstoque ao atributo quantidadeEmEstoque
        }

        // Método para exibir as informações do produto
        public void exibirInformacoes() {
            System.out.println("\nProduto: " + nome);
            System.out.println("Preço: R$" + preco);
            System.out.println("Quantidade em Estoque: " + quantidadeEmEstoque);
        }

        // Métodos Getters para acessar os valores dos atributos
        public String getNome() {
            return nome;
        }

        public double getPreco() {
            return preco;
        }

        public int getQuantidadeEmEstoque() {
            return quantidadeEmEstoque;
        }

        // Métodos Setters para alterar os valores dos atributos
        public void setNome(String nome) {
            this.nome = nome;
        }

        public void setPreco(double preco) {
            if (preco > 0) {
                this.preco = preco;
            } else {
                System.out.println("Erro: O preço deve ser maior que zero.");
            }
        }

        public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
            if (quantidadeEmEstoque >= 0) {
                this.quantidadeEmEstoque = quantidadeEmEstoque;
            } else {
                System.out.println("Erro: A quantidade em estoque não pode ser negativa.");
            }
        }
    }
}
