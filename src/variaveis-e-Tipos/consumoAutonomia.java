import java.util.Locale;
import java.util.Scanner;

public class consumoAutonomia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.print("Consumo médio: ");
        float consumoMedio = sc.nextFloat();
        
        System.out.print("Capacidade do tanque: ");
        float capacidadeTanque = sc.nextFloat();

        System.out.print("Combustivel atual: ");
        float combustivelDisponivel = sc.nextFloat();

        System.out.print("Distancia da Viagem: ");
        float distanciaViagem = sc.nextFloat();
        String mensagem;

        float autonomiaMaxima = consumoMedio * capacidadeTanque;
        float autonomiaAtual = consumoMedio * combustivelDisponivel;

        if (autonomiaAtual >= distanciaViagem) {
            mensagem = "Você conseguirá completar a viagem sem precisar abastecer. ";
        } else {
            mensagem = "Você precisará abastecer para completar a viagem. ";
        }
        
        System.out.printf("""
            Autonomia máxima do veículo: %.2f km
            Autonomia atual do veículo: %.2f km
            %s
            """, autonomiaMaxima, autonomiaAtual, mensagem);

    }
}
