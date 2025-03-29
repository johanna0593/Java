package exercicio_02;

import java.util.Scanner;
import java.util.regex.Pattern;

public class exercicio_02 {
    public void Start() {  // Alterado de main() para Start() para chamar do Start.java
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        String senha;
        boolean senhaValida;

        do {
            System.out.print("Digite sua senha: ");
            senha = scanner.nextLine();

            senhaValida = validarSenha(senha);

            if (!senhaValida) {
                System.out.println("Senha inválida! Certifique-se de que sua senha atenda aos seguintes requisitos:");
                System.out.println("- Pelo menos 8 caracteres");
                System.out.println("- Pelo menos uma letra maiúscula");
                System.out.println("- Pelo menos um número");
                System.out.println("- Pelo menos um caractere especial (@, #, $, etc.)");
                System.out.println("Tente novamente.\n");
            }

        } while (!senhaValida);

        System.out.println("Senha cadastrada com sucesso!");
        scanner.close();
    }

    public static boolean validarSenha(String senha) {
        if (senha.length() < 8) {
            return false;
        }

        String regexMaiuscula = ".*[A-Z].*";
        String regexNumero = ".*\\d.*";
        String regexEspecial = ".*[@#$%^&+=!].*";

        return Pattern.matches(regexMaiuscula, senha) &&
                Pattern.matches(regexNumero, senha) &&
                Pattern.matches(regexEspecial, senha);
    }
}
