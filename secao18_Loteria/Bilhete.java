package secao18_Loteria;

import java.util.Random;
import java.util.Arrays;

public class Bilhete {
    
    private int[] numerosEscolhidos;
    private int[] resultadoSorteio;

    public Bilhete(int[] numerosEscolhidos) {
        this.numerosEscolhidos = numerosEscolhidos;
    }

    // Método para realizar o sorteio
    public void realizarSorteio() {

        Random random = new Random();

        resultadoSorteio = new int[6];

        for(int i = 0; i < resultadoSorteio.length; i++) {

            resultadoSorteio[i] = random.nextInt(60) + 1;

        }

        Arrays.sort(resultadoSorteio);

    }

    // Método para contar quantos números o jogador acertou
    public int contarAcertos() {

        int acertos = 0;

        for(int numeroEscolhido : numerosEscolhidos) {
            for(int numeroSorteado : resultadoSorteio) {
                if(numeroEscolhido == numeroSorteado) {
                    acertos++;
                }
            }
        }

        return acertos;

    }

    // Exibir os resultados
    public void exibirResultado() {
        System.out.println("Números escolhidos: " + Arrays.toString(numerosEscolhidos));
        System.out.println("Números sorteados: " + Arrays.toString(resultadoSorteio));

        int acertos = contarAcertos();

        System.out.println("Você acertou " + acertos + " acertos.");
        System.out.println();

    }

}
