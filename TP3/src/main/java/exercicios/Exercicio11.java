package exercicios;

// Classe principal Exercicio11 que testa as outras classes
public class Exercicio11 {
    public static void main(String[] args) {
        // Criando um objeto da classe Circulo com raio 5
        Circulo circulo = new Circulo(5);  // Utiliza a classe Circulo de Exercicio10.java
        System.out.println("Raio do Círculo: " + circulo.getRaio());

        // Criando um objeto da classe Esfera com raio 7
        Esfera esfera = new Esfera(7);  // Utiliza a classe Esfera de Exercicio10.java
        System.out.println("Raio da Esfera: " + esfera.getRaio());

        // Modificando o raio do Círculo e da Esfera
        circulo.setRaio(10);
        esfera.setRaio(14);

        // Exibindo os novos raios
        System.out.println("Novo raio do Círculo: " + circulo.getRaio());
        System.out.println("Novo raio da Esfera: " + esfera.getRaio());
    }
}
