package condicionais;
import java.util.Scanner;

public class caparandoNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o 1° número inteiro: ");
        int num1 = sc.nextInt();
        System.out.print("Digite o 2° número inteiro: ");
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.printf("O número %d é maior que %d.\n", num1, num2);
        } else if (num2 > num1) {
            System.out.printf("O número %d é maior que %d.\n", num2, num1);
        } else {
            System.out.println("Os números são iguais.");
        }
    }
}
