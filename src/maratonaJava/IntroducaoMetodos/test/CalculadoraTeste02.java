package maratonaJava.IntroducaoMetodos.test;

import maratonaJava.IntroducaoMetodos.dominio.Calculadora;

public interface CalculadoraTeste02 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int num1 = 1;
        int num2 = 2;
        calculadora.alteraNumeros(num1, num2);
        System.out.println("\nDentro de Calculadorateste02\n");
        System.out.printf("""
                num1 = %d
                num2 = %d
                """, num1, num2);

    }
}
