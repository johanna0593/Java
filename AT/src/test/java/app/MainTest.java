package app;

import static org.junit.jupiter.api.Assertions.*;

import io.javalin.Javalin;
import org.junit.jupiter.api.*;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class MainTest {

    private static Javalin app;
    private static String baseUrl;
    private static HttpClient client;

    @BeforeAll
    static void beforeAll() {
        app = Javalin.create(cfg -> cfg.showJavalinBanner = false);
        Main.registerRoutes(app);
        var server = app.start(0);      // porta aleatória
        int port = server.port();
        baseUrl = "http://localhost:" + port;
        client = HttpClient.newHttpClient();
    }

    @AfterAll
    static void afterAll() {
        app.stop();
    }

    @Test
    @Order(1)
    void testHelloEndpoint() throws IOException, InterruptedException {
        var request = HttpRequest.newBuilder()
                .uri(URI.create(baseUrl + "/hello"))
                .GET()
                .build();
        var response = client.send(request, HttpResponse.BodyHandlers.ofString());
        assertEquals(200, response.statusCode());
        assertEquals("Hello, Javalin!", response.body());
    }

    @Test
    @Order(2)
    void testCreateAndGetUsuario() throws IOException, InterruptedException {
        String json = "{\"nome\":\"Teste\",\"email\":\"t@ex.com\",\"idade\":21}";
        var postReq = HttpRequest.newBuilder()
                .uri(URI.create(baseUrl + "/usuarios"))
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(json))
                .build();
        var postRes = client.send(postReq, HttpResponse.BodyHandlers.ofString());
        assertEquals(201, postRes.statusCode());
        assertTrue(postRes.body().contains("\"email\":\"t@ex.com\""));

        var getReq = HttpRequest.newBuilder()
                .uri(URI.create(baseUrl + "/usuarios/t@ex.com"))
                .GET()
                .build();
        var getRes = client.send(getReq, HttpResponse.BodyHandlers.ofString());
        assertEquals(200, getRes.statusCode());
        assertTrue(getRes.body().contains("\"nome\":\"Teste\""));
    }

    @Test
    @Order(3)
    void testListUsuarios() throws IOException, InterruptedException {
        // garante que existe pelo menos 1 usuário
        String json = "{\"nome\":\"ListTest\",\"email\":\"list@ex.com\",\"idade\":25}";
        var postReq = HttpRequest.newBuilder()
                .uri(URI.create(baseUrl + "/usuarios"))
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(json))
                .build();
        client.send(postReq, HttpResponse.BodyHandlers.ofString());

        var request = HttpRequest.newBuilder()
                .uri(URI.create(baseUrl + "/usuarios"))
                .GET()
                .build();
        var response = client.send(request, HttpResponse.BodyHandlers.ofString());
        assertEquals(200, response.statusCode());
        String body = response.body();
        assertTrue(body.startsWith("["));
        assertTrue(body.contains("list@ex.com"), "Array JSON deve conter o usuário criado");
    }

    @Test
    @Order(4)
    void testGetNonexistentUsuario() throws IOException, InterruptedException {
        var request = HttpRequest.newBuilder()
                .uri(URI.create(baseUrl + "/usuarios/naoexiste@example.com"))
                .GET()
                .build();
        var response = client.send(request, HttpResponse.BodyHandlers.ofString());
        assertEquals(404, response.statusCode());
        assertTrue(response.body().contains("Usuário não encontrado"));
    }
}
