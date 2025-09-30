package screenMatch.modelos;

import screenMatch.calculos.Classificavel;

/**
 * 🎬 CLASSE FILME - SUBCLASSE DE TITULO
 * 
 * Esta classe demonstra os conceitos de POO:
 * 
 * 🧬 HERANÇA:
 * - "extends Titulo" significa que Filme É UM Titulo
 * - Herda TODOS os atributos e métodos de Titulo
 * - Pode adicionar características específicas (diretor)
 * - Pode sobrescrever comportamentos (getClassificacao)
 * 
 * 🤝 INTERFACE:
 * - "implements Classificavel" significa que Filme PODE SER classificado
 * - Deve implementar obrigatoriamente o método getClassificacao()
 * - Permite polimorfismo: Filme pode ser tratado como Classificavel
 * 
 * 🎭 POLIMORFISMO:
 * - Filme pode ser usado onde Titulo é esperado
 * - Filme pode ser usado onde Classificavel é esperado
 * - Mesmo objeto, múltiplas "identidades"
 */
public class Filme extends Titulo implements Classificavel {
    
    // ========================================
    // 🔒 ATRIBUTOS ESPECÍFICOS DE FILME
    // ========================================
    
    /**
     * 🎬 ATRIBUTO ESPECÍFICO: Diretor do filme
     * 🔒 ENCAPSULAMENTO: Privado, acessível apenas por getters/setters
     * ➕ ESPECIALIZAÇÃO: Titulo não tem diretor, mas Filme sim
     */
    private String diretor;

    // ========================================
    // 🔓 MÉTODOS PÚBLICOS - GETTERS/SETTERS
    // ========================================
    
    /**
     * 🔍 GETTER: Retorna o diretor do filme
     * 🎬 ESPECÍFICO: Método que só existe em Filme (não em Titulo)
     */
    public String getDiretor() {
        return diretor;
    }

    /**
     * ✏️ SETTER: Define o diretor do filme
     * 🎬 ESPECÍFICO: Funcionalidade exclusiva de Filme
     * 🔒 ENCAPSULAMENTO: Controla como o diretor é definido
     */
    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    // ========================================
    // 🤝 IMPLEMENTAÇÃO DA INTERFACE
    // ========================================
    
    /**
     * 🏆 IMPLEMENTAÇÃO OBRIGATÓRIA DA INTERFACE CLASSIFICAVEL
     * 
     * 🤝 CONTRATO: Classificavel exige que este método seja implementado
     * 🎬 LÓGICA ESPECÍFICA: Filme usa a média de avaliações para classificar
     * 🎭 POLIMORFISMO: Permite que Filme seja tratado como Classificavel
     * 
     * 🧮 ALGORITMO:
     * - Pega a média das avaliações (método herdado de Titulo)
     * - Divide por 2 para converter escala 0-10 para 0-5
     * - Converte para int (remove decimais)
     * 
     * @Override - Anotação indica que implementa método da interface
     * @return classificação de 0 a 5 baseada na média das avaliações
     */
    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2;  // pegaMedia() é método herdado de Titulo
    }
    
}

/*
 * 📋 RESUMO DOS CONCEITOS DEMONSTRADOS:
 * 
 * 🧬 HERANÇA:
 *    Filme herda: nome, anoDeLancamento, avalia(), pegaMedia(), etc.
 *    Filme adiciona: diretor, getClassificacao()
 * 
 * 🔒 ENCAPSULAMENTO:
 *    Atributo diretor é privado
 *    Acesso controlado via getDiretor()/setDiretor()
 * 
 * 🤝 INTERFACE:
 *    Implementa Classificavel obrigatoriamente
 *    Deve ter método getClassificacao()
 * 
 * 🎭 POLIMORFISMO:
 *    Filme pode ser usado como Titulo: CalculadoraDeTempo.inclui(filme)
 *    Filme pode ser usado como Classificavel: FiltroRecomendacao.filtra(filme)
 */
