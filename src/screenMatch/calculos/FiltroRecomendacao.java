package screenMatch.calculos;

/**
 * 🎯 CLASSE FILTRORECOMENDACAO - SISTEMA DE RECOMENDAÇÃO INTELIGENTE
 * 
 * Esta classe demonstra conceitos avançados de POO:
 * 
 * 🤝 POLIMORFISMO COM INTERFACES:
 * - Trabalha com qualquer objeto que implemente Classificavel
 * - Não precisa conhecer tipos específicos (Filme, Episodio, etc.)
 * - Um método funciona com múltiplas implementações
 * 
 * 🎭 STRATEGY PATTERN:
 * - Diferentes objetos têm diferentes estratégias de classificação
 * - Filme: baseado em avaliações
 * - Episodio: baseado em visualizações
 * - FiltroRecomendacao: usa qualquer estratégia automaticamente
 * 
 * 🔄 ABSTRAÇÃO:
 * - Esconde complexidade de diferentes algoritmos de classificação
 * - Interface simples: filtra(classificavel)
 * - Lógica de recomendação centralizada
 */
public class FiltroRecomendacao {
    
    // ========================================
    // 🎯 MÉTODO PRINCIPAL - SISTEMA DE IA
    // ========================================
    
    /**
     * 🤖 ALGORITMO DE RECOMENDAÇÃO INTELIGENTE
     * 
     * 🤝 POLIMORFISMO COM INTERFACE:
     * - Aceita QUALQUER objeto que implemente Classificavel
     * - Filme, Episodio, ou qualquer futuro tipo classificável
     * - Não precisa saber qual tipo específico está recebendo
     * 
     * 🎭 DIFERENTES ESTRATÉGIAS AUTOMATICAMENTE:
     * - Se receber Filme: getClassificacao() usa média de avaliações
     * - Se receber Episodio: getClassificacao() usa total de visualizações
     * - Mesmo método filtra(), algoritmos completamente diferentes!
     * 
     * 🧠 LÓGICA DE RECOMENDAÇÃO:
     * - Classifica em 3 níveis baseado na pontuação
     * - Cada nível tem uma mensagem de recomendação específica
     * - Sistema extensível: fácil adicionar novos níveis
     * 
     * 🔄 ABSTRAÇÃO:
     * - Usuário não precisa saber:
     *   * Como a classificação é calculada
     *   * Que algoritmos diferentes são usados
     *   * Detalhes internos de cada tipo
     * - Interface simples: passa objeto, recebe recomendação
     * 
     * @param classificavel Qualquer objeto que implemente Classificavel
     */
    public void filtra(Classificavel classificavel) {
        
        // 🎭 POLIMORFISMO EM AÇÃO:
        // Este método chama getClassificacao() no objeto recebido
        // - Se for Filme: usa algoritmo baseado em avaliações
        // - Se for Episodio: usa algoritmo baseado em visualizações
        // O objeto "sabe" como se classificar!
        
        int classificacao = classificavel.getClassificacao();
        
        // 🤖 SISTEMA DE RECOMENDAÇÃO POR NÍVEIS
        if (classificacao >= 4) {
            // 🏆 NÍVEL PREMIUM: Alta classificação
            System.out.println("Está entre os preferidos do momento");
            
        } else if (classificacao >= 2) {
            // 🥈 NÍVEL BOM: Classificação moderada  
            System.out.println("Muito bem avaliado no momento!");
            
        } else {
            // 📋 NÍVEL BÁSICO: Classificação baixa
            System.out.println("Coloque na sua lista para assistir depois");
        }
    }
}

/*
 * 📋 RESUMO DOS CONCEITOS DEMONSTRADOS:
 * 
 * 🤝 POLIMORFISMO COM INTERFACES:
 *    filtra(Classificavel) aceita Filme, Episodio, ou qualquer implementação
 *    Mesmo método, comportamentos totalmente diferentes
 * 
 * 🎭 STRATEGY PATTERN:
 *    Cada classe implementa sua própria estratégia de classificação:
 *    - Filme: (média de avaliações) / 2
 *    - Episodio: visualizações > 100 ? 4 : 2
 *    FiltroRecomendacao usa qualquer estratégia automaticamente
 * 
 * 🔄 ABSTRAÇÃO:
 *    Esconde complexidade dos diferentes algoritmos
 *    Interface simples e uniforme para o usuário
 * 
 * 📈 EXTENSIBILIDADE:
 *    Criar nova classe classificável:
 *    1. implements Classificavel
 *    2. implementar getClassificacao() com sua lógica
 *    3. Funciona automaticamente com FiltroRecomendacao!
 * 
 * 🔒 ENCAPSULAMENTO:
 *    Cada objeto protege sua lógica de classificação
 *    FiltroRecomendacao protege sua lógica de recomendação
 * 
 * 🎯 LOW COUPLING:
 *    FiltroRecomendacao não depende de classes específicas
 *    Depende apenas da interface Classificavel
 *    Mudanças em Filme/Episodio não afetam FiltroRecomendacao
 * 
 * 💡 EXEMPLO PRÁTICO:
 *    FiltroRecomendacao filtro = new FiltroRecomendacao();
 *    
 *    filtro.filtra(filme);     // Usa avaliações para classificar
 *    // Output baseado na média de notas do filme
 *    
 *    filtro.filtra(episodio);  // Usa visualizações para classificar  
 *    // Output baseado na popularidade do episódio
 *    
 *    // Mesmo método, lógicas completamente diferentes! 🎭
 */