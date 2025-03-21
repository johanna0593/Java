package exercicios;


// Classe Circulo
class Circulo {
    // Atributo raio do tipo double
    private double raio;

    // Construtor para inicializar o atributo raio
    public Circulo(double raio) {
        this.raio = raio;
    }

    // Getter para o atributo raio
    public double getRaio() {
        return raio;
    }

    // Setter para o atributo raio
    public void setRaio(double raio) {
        this.raio = raio;
    }

    // Método para calcular a área do círculo
    public double calcularArea() {
        return Math.PI * raio * raio;  // Fórmula para área do círculo (π * r^2)
    }
}

// Classe Esfera
class Esfera {
    // Atributo raio do tipo double
    private double raio;

    // Construtor para inicializar o atributo raio
    public Esfera(double raio) {
        this.raio = raio;
    }

    // Getter para o atributo raio
    public double getRaio() {
        return raio;
    }

    // Setter para o atributo raio
    public void setRaio(double raio) {
        this.raio = raio;
    }


    // Método para calcular o volume da esfera
    public double calcularVolume() {
        return (4/3.0) * Math.PI * Math.pow(raio, 3);  // Fórmula para volume da esfera (4/3 * π * r^3)
    }
}

// Classe TestaFormas para testar Circulo e Esfera
public class Exercicio10 {
    public static void main(String[] args) {
        // Criando um objeto da classe Circulo com raio 5
        Circulo circulo = new Circulo(5);
        System.out.println("Raio do Círculo: " + circulo.getRaio());

        // Criando um objeto da classe Esfera com raio 7
        Esfera esfera = new Esfera(7);
        System.out.println("Raio da Esfera: " + esfera.getRaio());

        // Modificando o raio do Círculo e da Esfera
        circulo.setRaio(10);
        esfera.setRaio(14);

        // Exibindo os novos raios
        System.out.println("Novo raio do Círculo: " + circulo.getRaio());
        System.out.println("Novo raio da Esfera: " + esfera.getRaio());
    }
}
