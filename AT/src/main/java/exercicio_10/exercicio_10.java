package exercicio_10;

import java.io.*;
import java.util.Scanner;

public class exercicio_10 {

    public void Start() {
        Scanner scanner = new Scanner(System.in);

        // Criar ou abrir o arquivo para salvar as compras
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("compras.txt", true))) {

            for (int i = 1; i <= 3; i++) {
                // Solicitar dados do usuário
                System.out.println("Cadastro da " + i + "ª compra:");

                System.out.print("Produto: ");
                String produto = scanner.nextLine();

                System.out.print("Quantidade: ");
                int quantidade = Integer.parseInt(scanner.nextLine());

                System.out.print("Preço Unitário: ");
                double precoUnitario = Double.parseDouble(scanner.nextLine());

                // Escrever no arquivo
                writer.write("Produto: " + produto + ", Quantidade: " + quantidade + ", Preço Unitário: " + precoUnitario);
                writer.newLine();
            }

            System.out.println("\nCompras registradas com sucesso no arquivo.");

        } catch (IOException e) {
            System.out.println("Erro ao acessar o arquivo: " + e.getMessage());
        }

        // Agora, ler o arquivo e exibir os dados registrados
        System.out.println("\nCompras registradas:");
        try (BufferedReader reader = new BufferedReader(new FileReader("compras.txt"))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }

        scanner.close();
    }
}
