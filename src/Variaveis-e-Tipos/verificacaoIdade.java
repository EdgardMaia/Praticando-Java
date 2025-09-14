import java.util.Scanner;
import java.util.Locale;

public class verificacaoIdade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();
        String mensagem;
        if (idade >= 18) {
            mensagem = "Você é maior de idade.";
        } else {
            mensagem = "Você é menor de idade.";
        }
        System.out.println(mensagem);
    }
}
