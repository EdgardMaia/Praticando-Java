package estruturaDeRepeticao;
import java.util.Scanner;
import java.util.ArrayList;

public class somaNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        
        while (true) {
            System.out.print("Digite um número positivo (digite 's' para sair): ");
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("s")) {
                break;
            }
            try {
                int numero = Integer.parseInt(input);
                if (numero > 0) {
                    numeros.add(numero);

                } else {
                    System.out.println("Número inválido. Por favor, insira um número positivo.");
                    break;
                }
            } catch (Exception e) {
                System.out.println(String.format("Entrada inválida. Por favor, insira um número positivo. Detalhes: %s", e.getMessage()));
            }
        }
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println("A soma dos números positivos é: " + soma);
        sc.close();
    }
}
