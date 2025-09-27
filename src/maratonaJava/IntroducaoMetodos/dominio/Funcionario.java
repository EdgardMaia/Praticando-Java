package maratonaJava.IntroducaoMetodos.dominio;

import java.util.Arrays;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;

    public void imprime() {
        System.out.println("----------------------------------------");
        if(salarios != null) {
            System.out.printf("""
            Nome = %s
            Idade = %d
            Salarios = %s        
            """, this.nome, this.idade, Arrays.toString(this.salarios));

            mediaSalario();
        }
    }

    public void mediaSalario(){
        if (salarios == null) {
            return;
        }
        double media = 0;

        for (double salario : salarios) {
            media += salario;
        }

        media /= salarios.length;
        System.out.printf("Média salárial: R$ %.2f%n", media);
    }
}
