package screenMatch;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("---- Bem-vindo ao Screen Match -----");
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Digite o nome do filme: ");
        String nomeDoFilme = sc.nextLine();
        System.out.print("Digite o ano de lançamento: ");
        int anoDeLancamento = sc.nextInt();
        System.out.print("Nota do filme: ");
        double notaDoFilme = sc.nextDouble();

        System.out.printf("""
            \n---- Detalhes do Filme -----
            Nome: %s
            Ano de Lançamento: %d
            Nota: %.2f
            """, nomeDoFilme, anoDeLancamento, notaDoFilme);
    }
}
