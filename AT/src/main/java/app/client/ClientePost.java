import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class ClientePost {
    public static void main(String[] args) throws Exception {
        URL url = new URL("http://localhost:7000/usuarios"); // endpoint criação
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("POST");
        con.setRequestProperty("Content-Type", "application/json");
        con.setDoOutput(true);

        String jsonInput = "{\"nome\":\"Maria\",\"email\":\"maria@example.com\",\"idade\":30}";

        try (OutputStream os = con.getOutputStream()) {
            os.write(jsonInput.getBytes());
            os.flush();
        }

        int status = con.getResponseCode();
        System.out.println("Status HTTP: " + status);
        con.disconnect();
    }
}
