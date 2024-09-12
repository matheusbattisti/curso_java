package secao20;

abstract class InstrumentoMusical {
    
    protected String nome;

    public InstrumentoMusical(String nome) {
        this.nome = nome;
    }

    // abstrato: tem que ser implementado na subclasse
    public abstract void tocar();

    // concreto: pode ser herdado
    public void exibirDetalhes() {
        System.out.println("Instrumento: " + nome);
    }

}
