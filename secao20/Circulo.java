package secao20;

public class Circulo extends Forma {
    
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    // Sobrescrita => respeita retorno, nome e argumentos do método
    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }

}
