package exercicios;

public class Exercicio4 {
    public static void main(String[] args) {
        // Instanciando o objeto Produto e atribuindo valores iniciais
        Produto produto = new Produto("Celular", 1500.00, 10);

        // Exibir informações iniciais
        produto.exibirInformacoes();

        // Alterar preço e quantidade
        produto.alterarPreco(1800.00);
        produto.alterarQuantidade(15);

        // Exibir informações atualizadas
        produto.exibirInformacoes();
    }

    // Classe Produto
    public static class Produto {
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

        // Método para alterar o preço
        public void alterarPreco(double novoPreco) {
            if (novoPreco > 0) {
                this.preco = novoPreco;
                System.out.println("Preço atualizado para: R$" + preco);
            } else {
                System.out.println("Erro: O preço deve ser maior que zero.");
            }
        }

        // Método para alterar a quantidade em estoque
        public void alterarQuantidade(int novaQuantidade) {
            if (novaQuantidade >= 0) {
                this.quantidadeEmEstoque = novaQuantidade;
                System.out.println("Quantidade em estoque atualizada para: " + quantidadeEmEstoque);
            } else {
                System.out.println("Erro: A quantidade em estoque não pode ser negativa.");
            }
        }

        // Método para exibir informações
        public void exibirInformacoes() {
            System.out.println("\nProduto: " + nome);
            System.out.println("Preço: R$" + preco);
            System.out.println("Quantidade em Estoque: " + quantidadeEmEstoque);
        }
    }
}
