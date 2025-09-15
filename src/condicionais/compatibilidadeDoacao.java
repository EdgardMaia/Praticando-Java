package condicionais;
import java.util.Scanner;

public class compatibilidadeDoacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();
        System.out.print("Digite seu peso em kg: ");
        double peso = sc.nextDouble();

        if (idade >= 18 && idade <= 65 && peso > 50) {
            System.out.println("Você está apto a doar sangue.");
        } else {
            System.out.println("Você não está apto a doar sangue, idade recomendada, acima de 18 anos e abaixo de 65 anos, peso acima de 50kg.");
        }
    }
}
