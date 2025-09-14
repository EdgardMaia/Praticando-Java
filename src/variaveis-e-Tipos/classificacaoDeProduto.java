import java.util.Locale;
import java.util.Scanner;

public class classificacaoDeProduto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Digite o preço do produto: ");
        float precoProduto = sc.nextFloat();
        sc.nextLine(); // Consumir a nova linha
        String qualidade;

        if (precoProduto <= 50.00) {
            qualidade = "Produto econômico";
        } else if (precoProduto > 50.00 && precoProduto <= 200.00) {
            qualidade = "Produto intermediário";
        } else {
            qualidade = "Produto premium";
        }

        System.out.printf("""
            Preço do produto: R$ %.2f
            Qualidade: %s
            """, precoProduto, qualidade);
    }
}
