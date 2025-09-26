package maratonaJava.introducaoClasses.dominio;

public class ImpressoraEstudante {
    public static void imprime(Estudante estudante) {
        System.out.println("--------------------------------------------");

        System.out.printf("""
            Nome = %s
            idade = %d
            sexo = %c
            """, estudante.nome, estudante.idade, estudante.sexo);
    }
}
