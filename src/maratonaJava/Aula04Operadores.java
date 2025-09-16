package maratonaJava;

import java.util.Scanner;

public class Aula04Operadores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        int num1 = sc.nextInt();
        System.out.print("Digite outro numero inteiro: ");
        int num2 = sc.nextInt();
        System.out.print("\n");
        System.out.print("=========== Operadores Matemáticos ===========\n");

        // Operadores Matemáticos

        // Adição(+), Substração(-), Multiplicação(*)
        int soma = num1 + num2;
        System.out.printf("%d + %d = %d\n", num1, num2, soma);
        int subtracao = num1 - num2;
        System.out.printf("%d - %d = %d\n", num1, num2, subtracao);
        int multiplicacao = num1*num2;
        System.out.printf("%d * %d = %d\n", num1, num2, multiplicacao);
        float divisao = (float) num1 / num2;

        // Divisão(/), Resto(%)
        System.out.printf("%d / %d = %.2f\n", num1, num2, divisao);
        int resto = num1 % num2;
        System.out.printf("%d %% %d = %d\n", num1, num2, resto);

        // Operadores Relacionais
        // menor que (<), maior que (>), menor igual (<=), maior igual (>=), igual a (==), diferente de (!=)
        System.out.print("\n=========== Operadores Relacionais ===========\n");
        boolean menorQue = num1 < num2;
        System.out.printf("%d < %d = %b\n", num1, num2, menorQue);
        boolean maiorQue = num1 > num2;
        System.out.printf("%d > %d = %b\n", num1, num2, maiorQue);
        boolean menorIgual = num1 <= num2;
        System.out.printf("%d <= %d = %b\n", num1, num2, menorIgual);
        boolean maiorIgual = num1 >= num2;
        System.out.printf("%d >= %d = %b\n", num1, num2, maiorIgual);
        boolean igualA = num1 == num2;
        System.out.printf("%d == %d = %b\n", num1, num2, igualA);
        boolean diferenteDe = num1 != num2;
        System.out.printf("%d != %d = %b\n", num1, num2, diferenteDe);

        // Operadores Lógicos
        // e (&&)
        System.out.print("\n=========== Operadores Lógicos ===========\n");
        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.printf("Idade maior que trinta: %b\n", isDentroDaLeiMaiorQueTrinta);
        System.out.printf("Idade menor que trinta: %b\n", isDentroDaLeiMenorQueTrinta);

        // ou (||)
        double valorTotalContaCorrente = 200;
        double valorTotalContaPolpanca = 10000;
        float valorPlaytation = 5000F;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaytation || valorTotalContaPolpanca > valorPlaytation;
        System.out.printf("Playstation 5 é compravel? %b\n", isPlaystationCincoCompravel);

        // negação (!)

        System.out.print("\n=========== Operadores de Atribuição ===========\n");
        // +=, -=, *=, /= e %=
        int somaAtribuicao = num1;
        somaAtribuicao += num2;
        int subtracaoAtribuicao = num1;
        subtracaoAtribuicao -= num2;
        int multiplicacaoAtribuicao = num1;
        multiplicacaoAtribuicao *= num2;
        float divisaoAtribuicao = num1;
        divisaoAtribuicao /= num2;
        int moduloAtribuicao = num1;
        moduloAtribuicao %= num2;
        System.out.printf("Soma Atribuição: %d\n", somaAtribuicao);
        System.out.printf("Multiplicação Atribuição: %d\n", multiplicacaoAtribuicao);
        System.out.printf("Subtração Atribuição: %d\n", subtracaoAtribuicao);
        System.out.printf("Divisão Atribuição: %.2f\n", divisaoAtribuicao);
        System.out.printf("Modulo Atribuição: %d\n", moduloAtribuicao);
    }
}
