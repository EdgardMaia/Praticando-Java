package condicionais;
import java.util.Locale;
import java.util.Scanner;

public class descontoCompras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Digite o valor total da compra: ");
        float valorCompra = sc.nextFloat();

        if (valorCompra <= 100.00) {
            System.out.println("Nenhum desconto aplicado.");
            System.out.printf("Valor final da compra: R$ %.2f\n", valorCompra);

        } else if (valorCompra > 100.00) {
            System.out.print("Quantidade do desconto (%): ");
            float desconto = sc.nextFloat();

            if (desconto > 0 && desconto <= 100) {
                float valorDesconto = (desconto / 100) * valorCompra;
                float valorFinal = valorCompra - valorDesconto;
                System.out.printf("Valor do desconto: R$ %.2f\n", valorDesconto);
                System.out.printf("Valor final da compra: R$ %.2f\n", valorFinal);
                
            } else {
                System.out.println("Desconto inválido.");
            }
        }
    }
}
