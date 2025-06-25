import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ClienteStatus {
    public static void main(String[] args) throws Exception {
        URL url = new URL("http://localhost:7000/status");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");

        int status = con.getResponseCode();
        System.out.println("Status HTTP: " + status);
        try (BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()))) {
            String line;
            System.out.println("Resposta:");
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
        }
        con.disconnect();
    }
}
