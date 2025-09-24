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
}