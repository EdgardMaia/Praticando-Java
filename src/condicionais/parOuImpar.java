package condicionais;
import java.util.Scanner;
import java.util.Locale;

public class parOuImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();
        String resultado;
        if (numero % 2 == 0) {
            resultado = String.format("O número %d é par.", numero);
        } else {
            resultado = String.format("O número %d é ímpar.", numero);
        }
        System.out.println(resultado);
    }
}
