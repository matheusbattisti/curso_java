package secao20.Exercicios;

public class Hidroaviao extends Barco implements Pilotavel {
    
    @Override
    public void pilotar() {
        System.out.println("O hidroavião está voando e depois vai navegar.");
    }

}
