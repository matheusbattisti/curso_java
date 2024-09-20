package secao23;

// T -> não é alguma coisa, é QUALQUER COISA
public class Caixa<T> {
    
    private T conteudo;

    public void adicionar(T conteudo) {
        this.conteudo = conteudo;
    }

    public T obter() {
        return conteudo;
    }

}
