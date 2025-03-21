package exercicios;

public class Exercicio5 {
    public static void main(String[] args) {
        // Instanciando o objeto Produto e atribuindo valores iniciais
        Produto produto = new Produto("Celular", 1500.00, 10);

        // Exibir informações iniciais
        produto.exibirInformacoes();

        // Alterando valores usando os setters
        produto.setPreco(1800.00);
        produto.setQuantidadeEmEstoque(20);

        // Exibir informações após alteração
        produto.exibirInformacoes();

        // Acessando valores usando os getters
        System.out.println("\nAcessando valores via getters:");
        System.out.println("Nome: " + produto.getNome());
        System.out.println("Preço: R$" + produto.getPreco());
        System.out.println("Quantidade em Estoque: " + produto.getQuantidadeEmEstoque());
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

        // Getters (métodos de leitura)
        public String getNome() {
            return nome;
        }

        public double getPreco() {
            return preco;
        }

        public int getQuantidadeEmEstoque() {
            return quantidadeEmEstoque;
        }

        // Setters (métodos de atualização)
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

        // Método para exibir informações
        public void exibirInformacoes() {
            System.out.println("\nProduto: " + nome);
            System.out.println("Preço: R$" + preco);
            System.out.println("Quantidade em Estoque: " + quantidadeEmEstoque);
        }
    }
}
