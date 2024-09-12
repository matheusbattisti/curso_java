package secao20.Exercicios;

abstract class Funcionario {
    
    protected String nome;

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public abstract double calcularSalario();

}
