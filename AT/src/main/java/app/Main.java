package app;

import io.javalin.Javalin;
import java.time.LocalDateTime;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Cria a app e registra rotas
        Javalin app = Javalin.create();
        registerRoutes(app);
        app.start(7000);
    }

    /**
     * Registra todos os endpoints da API
     */
    public static void registerRoutes(Javalin app) {
        // Endpoint /hello
        app.get("/hello", ctx -> ctx.result("Hello, Javalin!"));

        // Endpoint /status
        app.get("/status", ctx ->
                ctx.json(new Status("ok", LocalDateTime.now().toString()))
        );

        // Endpoint /echo
        app.post("/echo", ctx -> {
            Mensagem m = ctx.bodyAsClass(Mensagem.class);
            ctx.json(m);
        });

        // Endpoint /saudacao/{nome}
        app.get("/saudacao/{nome}", ctx -> {
            ctx.json(new Saudacao("Olá, " + ctx.pathParam("nome") + "!"));
        });

        // Endpoint POST /usuarios
        app.post("/usuarios", ctx -> {
            Usuario usuario = ctx.bodyAsClass(Usuario.class);
            usuarios.add(usuario);
            ctx.status(201).json(usuario);
        });

        // Endpoint GET /usuarios
        app.get("/usuarios", ctx -> ctx.json(usuarios));

        // Endpoint GET /usuarios/{email}
        app.get("/usuarios/{email}", ctx -> {
            String email = ctx.pathParam("email");
            Usuario encontrado = usuarios.stream()
                    .filter(u -> u.email.equals(email))
                    .findFirst()
                    .orElse(null);
            if (encontrado != null) {
                ctx.json(encontrado);
            } else {
                ctx.status(404).json(Map.of("erro", "Usuário não encontrado"));
            }
        });
    }

    // Records auxiliares
    public record Status(String status, String timestamp) {}
    public record Mensagem(String mensagem) {}
    public record Saudacao(String mensagem) {}

    // Classe de domínio Usuario
    public static class Usuario {
        public String nome;
        public String email;
        public int idade;

        // Construtor padrão para Jackson
        public Usuario() {}

        public Usuario(String nome, String email, int idade) {
            this.nome = nome;
            this.email = email;
            this.idade = idade;
        }
    }

    // Armazenamento em memória
    private static List<Usuario> usuarios = new ArrayList<>();
}
