package secao18_Loteria;

/**
 * 
    > 1 - Criar a Classe Bilhete:

    Defina os atributos privados numerosEscolhidos (array de inteiros) e resultadoSorteio (array de inteiros).
    Crie um construtor que receba os números escolhidos pelo jogador e atribua ao atributo numerosEscolhidos.
    
    > 2 - Método realizarSorteio:

    Dentro da classe Bilhete, crie o método realizarSorteio.
    Use a classe Random para gerar 6 números aleatórios entre 1 e 60.
    Armazene esses números no array resultadoSorteio 
    e ordene os números usando Arrays.sort().
    
    > 3 - Método contarAcertos:

    Crie o método contarAcertos dentro da classe Bilhete.
    Compare os números escolhidos pelo jogador com os números sorteados 
    e conte quantos números coincidem.
    Retorne o número de acertos.
    
    > 4 - Método exibirResultado:

    Crie o método exibirResultado dentro da classe Bilhete.
    Use Arrays.toString() para exibir os números escolhidos e os números sorteados.
    Chame o método contarAcertos e exiba quantos números foram acertados.
    
    > 5 - Criar a Classe SimuladorLoteria:

    No método main, use a classe Scanner para permitir que o jogador insira 6 números.
    Armazene esses números em um array e crie um novo objeto Bilhete com esses números.
    Repita esse processo para permitir o registro de vários bilhetes.
    
    > 6 - Realizar o Sorteio:

    Após registrar os bilhetes, para cada bilhete, chame o método realizarSorteio.
    Exiba os resultados de cada bilhete chamando o método exibirResultado.
    
    > 7 - Fechar o Scanner:

    Ao final do programa, lembre-se de fechar o Scanner para evitar vazamento de recursos.
 
    */

public class SimuladorLoteria {
    
}
