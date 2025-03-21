package exercicios;

// Definição da classe Carro
public class Exercicio1 {
    // Atributos (ou Campos)
    String modelo;
    int ano;

    // Método para exibir informações do carro
    void exibirDetalhes() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }

    // Método main para testar a classe Carro
    public static void main(String[] args) {
        // Instanciando um objeto Carro
        Exercicio1 carro = new Exercicio1();

        // Atribuindo valores aos atributos
        carro.modelo = "Fusca";
        carro.ano = 1980;

        // Chamando o método para exibir detalhes
        carro.exibirDetalhes();
    }
}
