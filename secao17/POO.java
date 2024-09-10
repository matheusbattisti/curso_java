package secao17;

public class POO {
    
    public static void main(String[] args) {
        

        // 1 - Criar classe
        // criação de Carro.java

        // 2 - Instanciar a classe
        Carro fusca = new Carro();

        // Acessar props e métodos sintaxe:
        // NOMEOBJETO.PROP e NOMEOBJETO.METODO()
        fusca.marca = "VW";
        fusca.modelo = "Fusca";
        fusca.ano = 1964;

        fusca.acelerar();
        fusca.exibirInfo();

        Carro carro2 = new Carro();

        carro2.marca = "Fiat";
        carro2.modelo = "Fusca";

        carro2.exibirInfo();

        System.out.println(fusca == carro2);

        // 3 - métodos
        fusca.aumentarVelocidade(10.0);

        fusca.ligarMotor();

        fusca.aumentarVelocidade(20.0);

        fusca.aumentarVelocidade(30.0);


        System.out.println(fusca.motorLigado);

        // 4 - Criando propriedades
        Pessoa joao = new Pessoa();

        // PROTEGIDO: joao.nome = "João";
        joao.setNome("João");

        System.out.println("O nome do João é:  " + joao.getNome());

        joao.setIdade(33);

        System.out.println(joao.getIdade());

        // 5 - Setters
        ContaBancaria ContaDaAna = new ContaBancaria();

        ContaDaAna.setTitular("Ana");

        ContaDaAna.setSaldo(1000);

        ContaDaAna.exibirInfo();

        System.out.println(ContaDaAna.getTitular());

        System.out.println(ContaDaAna.getSaldo());

        // 6 - Logica em get e set

        Produto camisa = new Produto();

        camisa.setNome("Camisa regata");

        System.out.println(camisa.getNome());

        camisa.setPreco(29.99999999999999);

        System.out.println(camisa.getPreco());


        // 7 - Método dentro de método
        System.out.println(camisa.getProdutoInfo());

        camisa.aplicarDesconto(10);
        camisa.aplicarDesconto(0);

        // 8 - Construtores

        Livro meuLivro = new Livro("Harry Potter", "J K Rowlling", 31.90);

        meuLivro.exibirInfo();

        Livro meuLivro2 = new Livro();

        meuLivro2.exibirInfo();

    }


}
