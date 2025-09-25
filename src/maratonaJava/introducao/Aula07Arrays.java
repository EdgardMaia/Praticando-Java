package maratonaJava.introducao;
import java.util.Scanner;

public class Aula07Arrays {
    public static void main(String[] args) {
        int[] idades = new int[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < idades.length; i++) {
            System.out.print(String.format("Digite a idade %d: ", i + 1));
            idades[i] = sc.nextInt();
        }
        System.out.println("\nIdades informadas");
        for (int idade : idades) {
            System.out.println(idade);
        }

        sc.close();
    }
}
