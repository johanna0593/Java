package exercicio_05;

public class exercicio_05 {
    public static void Start() {
        // Imprimindo os headers HTTP
        System.out.println("Content-Type: text/html\n");  // Header obrigatório com linha em branco após

        // Corpo da resposta em HTML
        System.out.println("<html>");
        System.out.println("<head><title>Saudação CGI</title></head>");
        System.out.println("<body>");
        System.out.println("<h1>Olá, Terráqueos!</h1>");
        System.out.println("</body>");
        System.out.println("</html>");
    }
}
