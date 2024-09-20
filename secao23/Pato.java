package secao23;

public class Pato extends Animal implements Nadador, Voador {
    
    @Override
    public void voar() {
        System.out.println("O pato está voando");
    }

    @Override
    public void nadar() {
        System.out.println("O pato está nadando");
    }

}
