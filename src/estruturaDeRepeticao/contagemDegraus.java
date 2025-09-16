package estruturaDeRepeticao;
import java.util.Scanner;

public class contagemDegraus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número de degraus: ");
        int degraus = sc.nextInt();
        if (degraus <= 0) {
            System.out.println("Número inválido. Por favor, insira um número positivo.");
        } else {
            for (int i = 1; i <= degraus; i++) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("A execução foi interrompida.");
                    Thread.currentThread().interrupt();
                    break; 
                }
                System.out.println(String.format("Degrau %d", i));
            }
        }
        sc.close();
    }
}