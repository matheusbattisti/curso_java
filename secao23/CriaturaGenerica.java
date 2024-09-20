package secao23;

public class CriaturaGenerica<T extends Animal & Nadador & Voador> {
    
    private T criatura;

    public CriaturaGenerica(T criatura) {
        this.criatura = criatura;
    }

    public void usarHabilidades() {
        criatura.mover();
        criatura.nadar();
        criatura.voar();
    }

}
