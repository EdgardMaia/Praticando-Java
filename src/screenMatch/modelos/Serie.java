package screenMatch.modelos;

/**
 * 📺 CLASSE SERIE - SUBCLASSE DE TITULO
 * 
 * Esta classe demonstra conceitos avançados de POO:
 * 
 * 🧬 HERANÇA:
 * - "extends Titulo" significa que Serie É UM Titulo
 * - Herda todas as características básicas (nome, ano, avaliações)
 * - Adiciona características específicas de séries
 * 
 * 🎭 SOBRESCRITA (OVERRIDE):
 * - Redefine o método getDuracaoEmMinutos() da classe pai
 * - Implementa lógica específica para calcular duração de séries
 * - Demonstra polimorfismo em ação
 * 
 * 🔒 ENCAPSULAMENTO:
 * - Atributos específicos são privados
 * - Acesso controlado via getters/setters
 */
public class Serie extends Titulo {
    
    // ========================================
    // 🔒 ATRIBUTOS ESPECÍFICOS DE SÉRIE
    // ========================================
    
    /**
     * 📺 ATRIBUTOS EXCLUSIVOS DE SÉRIE
     * 🔒 ENCAPSULAMENTO: Todos privados para garantir integridade
     * ➕ ESPECIALIZAÇÃO: Titulo não tem estes conceitos, Serie sim
     */
    private int temporadas;              // Número de temporadas
    private boolean ativa;               // Se a série ainda está sendo produzida
    private int episodiosPorTemporada;   // Episódios por temporada
    private int minutosPorEpisodio;      // Duração média de cada episódio

    // ========================================
    // 🔓 MÉTODOS PÚBLICOS - GETTERS/SETTERS
    // ========================================
    
    /**
     * 🔍 GETTER: Retorna número de temporadas
     * 📺 ESPECÍFICO: Conceito que só existe em Series
     */
    public int getTemporadas() {
        return temporadas;
    }

    /**
     * ✏️ SETTER: Define número de temporadas
     * 🔒 ENCAPSULAMENTO: Poderia incluir validação (ex: temporadas > 0)
     */
    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    /**
     * 🔍 GETTER: Verifica se a série ainda está ativa
     * 📺 ESPECÍFICO: Conceito exclusivo de séries
     */
    public boolean isAtiva() {
        return ativa;
    }

    /**
     * ✏️ SETTER: Define se a série está ativa
     */
    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    /**
     * 🔍 GETTER: Retorna episódios por temporada
     */
    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    /**
     * ✏️ SETTER: Define episódios por temporada
     * 🔒 ENCAPSULAMENTO: Poderia validar se é um número positivo
     */
    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    /**
     * 🔍 GETTER: Retorna minutos por episódio
     */
    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    /**
     * ✏️ SETTER: Define minutos por episódio
     * 🔒 ENCAPSULAMENTO: Poderia validar se é um tempo razoável
     */
    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    // ========================================
    // 🎭 SOBRESCRITA (OVERRIDE) - POLIMORFISMO
    // ========================================
    
    /**
     * 🎭 SOBRESCRITA DO MÉTODO getDuracaoEmMinutos()
     * 
     * 🧬 HERANÇA: Titulo tem este método, mas Serie o REDEFINE
     * 🎭 POLIMORFISMO: Mesmo método, comportamento diferente
     * 📺 LÓGICA ESPECÍFICA: Calcula duração total da série
     * 
     * 🧮 ALGORITMO:
     * temporadas × episódios/temporada × minutos/episódio = duração total
     * 
     * 💡 EXEMPLO:
     * 5 temporadas × 10 episódios × 50 minutos = 2500 minutos total
     * 
     * @Override - Anotação indica que substitui método da classe pai
     * @return duração total calculada dinamicamente
     */
    @Override
    public int getDuracaoEmMinutos() {
        return temporadas * episodiosPorTemporada * minutosPorEpisodio;
    }

    // ========================================
    // 📄 REPRESENTAÇÃO TEXTUAL ESPECÍFICA
    // ========================================
    
    /**
     * 📄 TOSTRING PERSONALIZADO PARA SÉRIE
     * 
     * 🎭 SOBRESCRITA: Redefine toString() da classe pai (Titulo)
     * 📺 ESPECÍFICO: Adiciona informações exclusivas de séries
     * 🔄 ABSTRAÇÃO: Mostra dados relevantes sem códigos técnicos
     * 
     * 💡 DIFERENÇA DO TITULO:
     * - Titulo: "Nome (Ano)"
     * - Serie: "Nome (Ano) - X temporadas"
     * 
     * @return String formatada com nome, ano e número de temporadas
     */
    @Override
    public String toString() {
        return String.format("%s (%d) - %d temporadas", 
                            getNome(), getAnoDeLancamento(), temporadas);
    }
}

/*
 * 📋 RESUMO DOS CONCEITOS DEMONSTRADOS:
 * 
 * 🧬 HERANÇA:
 *    Serie herda: nome, anoDeLancamento, avalia(), pegaMedia(), exibeFichaTecnica()
 *    Serie adiciona: temporadas, ativa, episodiosPorTemporada, minutosPorEpisodio
 * 
 * 🎭 POLIMORFISMO (OVERRIDE):
 *    Titulo.getDuracaoEmMinutos() → retorna valor fixo
 *    Serie.getDuracaoEmMinutos() → calcula dinamicamente
 *    
 *    Resultado: CalculadoraDeTempo funciona com ambos, mas cada um calcula diferente!
 * 
 * 🔒 ENCAPSULAMENTO:
 *    Todos os atributos são privados
 *    Acesso controlado via getters/setters
 *    Lógica de cálculo protegida no método getDuracaoEmMinutos()
 * 
 * 🎯 RESPONSABILIDADE ÚNICA:
 *    Serie cuida apenas de conceitos relacionados a séries
 *    Avaliações ficam na classe pai (Titulo)
 */
