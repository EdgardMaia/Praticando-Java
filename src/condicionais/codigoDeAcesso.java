package condicionais;
import java.util.Scanner;

public class codigoDeAcesso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o código de acesso: ");
        int codigo = sc.nextInt();

        if (codigo != 2023) {
            System.out.println("Código incorreto, acesso negado.");
            sc.close();

        } else if (codigo == 2023) {
            System.out.print("Digite o nível de acesso (1-3): ");
            int nivel = sc.nextInt();
            sc.close();

            if (nivel >= 1 && nivel <= 3) {
                System.out.print("Acesso Permitido, seja bem-vindo ao sistema.\n");
            } else {
                System.out.print("Nível de acesso inválido. Acesso negado.");
            }
        }
    }
}