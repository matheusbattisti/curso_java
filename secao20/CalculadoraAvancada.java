package secao20;

public class CalculadoraAvancada implements Calculadora {
    
    @Override
    public int somar(int a, int b) {
        return a + b;
    }

    @Override
    public int multiplicar(int a, int b) {
        System.out.println("Multiplicando...");
        return a * b;
    }
}
