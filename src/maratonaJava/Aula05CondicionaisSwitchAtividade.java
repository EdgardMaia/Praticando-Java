package maratonaJava;

public class Aula05CondicionaisSwitchAtividade {
    public static void main(String[] args) {
        // Utilizando switch e dados os valores de 1 a 7, imprima se é dia útil ou final de semana
        // Considerando o 1 como domingo
        int dia = 5;

        switch (dia) {
            case 1:
            case 7:
                System.out.println("Final de semana");
                break;
            default:
                System.out.println("Dia útil");
        }
    }
}
