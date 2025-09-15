package condicionais;
import java.util.Scanner;

public class verificacaoDiaUtil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("""
            Dias da semana
            1 - Segunda-feira
            2 - Terça-feira
            3 - Quarta-feira
            4 - Quinta-feira
            5 - Sexta-feira
            6 - Sábado
            7 - Domingo
        """);
        System.out.print("Escolha um dia da semana (1-7): ");
        int dia = sc.nextInt();

        if (dia >= 1 && dia <= 5) {
            System.out.println("Dia útil");
        } else if (dia == 6 || dia == 7) {
            System.out.println("Final de semana");
        } else {
            System.out.println("Valor inválido");
        }
    }
}
