package secao17;

public class ProdutoEletronico {
    
    private String nome;
    private double preco;
    private int garantia; // em meses

    public ProdutoEletronico(String nome, double preco, int garantia) {

        this.nome = nome;
        this.preco = preco;
        this.garantia = garantia;

    }

    public void aplicarDesconto(double porcentagem) {

        if(porcentagem > 0 && porcentagem <= 100) {

            double valorDesconto = calcularDesconto(porcentagem);

            preco -= valorDesconto;

            System.out.println("Desconto aplicado, o preço agora é: " + preco);

        } else {
            System.out.println("Porcentagem incorreta.");
        }

    }

    public double calcularDesconto(double porcentagem) {
        return (preco * porcentagem) / 100;
    }

    public void exibirInfo() {
        System.out.println("O produto: " + nome + ", está com o preço de: " + preco + ", e tem " + garantia + " meses de garantia.");
    }

}
