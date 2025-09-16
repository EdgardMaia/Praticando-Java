package variaveisETipos;
import java.util.Locale;
import java.util.Scanner;

public class conversorDeDolares {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in).useLocale(Locale.US);
      System.out.print("Digite o valor me reais para converter em dolares: ");
      float valorEmReais = sc.nextFloat();
      float taxaCambio = 5.35f;
      float valorEmDolares = valorEmReais / taxaCambio;
      System.out.printf("O valor em dolares é: US$%.2f\n", valorEmDolares);
    }
}