package maratonaJava;

public class Aula06EstruturaDeRepeticaoBreakContinue {
    public static void main(String[] args) {
        int valorMax = 50;
        for (int i = 0; i <= valorMax; i++) {
            if (i > 50) {
                break;
            }
            System.out.println(i);
        }
    }
}
