package screenMatch.modelos;

import screenMatch.calculos.Classificavel;

/**
 * 📍 CLASSE EPISODIO - IMPLEMENTA INTERFACE
 * 
 * Esta classe demonstra conceitos importantes de POO:
 * 
 * 🤝 INTERFACE:
 * - "implements Classificavel" significa que Episodio PODE SER classificado
 * - Deve implementar obrigatoriamente getClassificacao()
 * - Permite polimorfismo: pode ser tratado como Classificavel
 * 
 * 🔗 ASSOCIAÇÃO:
 * - Episodio TEM UMA Serie (composição/agregação)
 * - Demonstra relacionamento entre objetos
 * - Um episódio pertence a uma série específica
 * 
 * 🎭 POLIMORFISMO:
 * - Implementa getClassificacao() com lógica diferente de Filme
 * - Mesmo método, comportamento baseado em visualizações vs. avaliações
 * 
 * 🔒 ENCAPSULAMENTO:
 * - Atributos privados com acesso controlado
 */
public class Episodio implements Classificavel {
    
    // ========================================
    // 🔒 ATRIBUTOS PRIVADOS (ENCAPSULAMENTO)
    // ========================================
    
    /**
     * 📍 ATRIBUTOS ESPECÍFICOS DE EPISÓDIO
     * 🔒 ENCAPSULAMENTO: Privados para garantir integridade dos dados
     */
    private int numero;                    // Número do episódio na temporada
    private String nome;                   // Nome/título do episódio
    private Serie serie;                   // 🔗 ASSOCIAÇÃO: Episódio pertence a uma Serie
    private int totalVisualizacoes;        // Número total de visualizações

    // ========================================
    // 🔓 MÉTODOS PÚBLICOS - GETTERS/SETTERS
    // ========================================
    
    /**
     * 🔍 GETTER: Retorna total de visualizações
     * 📊 MÉTRICA: Usado para determinar popularidade do episódio
     */
    public int getTotalVisualizacoes() {
        return totalVisualizacoes;
    }

    /**
     * ✏️ SETTER: Define total de visualizações
     * 🔒 ENCAPSULAMENTO: Poderia incluir validação (ex: não permitir valores negativos)
     * 📊 CRÍTICO: Este valor influencia a classificação do episódio
     */
    public void setTotalVisualizacoes(int totalVisualizacoes) {
        this.totalVisualizacoes = totalVisualizacoes;
    }

    /**
     * 🔍 GETTER: Retorna o número do episódio
     */
    public int getNumero() {
        return numero;
    }

    /**
     * ✏️ SETTER: Define o número do episódio
     * 🔒 ENCAPSULAMENTO: Poderia validar se é um número válido (> 0)
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * 🔍 GETTER: Retorna o nome do episódio
     */
    public String getNome() {
        return nome;
    }

    /**
     * ✏️ SETTER: Define o nome do episódio
     * 🔒 ENCAPSULAMENTO: Poderia validar se não é vazio/nulo
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * 🔍 GETTER: Retorna a série à qual pertence
     * 🔗 ASSOCIAÇÃO: Demonstra relacionamento entre Episodio e Serie
     */
    public Serie getSerie() {
        return serie;
    }

    /**
     * ✏️ SETTER: Define a série à qual pertence
     * 🔗 ASSOCIAÇÃO: Estabelece relacionamento com objeto Serie
     * 🔒 ENCAPSULAMENTO: Poderia validar se serie não é null
     */
    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    // ========================================
    // 🤝 IMPLEMENTAÇÃO DA INTERFACE
    // ========================================
    
    /**
     * 🏆 IMPLEMENTAÇÃO OBRIGATÓRIA DA INTERFACE CLASSIFICAVEL
     * 
     * 🤝 CONTRATO: Classificavel exige que este método seja implementado
     * 📍 LÓGICA ESPECÍFICA: Episódio usa visualizações para classificar
     * 🎭 POLIMORFISMO: Permite que Episodio seja tratado como Classificavel
     * 
     * 🧮 ALGORITMO DIFERENTE DE FILME:
     * - Filme: usa média de avaliações (qualitativo)
     * - Episodio: usa total de visualizações (quantitativo)
     * 
     * 📊 CRITÉRIOS:
     * - Mais de 100 visualizações = classificação 4 (muito popular)
     * - 100 ou menos visualizações = classificação 2 (moderado)
     * 
     * @Override - Anotação indica que implementa método da interface
     * @return classificação baseada na popularidade (visualizações)
     */
    @Override
    public int getClassificacao() {
        if (totalVisualizacoes > 100) {
            return 4;    // 📈 Alta popularidade
        } else {
            return 2;    // 📊 Popularidade moderada
        }
    }
}

/*
 * 📋 RESUMO DOS CONCEITOS DEMONSTRADOS:
 * 
 * 🤝 INTERFACE:
 *    Implementa Classificavel obrigatoriamente
 *    Deve ter método getClassificacao()
 *    Permite polimorfismo com outros classificáveis
 * 
 * 🔗 ASSOCIAÇÃO:
 *    Episodio TEM UMA Serie (não herda, mas se relaciona)
 *    Demonstra que nem todo relacionamento é herança
 *    Composição: episódio faz parte de uma série
 * 
 * 🎭 POLIMORFISMO:
 *    FiltroRecomendacao.filtra() aceita tanto Filme quanto Episodio
 *    Cada um implementa getClassificacao() de forma diferente
 *    Mesmo método, lógicas completamente diferentes
 * 
 * 🔒 ENCAPSULAMENTO:
 *    Atributos privados protegem integridade dos dados
 *    Lógica de classificação encapsulada no método
 *    
 * 🎯 RESPONSABILIDADE ÚNICA:
 *    Episodio cuida apenas de dados e comportamentos de episódios
 *    Não herda de Titulo porque tem natureza diferente
 */