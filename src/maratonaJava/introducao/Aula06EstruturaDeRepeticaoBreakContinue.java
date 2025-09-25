package maratonaJava.introducao;

import java.util.Locale;
import java.util.Scanner;

public class Aula06EstruturaDeRepeticaoBreakContinue {
    // Dado valor de um carro descubra quantas vezes ele pode ser parcelado
    // Condição valor da parcela tem que ser >= 1000
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Digite o valor do carro: ");
        double valorCarro = sc.nextFloat();
        for (int parcela = 1; parcela <= valorCarro; parcela++) {
            double valorParcela = valorCarro / parcela;
            if (valorParcela < 1000) {
                break;
            }
            System.out.println(String.format("Parcela %d R$%.2f", parcela, valorParcela));
        }
        sc.close();
    }
}
