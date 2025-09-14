package condicionais;
import java.util.Scanner;
import java.util.Locale;

public class aprovacaoDisciplina {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite a nota 1° do aluno: ");
        float nota1 = sc.nextFloat();

        System.out.print("Digite a nota 2° do aluno: ");
        float nota2 = sc.nextFloat();

        System.out.print("Digite a nota 3° do aluno: ");
        float nota3 = sc.nextFloat();

        System.out.print("Digite a nota 4° do aluno: ");
        float nota4 = sc.nextFloat();

        float media = (nota1 + nota2 + nota3 + nota4) / 4;

        if (media >= 7.0) {
            System.out.printf("Média: %.2f - Aluno aprovado!\n", media);
        } else {
            System.out.printf("Média: %.2f - Aluno reprovado.\n", media);
        }
    }
}
