package secao20.Exercicios;

public class FuncionarioMeioPeriodo extends Funcionario implements Beneficios {
    
    private double salarioPorHora;
    private int horasTrabalhadas;

    public FuncionarioMeioPeriodo(String nome, double salarioPorHora, int horasTrabalhadas) {

        super(nome);

        this.horasTrabalhadas = horasTrabalhadas;
        this.salarioPorHora = salarioPorHora;

    }

    @Override
    public double calcularSalario() {
        return salarioPorHora * horasTrabalhadas;
    }

    @Override
    public void adicionarBeneficio(String beneficio) {
        System.out.println("Benefício adicionado para meio período: " + beneficio);
    }
}
