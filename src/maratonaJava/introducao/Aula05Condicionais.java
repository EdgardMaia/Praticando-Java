package maratonaJava.introducao;
import java.util.Scanner;

public class Aula05Condicionais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digita sua idade: ");
        int idade = sc.nextInt();
        String categoria;

        if (idade < 15) {
            categoria = "Categoria Infantil";
        }
        else if (idade >= 15 && idade <=18) {
            categoria = "Categoria Juvenil";
        }
        else {
            categoria = "Categoria Adulto";
        }
        System.out.println(categoria);
    }
}
