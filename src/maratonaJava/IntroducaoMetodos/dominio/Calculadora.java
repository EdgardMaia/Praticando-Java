package maratonaJava.IntroducaoMetodos.dominio;

public class Calculadora {
    public void soma() {
        System.out.println(10+10);
    }

    public void subtracao() {
        System.out.println(21-2);
    }

    public void multiplicador(int num1, int num2) {
        System.out.println(num1 * num2);
    } 

    public Double divisao(double num1, double num2) {
        if (num2 == 0) {
            return Double.NaN;
        } else return num1 / num2;
    }

    public void alteraNumeros(int num1, int num2) {
        num1 = 99;
        num2 = 20;
        System.out.println("Dentro de AlteraNumeros\n");
        System.out.printf("""
                num1 = %d
                num2 = %d 
                """, num1, num2);
    }

    public void somaArray(int[] numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }

    public void somaVarArgs(int... numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }
}