package condicionais;
import java.util.Scanner;

public class validacaoSenha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a senha: ");
        String senha = sc.nextLine();
        
        if (senha.equals("12345")) {
            System.out.println("Acesso permitido.");
        } else {
            System.out.println("Acesso negado.");
        }
    }
}
