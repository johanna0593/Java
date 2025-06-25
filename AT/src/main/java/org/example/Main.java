package org.example;

import io.javalin.Javalin;

public class Main {

    public static void main(String[] args) {
        Javalin app = Javalin.create(cfg -> cfg.showJavalinBanner = false);

        // Registra rotas da API
        app.get("/hello", ctx -> ctx.result("Hello, Javalin!"));

        // Exemplo de rota POST /usuarios para criação (você deve implementar conforme o seu modelo)
        app.post("/usuarios", ctx -> {
            // Aqui você deve implementar lógica para ler JSON, salvar e responder 201
            ctx.status(201).result("Usuário criado");
        });

        // Inicia servidor na porta 7000
        app.start(7000);

        System.out.println("Listening on http://localhost:7000/");
    }
}
