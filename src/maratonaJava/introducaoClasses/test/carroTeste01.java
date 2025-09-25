package maratonaJava.introducaoClasses.test;

import maratonaJava.introducaoClasses.dominio.Moto;

public class carroTeste01 {
    public static void main(String[] args) {
        Moto moto1 = new Moto();
        Moto moto2 = new Moto();

        moto1.nome = "Kawazaki z1000";
        moto1.ano = 2025;
        moto1.modelo = "Naked";

        moto2.nome = "Kawazaki h2h";
        moto2.ano = 2025;
        moto2.modelo = "Naked";

        System.out.print(String.format("""
            Moto1: 
            Nome=%s 
            Ano=%d
            Modelo=%s""", moto1.nome, moto1.ano, moto1.modelo));

        System.out.println(String.format("""
            \n
            Moto2: 
            Nome=%s 
            Ano=%d
            Modelo=%s""", moto2.nome, moto2.ano, moto2.modelo));


    }
}
