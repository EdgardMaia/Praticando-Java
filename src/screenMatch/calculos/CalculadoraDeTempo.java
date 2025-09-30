package screenMatch.calculos;

import screenMatch.modelos.Titulo;
// import screenMatch.modelos.Serie;
// import screenMatch.modelos.Filme;

/**
 * ⏰ CLASSE CALCULADORADETEMPO - DEMONSTRAÇÃO DE POLIMORFISMO
 * 
 * Esta classe é um exemplo perfeito de como o polimorfismo simplifica o código:
 * 
 * 🎭 POLIMORFISMO:
 * - Aceita qualquer objeto do tipo Titulo (Filme ou Serie)
 * - Um método funciona com múltiplos tipos
 * - Reduz duplicação de código significativamente
 * 
 * 🔧 EVOLUÇÃO DO DESIGN:
 * - Antes: métodos separados para cada tipo (comentados abaixo)
 * - Depois: um método polimórfico que funciona com todos
 * 
 * 🏗️ SINGLE RESPONSIBILITY:
 * - Responsabilidade única: calcular tempo total
 * - Não precisa saber detalhes internos de Filme ou Serie
 * - Depende apenas da interface comum (Titulo)
 */
public class CalculadoraDeTempo {
    
    // ========================================
    // 🔒 ATRIBUTO PRIVADO (ENCAPSULAMENTO)
    // ========================================
    
    /**
     * ⏱️ ACUMULADOR DE TEMPO TOTAL
     * 🔒 ENCAPSULAMENTO: Privado para proteger integridade do cálculo
     * 📊 ESTADO: Mantém a soma de todas as durações adicionadas
     */
    private int tempoTotal;

    // ========================================
    // 🔓 MÉTODO PÚBLICO - GETTER
    // ========================================
    
    /**
     * 🔍 GETTER: Retorna o tempo total calculado
     * 🔒 ENCAPSULAMENTO: Acesso controlado ao resultado
     * 📊 SOMENTE LEITURA: Não permite modificação direta do valor
     */
    public int getTempoTotal() {
        return this.tempoTotal;
    }

    // ========================================
    // ❌ DESIGN ANTIGO - SEM POLIMORFISMO
    // ========================================
    
    /*
     * 🚫 CÓDIGO COMENTADO: Demonstra o problema SEM polimorfismo
     * 
     * ❌ PROBLEMAS DESTA ABORDAGEM:
     * - Duplicação de código (lógica igual, tipos diferentes)
     * - Necessidade de um método para cada tipo
     * - Difícil manutenção (mudança na lógica = alterar vários métodos)
     * - Não extensível (novo tipo = novo método)
     * 
     * 🔄 CADA MÉTODO FAZ A MESMA COISA:
     * 1. Recebe um objeto
     * 2. Pega sua duração
     * 3. Soma ao total
     */
    
//    public void inclui(Filme f) {
//        this.tempoTotal += f.getDuracaoEmMinutos();
//    }
//
//    public void inclui(Serie s) {
//        this.tempoTotal += s.getDuracaoEmMinutos();
//    }

    // ========================================
    // ✅ DESIGN MODERNO - COM POLIMORFISMO
    // ========================================

    /**
     * 🎭 MÉTODO POLIMÓRFICO: A MAGIA DA POO!
     * 
     * 🌟 VANTAGENS DO POLIMORFISMO:
     * - UM método funciona com MÚLTIPLOS tipos
     * - Filme e Serie são tratados como Titulo
     * - Código mais limpo e maintível
     * - Automaticamente funciona com novos tipos de Titulo
     * 
     * 🎭 POLIMORFISMO EM AÇÃO:
     * - Recebe qualquer Titulo (Filme ou Serie)
     * - Chama getDuracaoEmMinutos() no objeto
     * - Filme: retorna duração fixa
     * - Serie: calcula dinamicamente (temporadas × episódios × minutos)
     * - Resultado: comportamento correto para cada tipo!
     * 
     * 🔄 ABSTRAÇÃO:
     * - CalculadoraDeTempo não precisa saber:
     *   * Se é Filme ou Serie
     *   * Como a duração é calculada
     *   * Detalhes internos dos objetos
     * - Só precisa saber que Titulo tem getDuracaoEmMinutos()
     * 
     * 📈 EXTENSIBILIDADE:
     * - Criar nova subclasse de Titulo (ex: Documentario)
     * - Funciona automaticamente com este método!
     * - Sem necessidade de modificar CalculadoraDeTempo
     * 
     * @param titulo Qualquer objeto que seja subclasse de Titulo (Filme, Serie, etc.)
     */
    public void inclui(Titulo titulo) {
        // 📝 DEBUG: Mostra qual título está sendo adicionado
        System.out.println("Adicionando duração em minutos de " + titulo);
        
        // 🎭 POLIMORFISMO: getDuracaoEmMinutos() se comporta diferente para cada tipo
        // - Se titulo é Filme: retorna valor definido no atributo
        // - Se titulo é Serie: calcula temporadas * episódios * minutos
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }
}

/*
 * 📋 RESUMO DOS CONCEITOS DEMONSTRADOS:
 * 
 * 🎭 POLIMORFISMO:
 *    Um método (inclui) funciona com múltiplos tipos (Filme, Serie)
 *    Mesmo comportamento externo, implementações internas diferentes
 * 
 * 🔒 ENCAPSULAMENTO:
 *    tempoTotal é privado, acesso apenas via getter
 *    Protege a integridade do cálculo
 * 
 * 🔄 ABSTRAÇÃO:
 *    Esconde complexidade de como cada tipo calcula duração
 *    Interface simples: inclui(titulo) e getTempoTotal()
 * 
 * 🏗️ SINGLE RESPONSIBILITY:
 *    Uma responsabilidade: somar durações
 *    Não se preocupa com tipos específicos
 * 
 * 📈 OPEN/CLOSED PRINCIPLE:
 *    Aberto para extensão: novos tipos de Titulo funcionam automaticamente
 *    Fechado para modificação: não precisa alterar este código
 * 
 * 🎯 EXEMPLO DE USO:
 *    calc.inclui(filme);     // ✅ Filme extends Titulo
 *    calc.inclui(serie);     // ✅ Serie extends Titulo
 *    calc.inclui(documentario); // ✅ Futuro Documentario extends Titulo
 */