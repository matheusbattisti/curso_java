package secao2;

import java.util.Scanner;

public class TesteScanner {
    

    public static void main(String[] args) {
        
        // 1 - testando scanner
        Scanner scanner = new Scanner(System.in);

        // Mensagem para usuario entender o que precisa digitar
        System.out.println("Digite o seu nome: ");

        // Resgata o valor do terminal
        String nome = scanner.nextLine();

        // Exibe o valor
        System.out.println("Olá " + nome + "!");

        // nextInt
        System.out.println("Digite a sua idade:");

        int idade = scanner.nextInt();

        System.out.println("Você tem " + idade + " anos.");





        // 2 - Problema do nextLine

        System.out.println("Digite um número: ");

        int n = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Digite um texto: ");

        String txt = scanner.nextLine();

        System.out.println("Os dados são, n = " + n + " e txt = " + txt);


        // Fechamento do scanner, para evitar memory leak
        scanner.close();

    }
}
