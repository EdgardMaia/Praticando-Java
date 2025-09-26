package maratonaJava.introducaoClasses.test;

import maratonaJava.introducaoClasses.dominio.Professor;

public class ProfessorTeste01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Vitoria";
        professor.idade = 27;
        professor.sexo = 'F';
        System.out.print(String.format("""
            Nome: %s
            Idade: %d
            Sexo: %c
            """, professor.nome, professor.idade, professor.sexo));
    }
}
