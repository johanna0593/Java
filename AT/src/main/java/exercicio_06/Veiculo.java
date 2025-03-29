package exercicio_06;

public class Veiculo {
    // Atributos
    private String placa;
    private String modelo;
    private int anoFabricacao;
    private double quilometragem;

    // Construtor
    public Veiculo(String placa, String modelo, int anoFabricacao, double quilometragem) {
        this.placa = placa;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.quilometragem = quilometragem;
    }

    // Método para exibir os detalhes do veículo
    public void exibirDetalhes() {
        System.out.println("Detalhes do Veículo:");
        System.out.println("Placa: " + placa);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano de Fabricação: " + anoFabricacao);
        System.out.println("Quilometragem: " + quilometragem + " km");
        System.out.println();
    }

    // Método para registrar a viagem e adicionar a quilometragem
    public void registrarViagem(double km) {
        if (km > 0) {
            quilometragem += km;
            System.out.println("Viagem registrada! Quilometragem atual: " + quilometragem + " km");
        } else {
            System.out.println("Valor de quilometragem inválido.");
        }
    }

    // Método main para testar o sistema
    public static void main(String[] args) {
        // Criando dois veículos com dados fictícios
        Veiculo veiculo1 = new Veiculo("ABC-1234", "Fusca", 1982, 150000);
        Veiculo veiculo2 = new Veiculo("XYZ-5678", "Civic", 2020, 30000);

        // Exibindo detalhes dos veículos
        veiculo1.exibirDetalhes();
        veiculo2.exibirDetalhes();

        // Registrando viagens para os veículos
        veiculo1.registrarViagem(120);
        veiculo2.registrarViagem(200);

        // Exibindo detalhes novamente para verificar a atualização da quilometragem
        veiculo1.exibirDetalhes();
        veiculo2.exibirDetalhes();
    }
}
