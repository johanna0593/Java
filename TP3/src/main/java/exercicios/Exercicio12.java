package exercicios;

// Classe principal Exercicio12 que testa as outras classes
public class Exercicio12 {
    public static void main(String[] args) {
        // Instanciando um objeto da classe Circulo com raio 3.0
        Circulo circulo = new Circulo(3.0);
        // Exibindo o raio do círculo
        System.out.println("Raio do Círculo: " + circulo.getRaio());
        // Chamando o método para calcular a área do círculo e exibindo o resultado
        System.out.println("Área do Círculo: " + circulo.calcularArea());

        // Instanciando um objeto da classe Esfera com raio 5.0
        Esfera esfera = new Esfera(5.0);
        // Exibindo o raio da esfera
        System.out.println("Raio da Esfera: " + esfera.getRaio());
        // Chamando o método para calcular o volume da esfera e exibindo o resultado
        System.out.println("Volume da Esfera: " + esfera.calcularVolume());
    }
}
