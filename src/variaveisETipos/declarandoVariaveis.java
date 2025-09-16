package variaveisETipos;
import java.util.Locale;
import java.util.Scanner;

public class declarandoVariaveis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();
        
        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();
        sc.nextLine();

        System.out.print("Digite sua altura em metros: ");
        float altura = sc.nextFloat();
        sc.nextLine();

        System.out.print("É estudante? (S/N):");
        String resposta = sc.nextLine();
        String estudante;

        if (resposta.equalsIgnoreCase("S")) {
            estudante = "Você é estudante.";
        } else {
            estudante = "Você não é estudante.";
        }

        System.out.printf("Nome: %s\nIdade: %d\nAltura: %.2f metros\n%s\n", nome, idade, altura, estudante);
    }
}
