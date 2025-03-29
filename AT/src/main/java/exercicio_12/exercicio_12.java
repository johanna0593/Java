package exercicio_12;

import java.util.Scanner;

public class exercicio_12 {

    // Método Start para iniciar o chat
    public void Start() {
        Scanner scanner = new Scanner(System.in);

        // Solicitar os nomes dos usuários
        System.out.print("Digite o nome do primeiro usuário: ");
        String usuario1 = scanner.nextLine();
        System.out.print("Digite o nome do segundo usuário: ");
        String usuario2 = scanner.nextLine();

        // Criar um array para armazenar as mensagens
        String[] mensagens = new String[10];
        int contador = 0;

        // Alternar o envio de mensagens entre os dois usuários
        while (contador < 10) {
            if (contador % 2 == 0) {
                // Usuario 1 envia mensagem
                System.out.print(usuario1 + ", digite sua mensagem: ");
                mensagens[contador] = scanner.nextLine();
            } else {
                // Usuario 2 envia mensagem
                System.out.print(usuario2 + ", digite sua mensagem: ");
                mensagens[contador] = scanner.nextLine();
            }
            contador++;
        }

        // Exibir o histórico de mensagens
        System.out.println("\n===== Histórico de Mensagens =====");
        for (int i = 0; i < mensagens.length; i++) {
            if (i % 2 == 0) {
                System.out.println(usuario1 + ": " + mensagens[i]);
            } else {
                System.out.println(usuario2 + ": " + mensagens[i]);
            }
        }

        // Mensagem de despedida
        System.out.println("\nObrigado por utilizarem o sistema! Boa sorte para vocês! 🚀");

        scanner.close();
    }
}
