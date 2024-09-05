package secao13_jogoAdvinhacaoP;

/**
 *  
 * Objetivo: O usuário precisa acertar um número aleatorio entre 1 e 100
 * 
 * 1 - Criar um número aleatorio (1 e 100)
 * 2 - Pedir o palpite do usuário
 * 3 - Salvar as tentativas que foram erradas (contagem) - while até acertar
 * 4 - Enquanto o usuário não acerta, exibir se o numero alvo é maior ou menor que o palpite
 * 5 - Exibir mensagem de sucesso se ele acertar, com contagem de tentativas
 *  
 */

 import java.util.Scanner;

 import java.util.Random;

public class JogoAdvinhacao {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Obter o número aleatório
        int numeroSecreto = random.nextInt(100) + 1;

        int palpite = 0;
        int tentativas = 0;


        while(palpite != numeroSecreto) {

            System.out.println("Digite o seu palpite: ");

            palpite = scanner.nextInt();

            tentativas++;


            if(palpite < numeroSecreto) {

                System.out.println("O número é maior que " + palpite + "! Tente novamente.");

            } else if(palpite > numeroSecreto) {

                System.out.println("O número é menor que " + palpite + "! Tente novamente.");

            } else {
                System.out.println("Parabéns, você ganhou! O número secreto " + numeroSecreto + " foi encontrado com " + tentativas + " tentativas!");
            }

        }
        
        scanner.close();
    }
}
