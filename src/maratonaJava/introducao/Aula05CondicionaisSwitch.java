package maratonaJava.introducao;

public class Aula05CondicionaisSwitch {
    // Imprima o dia da semana, considerando 1 como domingo.
    public static void main(String[] args) {
        byte dia = 10;
        switch (dia) {
            case 1 -> System.out.println("Domingo");
            case 2 -> System.out.println("Segunda");
            case 3 -> System.out.println("Terça");
            case 4 -> System.out.println("Quarta");
            case 5 -> System.out.println("Quinta");
            case 6 -> System.out.println("Sexta");
            case 7 -> System.out.println("Sábado");
            default -> System.out.println("Dia inválido");
        }
    }
}
