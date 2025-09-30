package maratonaJava.IntroducaoMetodos.test;
import java.util.Scanner;
import maratonaJava.IntroducaoMetodos.dominio.Pessoa;

public class PessoaTeste01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        pessoa.setNome(sc.nextLine());

        System.out.println("Digite sua idade: ");
        pessoa.setIdade(sc.nextInt());

        sc.close();

        System.out.printf("""
            Nome = %s        
            """, pessoa.getNome());
    }
}
