package condicionais;
import java.util.Scanner;

public class ladosTriangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor do primeiro lado do triângulo: ");
        double lado1 = sc.nextDouble();
        System.out.print("Digite o valor do segundo lado do triângulo: ");
        double lado2 = sc.nextDouble();
        System.out.print("Digite o valor do terceiro lado do triângulo: ");
        double lado3 = sc.nextDouble();
        sc.close();

        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            System.out.println("Os lados formam um triângulo.");
        } else {
            System.out.println("Os lados não formam um triângulo.");
        }

    }
}
