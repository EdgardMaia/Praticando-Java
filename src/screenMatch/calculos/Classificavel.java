package screenMatch.calculos;

/**
 * 🤝 INTERFACE CLASSIFICAVEL - CONTRATO DE COMPORTAMENTO
 * 
 * Esta interface demonstra conceitos fundamentais de POO:
 * 
 * 📋 CONTRATO:
 * - Define QUE métodos uma classe deve ter, mas não COMO implementar
 * - Qualquer classe que implementa deve ter getClassificacao()
 * - Garante que objetos classificáveis tenham comportamento padrão
 * 
 * 🎭 POLIMORFISMO:
 * - Permite tratar objetos diferentes de forma uniforme
 * - FiltroRecomendacao pode trabalhar com qualquer Classificavel
 * - Mesmo método, implementações diferentes em cada classe
 * 
 * 🔧 FLEXIBILIDADE:
 * - Novas classes podem implementar esta interface facilmente
 * - Sistemas que usam Classificavel funcionam automaticamente
 * - Extensibilidade sem modificar código existente
 * 
 * 🏗️ DESIGN PATTERN:
 * - Implementa o padrão "Strategy" - diferentes estratégias de classificação
 * - Separação entre interface (o que fazer) e implementação (como fazer)
 */
public interface Classificavel {
    
    /**
     * 🏆 MÉTODO ABSTRATO - DEVE SER IMPLEMENTADO
     * 
     * 📋 CONTRATO OBRIGATÓRIO:
     * - Toda classe que implementa Classificavel DEVE ter este método
     * - Cada classe define sua própria lógica de classificação
     * - Retorna um valor inteiro representando a classificação
     * 
     * 🎭 POLIMORFISMO EM AÇÃO:
     * - Filme: classifica baseado na média de avaliações
     * - Episodio: classifica baseado no número de visualizações
     * - Futuras classes: podem ter outras lógicas
     * 
     * 🔄 ABSTRAÇÃO:
     * - Interface define O QUE fazer (classificar)
     * - Implementações definem COMO fazer (algoritmo específico)
     * 
     * @return valor inteiro representando a classificação do objeto
     */
    int getClassificacao();
}

/*
 * 📋 VANTAGENS DAS INTERFACES:
 * 
 * 🤝 CONTRATO GARANTIDO:
 *    Qualquer Classificavel TEM getClassificacao()
 *    Código que usa interface pode confiar neste método
 * 
 * 🎭 POLIMORFISMO:
 *    FiltroRecomendacao.filtra(Classificavel c) aceita:
 *    - Filme (implementa Classificavel)
 *    - Episodio (implementa Classificavel)  
 *    - Qualquer futuro Classificavel
 * 
 * 🔧 EXTENSIBILIDADE:
 *    Criar nova classe classificável:
 *    1. implements Classificavel
 *    2. implementar getClassificacao()
 *    3. Funciona automaticamente com FiltroRecomendacao!
 * 
 * 🏗️ BAIXO ACOPLAMENTO:
 *    FiltroRecomendacao não precisa conhecer classes específicas
 *    Depende apenas da interface Classificavel
 *    Mudanças em Filme/Episodio não afetam FiltroRecomendacao
 * 
 * 📐 EXEMPLO DE USO:
 *    Classificavel item = new Filme();     // ✅ Filme implementa
 *    Classificavel outro = new Episodio(); // ✅ Episodio implementa
 *    filtro.filtra(item);                  // ✅ Polimorfismo
 *    filtro.filtra(outro);                 // ✅ Polimorfismo
 */
