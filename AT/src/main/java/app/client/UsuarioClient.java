package app.client;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class UsuarioClient {
    public static void main(String[] args) throws Exception {
        // 1) Criar
        URL postUrl = new URL("http://localhost:7000/usuarios");
        HttpURLConnection postCon = (HttpURLConnection) postUrl.openConnection();
        postCon.setRequestMethod("POST");
        postCon.setRequestProperty("Content-Type", "application/json");
        postCon.setDoOutput(true);
        String userJson = "{\"nome\":\"Cliente\",\"email\":\"cli@ex.com\",\"idade\":28}";
        try (OutputStream os = postCon.getOutputStream()) {
            os.write(userJson.getBytes());
        }
        System.out.println("Create status: " + postCon.getResponseCode());
        postCon.disconnect();

        // 2) Listar todos
        URL getAllUrl = new URL("http://localhost:7000/usuarios");
        HttpURLConnection getAllCon = (HttpURLConnection) getAllUrl.openConnection();
        getAllCon.setRequestMethod("GET");
        System.out.println("\nList status: " + getAllCon.getResponseCode());
        try (BufferedReader in = new BufferedReader(new InputStreamReader(getAllCon.getInputStream()))) {
            in.lines().forEach(System.out::println);
        }
        getAllCon.disconnect();

        // 3) Buscar por email
        URL getUrl = new URL("http://localhost:7000/usuarios/cli@ex.com");
        HttpURLConnection getCon = (HttpURLConnection) getUrl.openConnection();
        getCon.setRequestMethod("GET");
        System.out.println("\nGet status: " + getCon.getResponseCode());
        try (BufferedReader in = new BufferedReader(new InputStreamReader(getCon.getInputStream()))) {
            in.lines().forEach(System.out::println);
        }
        getCon.disconnect();
    }
}
