package secao17;

public class ContaCorrente {
    
    private String titular;
    private double saldo;
    private double limiteSaque;

    public ContaCorrente(String titular, double saldo, double limiteSaque) {
        this.titular = titular;
        this.saldo = saldo;
        this.limiteSaque = limiteSaque;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de: " + valor + ", o saldo agora é: " + saldo);
    }

    public void sacar(double valor) {
        if(valor <= saldo && valor <= limiteSaque) {
            saldo -= valor;
            System.out.println("Saque de: " + valor + ", o saldo agora é: " + saldo);
        } else {
            System.out.println("Saque inválido.");
        }
    }

    public void exibirSaldo() {
        System.out.println("Titular: " + titular + ". Tem na conta o total de: " + saldo);
    }

}
