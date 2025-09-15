package condicionais;
import java.util.Scanner;

public class intervaloNumerico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor do empréstimo: ");
        float valor = sc.nextFloat();

        if (valor >= 1000 && valor <= 5000) {
            System.out.printf("Empréstimo aprovado de R$%.2f%n.", valor);
        } else {
            System.out.println("Empréstimo negado, somente valores entre R$1000 e R$5000 são aceitos");
        }
    }
}
