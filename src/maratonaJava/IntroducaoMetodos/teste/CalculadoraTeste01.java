package maratonaJava.IntroducaoMetodos.teste;
import maratonaJava.IntroducaoMetodos.dominio.Calculadora;

public class CalculadoraTeste01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.soma();
        System.out.println("--------------------------");
        calculadora.subtracao();
        System.out.println("--------------------------");
        calculadora.multiplicador(10, 20);
        System.out.println("--------------------------");
        double result = calculadora.divisao(2.5, 0);
        System.out.printf("%.2f", result);
    }
}