package maratonaJava.introducaoClasses.dominio;

public class Estudante {
    public String nome;
    public int idade;
    public char sexo;

    public void imprime() {
        System.out.println("-------------------------------------");
        System.out.printf("""
            Nome = %s
            Idade = %d
            Sexo = %c 
            """, this.nome, this.idade, this.sexo);
    }
}
