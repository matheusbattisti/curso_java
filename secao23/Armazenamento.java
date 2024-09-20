package secao23;

public interface Armazenamento<T> {

    void salvar(T item);
    T recuperar();

}
