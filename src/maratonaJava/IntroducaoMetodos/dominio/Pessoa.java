package maratonaJava.IntroducaoMetodos.dominio;

public class Pessoa {
    private String nome;
    private int idade;

    public void setNome(String n) {
        this.nome = n;
    }

    public void setIdade(int i) {
        if(i < 0) {
            System.out.println("Idade Inválida");
            return;
        }
        this.idade = i;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void imprime() {
        System.out.printf("""
        Nome = %s
        Idade = %d    
        """, this.nome, this.idade);
    }
}
