package screenMatch.principal;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

import com.google.gson.Gson;
import screenMatch.modelos.Titulo;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("\nDigite o nome do filme que deseja buscar: ");
            String busca = sc.nextLine();

            String buscaCodificada = URLEncoder.encode(busca, StandardCharsets.UTF_8);
            String endereco = String.format("https://www.omdbapi.com/?t=%s&apikey=8e0be2d5", buscaCodificada);
            System.out.println("\nBuscando: " + endereco);

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .build();

            HttpResponse<String> response = client.send(request, BodyHandlers.ofString());

            System.out.println("\n" + "=".repeat(80));
            System.out.println("RESULTADO DA BUSCA");
            System.out.println("=".repeat(80));
            String json = response.body();     // <- nome diferente
            System.out.println(json);
            System.out.println("=".repeat(80));

            Gson gson = new Gson();
            Titulo titulo = gson.fromJson(json, Titulo.class); // <- agora é Titulo

            // Pode vir nulo se o OMDb responder "Response":"False"
            if (titulo != null && titulo.getNome() != null) {
                System.out.printf("""
                    Nome: %s
                    Duração: %d
                    Ano de Lançamento: %d    
                    """, titulo.getNome(), titulo.getDuracaoEmMinutos(), titulo.getAnoDeLancamento());
            } else {
                System.out.println("Filme não encontrado ou resposta inválida.");
            }
        }
    }
}
