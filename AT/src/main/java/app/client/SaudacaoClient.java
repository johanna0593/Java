package app.client;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class SaudacaoClient {
    public static void main(String[] args) throws Exception {
        String nome = "Johanna";
        URL url = new URL("http://localhost:7000/saudacao/" + nome);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");
        System.out.println("HTTP Status: " + con.getResponseCode());
        try (BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()))) {
            in.lines().forEach(System.out::println);
        }
        con.disconnect();
    }
}
