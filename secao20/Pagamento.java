package secao20;

interface Pagamento {
    
    // método abstrato
    void processarPagamento(double valor);

    // método com default
    default void exibirRecibo(double valor) {
        System.out.println("Recibo do pagamento, com valor de R$" + valor);
    }

}
