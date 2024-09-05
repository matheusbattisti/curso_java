/**

    > Exercício 1: Somatório com for

    Crie um programa que use um loop for para calcular 
    o somatório dos números de 1 a 100 e exiba o resultado.
    1 + 2 + 3... = x
    
    > Exercício 2: Impressão de Números Pares com while

    Desenvolva um programa que use um loop while para imprimir 
    todos os números pares de 1 a 20.
    
    > Exercício 3: Verificação de Número Primo com for

    Escreva um programa que receba um número do usuário 
    e use um loop for para verificar se ele é primo.
    
    > Exercício 4: Menu Interativo com do-while

    Crie um programa que exiba um menu interativo usando do-while, 
    permitindo ao usuário escolher opções até que ele decida sair.

    // menu de opcoes com print: 1) comida 2) bebida
    // um numero aleatorio que mediante a ser X, pare o loop
    
    > Exercício 5: Fatorial de um Número com for

    Desenvolva um programa que calcule o 
    fatorial de um número inteiro positivo usando um loop for.

    5 * 4 * 3 * 2 * 1

    1 * 2 * 3 * 4 * 5
    
    > Exercício 6: Contagem de Dígitos de um Número com while

    Crie um programa que conte quantos dígitos há em um número inteiro positivo 
    usando um loop while.

    1000 = 4 digitos

 */

package secao11;

public class Exercicios {
    
    public static void main(String[] args) {
        
        // Exercício 1

        int somatorio = 0;

        for(int i = 0; i <= 100; i++) {

            somatorio += i;

        }

        System.out.println("Soma de 1 a 100: " + somatorio);

        // Exercício 2
        int numero = 1;

        while(numero <= 20) {

            if(numero % 2 == 0) {
                System.out.println("Número par: " + numero);
            }

            numero++;
        }

        // Exercício 3
        int numPrimo = 23;

        boolean ePrimo = true;

        // testar se ele é primo mesmo
        for(int i = 2; i < numPrimo; i++) {

            // dividir esse cara e não ter resto, ele não é primo
            // 1 e por ele mesmo
            if(numPrimo % i == 0) {
                ePrimo = false;
                break;
            }

        }

        if(ePrimo) {
            System.out.println("O numero " + numPrimo + " é primo!");
        } else {
            System.out.println("O numero " + numPrimo + " NÃO é primo!");
        }

        // Exercício 4
        int opcao;

        do {

            System.out.println("Exercício 4 - Menu");
            System.out.println("0) Refrigerante");
            System.out.println("1) Hamburger");
            System.out.println("2) Cachorro quente");
            System.out.println("3) Sushi");
            System.out.println("4) Sair");

            opcao = (int)(Math.random() * 5);

            System.out.println("A opção escolhida foi: " + opcao);

        } while(opcao != 4);

        // Exercício 5
        int numFatorial = 12;
        int fatorial = 1;

        for(int i = 1; i <= numFatorial; i++) {

            fatorial *= i;

        }

        System.out.println("O fatorial de " + numFatorial + " é igual a " + fatorial);

        // Exercício 6

        int numeroParaContar = 48484848;

        int contador = 0;

        while(numeroParaContar != 0) {

            numeroParaContar = numeroParaContar / 10;

            System.out.println(numeroParaContar);

            contador++;
        }

        System.out.println("Numero de dígitos: " + contador);

    }
}
