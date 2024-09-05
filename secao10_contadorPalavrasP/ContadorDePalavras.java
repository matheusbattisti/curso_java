package secao10_contadorPalavrasP;

/**
 * 
 * Objetivo - Criar um projeto que conta as palavras de uma frase
 * 
 * 1 - Obter uma frase do usuário
 * 2 - Contar as palavras da frase e exibir o resultado
 * 3 - Solicitar se o usuário quer digitar outra frase
 * 4 - Se sim, repetir lógica 1 e 2
 * 5 - Se não, encerrar programa
 * 
 */

 import java.util.Scanner;

public class ContadorDePalavras {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String continuar = "s";

        while(continuar.equalsIgnoreCase("s")) {

            contarPalavras();

            System.out.println("Deseja continuar? (s/n)");

            continuar = scanner.nextLine();

        }

        System.out.println("Sistema encerrado.");

        scanner.close();
        
    }

    public static void contarPalavras() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma frase: ");

        String frase = scanner.nextLine();

        // Transformar a frase em um array de strings
        String[] palavras = frase.trim().split("\\s+");

        // Java é legal
        // ['Java', 'é', 'legal']

        // Com a propriedade length, saber quantos elementos tem (elementos = palavras)
        int numeroPalavras = palavras.length;

        System.out.println("A frase contém " + numeroPalavras + " palavras.");

    }
}
