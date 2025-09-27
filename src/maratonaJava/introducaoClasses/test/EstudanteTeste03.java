package maratonaJava.introducaoClasses.test;

import maratonaJava.introducaoClasses.dominio.Estudante;

public class EstudanteTeste03 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Ichigo";
        estudante01.idade = 28;
        estudante01.sexo = 'M';

        estudante02.nome = "Saber";
        estudante02.idade = 1500;
        estudante02.sexo = 'F';
    }
}
