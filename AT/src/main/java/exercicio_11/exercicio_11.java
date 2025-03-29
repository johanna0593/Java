package exercicio_11;

import java.util.Random;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class exercicio_11 {

    public void Start() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Gerar 6 números aleatórios entre 1 e 60
        Set<Integer> numerosSorteados = new HashSet<>();
        while (numerosSorteados.size() < 6) {
            int numero = random.nextInt(60) + 1;
            numerosSorteados.add(numero);
        }

        // Exibir os números sorteados (para controle)
        System.out.println("Números sorteados: " + numerosSorteados);

        // Pedir para o usuário inserir 6 números
        Set<Integer> numerosUsuario = new HashSet<>();
        System.out.println("Digite 6 números entre 1 e 60:");
        while (numerosUsuario.size() < 6) {
            System.out.print("Número " + (numerosUsuario.size() + 1) + ": ");
            int numero = scanner.nextInt();
            if (numero < 1 || numero > 60) {
                System.out.println("Número inválido. Digite um número entre 1 e 60.");
            } else {
                numerosUsuario.add(numero);
            }
        }

        // Comparar os números e contar os acertos
        Set<Integer> acertos = new HashSet<>(numerosUsuario);
        acertos.retainAll(numerosSorteados);

        // Exibir resultados
        System.out.println("Você acertou " + acertos.size() + " número(s): " + acertos);

        scanner.close();
    }
}
