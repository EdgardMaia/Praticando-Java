package screenMatch;

// 📦 IMPORTAÇÕES: Demonstram o uso de diferentes pacotes organizados
import java.util.ArrayList;
import screenMatch.calculos.CalculadoraDeTempo;
import screenMatch.calculos.FiltroRecomendacao;
import screenMatch.modelos.Episodio;
import screenMatch.modelos.Filme;
import screenMatch.modelos.Serie;

/**
 * 🎬 CLASSE PRINCIPAL - DEMONSTRAÇÃO DOS CONCEITOS DE POO
 * 
 * Esta classe demonstra todos os pilares da Programação Orientada a Objetos:
 * - 🏗️ INSTANCIAÇÃO: Criação de objetos das classes
 * - 🔒 ENCAPSULAMENTO: Uso de getters/setters para acessar dados privados
 * - 🧬 HERANÇA: Filme e Serie herdam de Titulo
 * - 🎭 POLIMORFISMO: CalculadoraDeTempo aceita diferentes tipos de Titulo
 * - 🤝 INTERFACES: FiltroRecomendacao trabalha com objetos Classificavel
 */ 

public class Principal {
    public static void main(String[] args) {
        
        // ========================================
        // 🎬 TRABALHANDO COM FILMES
        // ========================================
        
        // 🏗️ INSTANCIAÇÃO: Criando um objeto da classe Filme
        Filme meuFilme = new Filme();
        
        // 🔒 ENCAPSULAMENTO: Usando setters para definir valores
        // (Os atributos são privados, só acessíveis via métodos públicos)
        meuFilme.setNome("O poderoso chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);
        
        // 🔒 ENCAPSULAMENTO: Usando getter para acessar valor privado
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

        // 🧬 HERANÇA: exibeFichaTecnica() é método herdado da classe Titulo
        meuFilme.exibeFichaTecnica();
        
        // 🔒 ENCAPSULAMENTO: Método público que manipula atributos privados
        // O método avalia() controla como as notas são armazenadas
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        
        // 🔒 ENCAPSULAMENTO: Getters protegem o acesso aos dados calculados
        System.out.printf("""
            Total de Avaliações: %d
            Média das Avaliações: %.2f
            """, meuFilme.getTotalDeAvaliacoes(), meuFilme.pegaMedia());

        // ========================================
        // 📺 TRABALHANDO COM SÉRIES  
        // ========================================
        
        // 🏗️ INSTANCIAÇÃO: Criando um objeto da classe Serie
        // 🧬 HERANÇA: Serie herda todos os métodos e atributos de Titulo
        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();  // 🧬 Método herdado de Titulo
        
        // 🎭 COMPORTAMENTO ESPECÍFICO: Métodos exclusivos da classe Serie
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        
        // 🎭 POLIMORFISMO: getDuracaoEmMinutos() tem comportamento diferente em Serie
        // Serie SOBRESCREVE (override) este método para calcular: temporadas * episódios * minutos
        System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos());

        // 🏗️ INSTANCIAÇÃO: Criando outro filme para demonstrar polimorfismo
        Filme outroFilme = new Filme();
        outroFilme.setNome("Avatar");
        outroFilme.setAnoDeLancamento(2023);
        outroFilme.setDuracaoEmMinutos(200);

        // ========================================
        // 🎭 DEMONSTRANDO POLIMORFISMO
        // ========================================
        
        // 🏗️ INSTANCIAÇÃO: Criando calculadora de tempo
        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        
        // 🎭 POLIMORFISMO: O método inclui() aceita qualquer objeto do tipo Titulo
        // Tanto Filme quanto Serie são subclasses de Titulo, então funcionam!
        calculadora.inclui(meuFilme);    // ✅ Filme é um Titulo
        calculadora.inclui(outroFilme);  // ✅ Filme é um Titulo  
        calculadora.inclui(lost);        // ✅ Serie é um Titulo
        
        // 🔒 ENCAPSULAMENTO: Acessando o resultado via getter
        System.out.println("Tempo total para assistir tudo: " + calculadora.getTempoTotal() + " minutos");

        // ========================================
        // 🤝 DEMONSTRANDO INTERFACES
        // ========================================
        
        // 🏗️ INSTANCIAÇÃO: Criando filtro de recomendação
        FiltroRecomendacao filtro = new FiltroRecomendacao();
        
        // 🤝 INTERFACE: filtra() aceita qualquer objeto que implemente Classificavel
        // Filme implementa a interface Classificavel
        filtro.filtra(meuFilme);

        // 🏗️ INSTANCIAÇÃO: Criando um episódio
        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);           // 🔗 ASSOCIAÇÃO: Episódio pertence a uma Serie
        episodio.setTotalVisualizacoes(300);

        Filme filmeEdgard = new Filme();
        filmeEdgard.setNome("Bring Her Back");
        filmeEdgard.setAnoDeLancamento(2025);
        filmeEdgard.setDiretor(" Michael Philippou, Danny Philippou");
        filmeEdgard.setDuracaoEmMinutos(99);
        filmeEdgard.avalia(8);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(meuFilme);     // Adicionando primeiro filme
        listaDeFilmes.add(outroFilme);   // Adicionando segundo filme  
        listaDeFilmes.add(filmeEdgard);  // Adicionando terceiro filme
        
        // ========================================
        // 📋 EXIBINDO LISTA DE FILMES DE FORMA ORGANIZADA
        // ========================================
        
        System.out.println("================================");
        System.out.println("LISTA COMPLETA DE FILMES");
        System.out.println("================================");
        for (int i = 0; i < listaDeFilmes.size(); i++) {
            Filme filme = listaDeFilmes.get(i);
            System.out.printf("""
                FILME %d:
                Nome: %s
                Ano: %d
                Diretor: %s
                Duração: %d minutos
                Avaliações: %d
                Média: %.1f
            --------------------------------
            """, 
                (i + 1),
                filme.getNome(),
                filme.getAnoDeLancamento(), 
                filme.getDiretor() != null ? filme.getDiretor() : "Não informado",
                filme.getDuracaoEmMinutos(),
                filme.getTotalDeAvaliacoes(),
                filme.getTotalDeAvaliacoes() > 0 ? filme.pegaMedia() : 0.0
            );
        }
    
        
        // 🤝 INTERFACE: Episodio também implementa Classificavel
        // Mesmo método filtra(), mas comportamento diferente baseado na implementação
        filtro.filtra(episodio);
    }
}