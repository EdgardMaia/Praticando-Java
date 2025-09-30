package screenMatch.modelos;

/**
 * 🏛️ CLASSE TITULO - SUPERCLASSE (CLASSE PAI)
 * 
 * Esta é a classe base que demonstra os conceitos fundamentais de POO:
 * 
 * 🔒 ENCAPSULAMENTO:
 * - Todos os atributos são PRIVADOS (private)
 * - Acesso controlado apenas através de métodos PÚBLICOS (getters/setters)
 * - Protege a integridade dos dados
 * 
 * 🧬 HERANÇA:
 * - Serve como classe pai para Filme e Serie
 * - Define características e comportamentos comuns
 * - Subclasses herdam todos os atributos e métodos
 * 
 * 🎯 RESPONSABILIDADE:
 * - Gerenciar dados básicos de qualquer título (filme/série)
 * - Controlar sistema de avaliações
 * - Calcular médias de forma segura
 */
public class Titulo {
    
    // ========================================
    // 🔒 ATRIBUTOS PRIVADOS (ENCAPSULAMENTO)
    // ========================================
    
    // ✨ Todos os atributos são PRIVADOS para garantir encapsulamento
    // Só podem ser acessados através dos métodos públicos (getters/setters)
    
    private String nome;                    // Nome do título (filme/série)
    private int anoDeLancamento;           // Ano de lançamento
    private boolean incluidoNoPlano;       // Se está incluído no plano de streaming
    private double somaDasAvaliacoes;      // 🔒 CRÍTICO: Soma total das notas (protegido)
    private int totalDeAvaliacoes;         // 🔒 CRÍTICO: Contador de avaliações (protegido)
    private int duracaoEmMinutos;          // Duração em minutos

    // ========================================
    // 🔓 MÉTODOS PÚBLICOS - GETTERS (LEITURA)
    // ========================================
    
    /**
     * 🔍 GETTER: Permite ler o nome (atributo privado)
     * Demonstra ENCAPSULAMENTO - acesso controlado aos dados
     */
    public String getNome() {
        return nome;
    }

    /**
     * 🔍 GETTER: Permite ler o ano de lançamento
     */
    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    /**
     * 🔍 GETTER: Verifica se está incluído no plano
     * Nota: Para boolean, usa-se "is" em vez de "get"
     */
    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    /**
     * 🔍 GETTER: Retorna duração em minutos
     * 🎭 IMPORTANTE: Este método pode ser SOBRESCRITO (override) pelas subclasses
     * - Filme: retorna valor fixo definido
     * - Serie: calcula dinamicamente (temporadas × episódios × minutos)
     */
    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    /**
     * 🔍 GETTER: Retorna total de avaliações
     * 🛡️ PROTEÇÃO: Usuário não pode alterar diretamente este valor
     */
    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    // ========================================
    // ✏️ MÉTODOS PÚBLICOS - SETTERS (ESCRITA)
    // ========================================
    
    /**
     * ✏️ SETTER: Define o nome do título
     * 🔒 ENCAPSULAMENTO: Controla como o nome é definido
     * Poderia incluir validações (ex: nome não pode ser vazio)
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * ✏️ SETTER: Define o ano de lançamento  
     * 🔒 ENCAPSULAMENTO: Poderia incluir validação (ex: ano > 1900)
     */
    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    /**
     * ✏️ SETTER: Define se está incluído no plano
     */
    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    /**
     * ✏️ SETTER: Define duração em minutos
     * 🎭 NOTA: Usado principalmente por Filme
     * Serie sobrescreve getDuracaoEmMinutos() então não usa muito este setter
     */
    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    // ========================================
    // 🎯 MÉTODOS DE COMPORTAMENTO
    // ========================================
    
    /**
     * 📋 MÉTODO DE EXIBIÇÃO: Mostra informações básicas
     * 🧬 HERANÇA: Este método será herdado por Filme e Serie
     * 🔄 ABSTRAÇÃO: Esconde detalhes de formatação da saída
     */
    public void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }

    /**
     * ⭐ MÉTODO DE AVALIAÇÃO: Adiciona uma nota ao título
     * 
     * 🔒 ENCAPSULAMENTO CRÍTICO:
     * - Este método controla COMO as avaliações são armazenadas
     * - Protege a integridade dos dados internos
     * - Usuário não pode manipular diretamente somaDasAvaliacoes ou totalDeAvaliacoes
     * - Garante que ambos os valores sejam sempre atualizados juntos
     * 
     * 🛡️ VANTAGENS DO ENCAPSULAMENTO:
     * - Impossível ter soma incorreta (ex: usuário não pode fazer somaDasAvaliacoes = -100)
     * - Impossível ter contador inconsistente
     * - Validações podem ser adicionadas aqui (ex: nota entre 0-10)
     * 
     * @param nota A nota a ser adicionada (0-10)
     */
    public void avalia(double nota){
        somaDasAvaliacoes += nota;    // Soma a nota ao total
        totalDeAvaliacoes++;          // Incrementa contador de avaliações
    }

    /**
     * 📊 MÉTODO DE CÁLCULO: Retorna a média das avaliações
     * 
     * 🔒 ENCAPSULAMENTO:
     * - Protege o cálculo da média
     * - Usuário não precisa saber como é calculado
     * - Evita erros de divisão por zero ou cálculos incorretos
     * 
     * 🔄 ABSTRAÇÃO:
     * - Esconde a complexidade do cálculo
     * - Interface simples para o usuário: apenas chama pegaMedia()
     * 
     * 🛡️ PROTEÇÃO:
     * - Se não houver avaliações, poderia retornar 0 ou lançar exceção
     * - Atualmente assume que sempre há avaliações (totalDeAvaliacoes > 0)
     * 
     * @return A média aritmética das avaliações
     */
    public double pegaMedia(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }

    // ========================================
    // 📄 REPRESENTAÇÃO TEXTUAL DO OBJETO
    // ========================================
    
    /**
     * 📄 MÉTODO TOSTRING: Representação amigável do objeto
     * 
     * 🔄 ABSTRAÇÃO:
     * - Esconde detalhes internos do objeto (códigos hash, etc.)
     * - Mostra informações relevantes para o usuário
     * 
     * 🎭 POLIMORFISMO:
     * - Automaticamente chamado quando objeto é usado em String
     * - System.out.println(filme) chama automaticamente toString()
     * - Cada subclasse pode sobrescrever para personalizar
     * 
     * 🧬 HERANÇA:
     * - Filme e Serie herdam este método
     * - Podem usar como está ou sobrescrever conforme necessário
     * 
     * 💡 BENEFÍCIOS:
     * - Debug mais fácil: vê dados ao invés de códigos
     * - Logs mais informativos
     * - Interface mais amigável para o usuário
     * 
     * @return String formatada com nome e ano do título
     */
    @Override
    public String toString() {
        return String.format("%s (%d)", nome, anoDeLancamento);
    }
}