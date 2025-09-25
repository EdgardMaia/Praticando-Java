package estruturaDeRepeticao;
import java.util.ArrayList;

public class somaNumerosPares {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                numeros.add(i);
            }
        }
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println("A soma dos números pares é: " + soma);
    }
}
