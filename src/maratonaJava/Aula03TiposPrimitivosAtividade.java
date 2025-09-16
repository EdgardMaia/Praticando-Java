package maratonaJava;

import java.util.Scanner;
/*
    Prática

        Crie variáveis para os campos descritos abaixo entre <> e imprimia a seguinte mensagem:

        Eu <nome>, morando no endereço <endereço>,
        confirmo que recebi o salário de <salario>, na data <data>.
    */
public class Aula03TiposPrimitivosAtividade {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite seu endereço: ");
        String endereco = sc.nextLine();

        System.out.print("Digite o valor do salario que recebeu(R$): ");
        float salario = sc.nextFloat();
        sc.nextLine();

        System.out.print("Data de recebimento: ");
        String dataRecebimento = sc.nextLine();
        sc.close();

        System.out.printf("Eu %s, morando no endereço %s, confirmo que recebi R$%.2f, na data %s", nome, endereco, salario, dataRecebimento);
    }
}
