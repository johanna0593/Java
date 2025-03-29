package exercicio_06;

public class exercicio_06 {
    // Método Start para ser chamado na classe Start
    public void Start() {
        // Criando dois veículos
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

