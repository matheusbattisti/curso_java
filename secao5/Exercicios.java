package secao5;

import java.util.Scanner;

/*
    > Exercício 1: Verificação de Categoria de Preço

    Peça ao usuário para inserir o preço de um produto. 
    Se o preço for menor que 50, categorize-o como "Barato". 
    Se estiver entre 50 e 100, categorize como "Médio". 
    Se for maior que 100, categorize como "Caro". Exiba a categoria correspondente.
    
    > Exercício 2: Validação de Login

    Peça ao usuário para inserir um nome de usuário e uma senha. 
    Verifique se o nome de usuário é "admin" e a senha é "1234". 
    Se ambos forem corretos, exiba "Acesso permitido". 
    Caso contrário, exiba "Acesso negado".
    
    > Exercício 3: Identificação de Paridade com Strings

    Peça ao usuário para inserir um número. 
    Verifique se o número é par ou ímpar, e exiba a palavra "Par" ou "Ímpar". 
    Use uma string para armazenar o resultado e exibi-la.

    Depois de avaliar o número, tu vai colocar se é par ou impar em uma var.
    
    > Exercício 4: Identificação de Dia Útil

    Peça ao usuário para inserir um número de 1 a 7, 
    representando os dias da semana (1 para domingo, 2 para segunda, etc.). 
    Use switch para verificar se o dia é um dia útil (segunda a sexta) 
    ou final de semana (sábado e domingo). 
    Exiba uma mensagem correspondente.
    
    > Exercício 5: Verificação de Intervalo com AND

    Peça ao usuário para inserir um número. 
    Verifique se o número está no intervalo de 10 a 20, inclusive. 
    Se estiver, exiba "Dentro do intervalo". Caso contrário, exiba "Fora do intervalo".
    
    > Exercício 6: Classificação de Letra

    Peça ao usuário para inserir uma letra. 
    Verifique se a letra é uma vogal (a, e, i, o, u) ou uma consoante. 
    Exiba "Vogal" ou "Consoante" de acordo com a entrada. 
    Considere tanto letras maiúsculas quanto minúsculas. 

    */

public class Exercicios {

    public static void main(String[] args) {
        
        // Exercicio 1
        Scanner scanner = new Scanner(System.in);

        // System.out.println("Digite o preço do produto: ");

        // double preco = scanner.nextDouble();

        // if(preco < 50) {
        //     System.out.println("Categoria: Barato");
        // } else if(preco >= 50 && preco <= 100) {
        //     System.out.println("Categoria: Médio");
        // } else {
        //     System.out.println("Categoria: Caro");
        // }

        // Exerício 2
        // System.out.println("Digite o nome do usuário: ");

        // String usuario = scanner.next();

        // System.out.println("Digite a senha do usuário: ");

        // String senha = scanner.next();

        // // String => equals
        // if(usuario.equals("admin") && senha.equals("1234")) {
        //     System.out.println("Acesso permitido.");
        // } else {
        //     System.out.println("Acesso negado.");
        // }

        // Exercício 3
        // System.out.println("Digite um número: ");

        // int numero = scanner.nextInt();

        // // 12 / 2 = 6 -> resto 0;
        // // 13 / 2 = 6 -> resto 1;
        // String resultado = "";
        
        // if(numero % 2 == 0) {
        //     resultado = "Par";
        // } else {
        //     resultado = "Ímpar";
        // }

        // System.out.println("O numero é: " + resultado);

        // Exercício 4
        // System.out.println("Insira um número de 1 a 7 (referente ao dia da semana):");

        // int dia = scanner.nextInt();

        // switch (dia) {
        //     case 1:
        //     case 7:
        //         System.out.println("Final de semana");    
        //         break;
        //     case 2:
        //     case 3:
        //     case 4:
        //     case 5:
        //     case 6:
        //         System.out.println("Dia de semana");    
        //         break;
        //     default:
        //         System.out.println("Número inválido!");
        //         break;
        // }

        // Exercício 5
        // System.out.println("Insira um número:");

        // int n = scanner.nextInt();

        // if(n >= 10 && n <= 20) {
        //     System.out.println("Dentro do intervalo.");
        // } else {
        //     System.out.println("Fora do intervalo.");
        // }

        // Exercício 6
        System.out.println("Insira uma letra:");

        // equalsIgnoreCase OU toLowerCase
        char letra = scanner.next().toLowerCase().charAt(0);

        switch (letra) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Vogal");
                break;
            default:
                System.out.println("Consoante");
                break;
        }

        scanner.close();

    }
    
}
