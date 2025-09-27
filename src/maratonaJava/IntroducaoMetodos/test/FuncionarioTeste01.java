package maratonaJava.IntroducaoMetodos.test;

import maratonaJava.IntroducaoMetodos.dominio.Funcionario;

public class FuncionarioTeste01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Edgard";
        funcionario.idade = 24;
        funcionario.salarios = new double[]{1200, 987.32, 2000};

        funcionario.imprime();
    }
}
