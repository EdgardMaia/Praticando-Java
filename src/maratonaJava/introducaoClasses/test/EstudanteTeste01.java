package maratonaJava.introducaoClasses.test;

import maratonaJava.introducaoClasses.dominio.Estudante;

public class EstudanteTeste01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Edgard";
        estudante.idade = 24;
        estudante.sexo = 'M';
        System.out.print(String.format("""
            Nome: %s
            Idade: %d
            Sexo: %c
                """, estudante.nome, estudante.idade, estudante.sexo));
    }
}
