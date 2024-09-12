package secao20;

public class Funcionario {

    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void exibirDetalhes() {
        System.out.println("Nome do funcionario: " + nome);
    }

    public double calcularBonus() {
        return salario * .1;
    }
    
}
