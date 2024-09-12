package secao20;

public class TransferenciaBancaria implements Pagamento {
    
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento de R$" + valor + ", via transferência bancária.");
    }

    @Override
    public void exibirRecibo(double valor) {
        System.out.println("O valor de R$" + valor + " foi transferido para o banco.");
    }

}
