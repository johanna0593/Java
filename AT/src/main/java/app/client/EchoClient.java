package app.client;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class EchoClient {
    public static void main(String[] args) throws Exception {
        URL url = new URL("http://localhost:7000/echo");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("POST");
        con.setRequestProperty("Content-Type", "application/json");
        con.setDoOutput(true);

        String jsonInput = "{\"mensagem\":\"Olá do cliente!\"}";
        try (OutputStream os = con.getOutputStream()) {
            os.write(jsonInput.getBytes());
            os.flush();
        }

        int status = con.getResponseCode();
        System.out.println("HTTP Status: " + status);

        try (BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()))) {
            String line;
            System.out.println("Response body:");
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
        }
        con.disconnect();
    }
}
