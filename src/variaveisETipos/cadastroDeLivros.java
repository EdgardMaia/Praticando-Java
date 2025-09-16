package variaveisETipos;
import java.util.Locale;
import java.util.Scanner;

public class cadastroDeLivros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite o título do livro: ");
        String titulo = sc.nextLine();

        System.out.print("Digite o autor do livro: ");
        String autor = sc.nextLine();

        System.out.print("Quantidade de páginas: ");
        int quantidadePaginas = sc.nextInt();
        sc.nextLine(); // Consumir a nova linha

        System.out.print("Digite o ano de publicação: ");
        int anoPublicacao = sc.nextInt();
        sc.nextLine(); // Consumir a nova linha

        System.out.print("Digite o preço do livro: ");
        double preco = sc.nextDouble();
        sc.nextLine(); // Consumir a nova linha

        System.out.print("""
                Categoria do livro. As categorias disponíveis são:
                F - Ficção
                N - Não-ficção
                T - Tecnologia
                H - História
                """);
        System.out.print("Digite a categoria do livro (F/N/T/H): ");
        String categoria = sc.nextLine().toUpperCase();
        String categoriaDescricao;
 
        if (categoria.equals("F")) {
            categoriaDescricao = "Ficção";
        } else if (categoria.equals("N")) {
            categoriaDescricao = "Não-ficção";
        } else if (categoria.equals("T")) {
            categoriaDescricao = "Tecnologia";
        } else if (categoria.equals("H")) {
            categoriaDescricao = "História";
        } else {
            categoriaDescricao = "Categoria inválida";
        }

        System.out.printf("""
            Livro cadastrado:
            Título: %s
            Autor: %s
            Quantidade de páginas: %d
            Ano de Publicação: %d
            Preço: R$ %.2f
            Categoria: %s
            """,
            titulo, autor, quantidadePaginas, anoPublicacao, preco, categoriaDescricao);
    }
}
