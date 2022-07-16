import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class App {
    public static void main(String[] args) throws Exception {
        var url = "https://imdb-api.com/en/API/Top250Movies/k_1s37r10p";
        var cliente = HttpClient.newHttpClient();
        var request = HttpRequest.newBuilder(URI.create(url)).build();
        String json = cliente.send(request, HttpResponse.BodyHandlers.ofString()).body();
        
        System.out.println(json);
    }
}
