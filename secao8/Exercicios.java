package secao8;

/*

    > Exercício 1: Função para Converter Temperatura

    Crie uma função que converta uma temperatura de Celsius para Fahrenheit. 
    A função deve receber a temperatura em Celsius como argumento 
    e retornar o valor correspondente em Fahrenheit. 
    Exiba o resultado encapsulado em uma variável.
    
    > Exercício 2: Função para Calcular o Fatorial de um Número

    Crie uma função que calcule o fatorial de um número inteiro. 
    Teste a função com um número de sua escolha.
    
    > Exercício 3: Função com if-else para Verificar Paridade

    Crie uma função que receba um número inteiro 
    e retorne uma string indicando se o número é "Par" ou "Ímpar". 
    Use condicionais if-else para determinar a paridade.
    
    > Exercício 4: Função com switch para Classificar Notas

    Crie uma função que receba uma nota de 0 a 10

    10 e 9: A, 8: B, 7: C, 6: D, restante F

    e retorne uma classificação de letra (A, B, C, D, F) usando um switch. 
    Inclua uma verificação para garantir que a nota está dentro do intervalo válido.
    
    > Exercício 5: Função com System.exit para Verificar Idade

    Crie uma função que receba a idade de uma pessoa. 
    Se a idade for menor que 18, use System.exit(0) 
    para encerrar o programa com uma mensagem de "Acesso negado". 
    Caso contrário, exiba "Acesso permitido".
    
    > Exercício 6 (Desafio): Função que Recebe um Array e Retorna o Maior Número

    Crie uma função que receba um array de inteiros 
    e retorne o maior número presente no array. 
    Utilize um loop para percorrer os elementos do array e identificar o maior valor.

*/

public class Exercicios {
    
    public static void main(String[] args) {
        
        // Exercício 1
        double celsius = 25.0;
        double fahrenheit = converterTemperatura(celsius);
        System.out.println("A temperatura de " + celsius + "C é equivalente a " + fahrenheit + "F");

        // Exercício 2
        System.out.println("O fatorial de 10 é: " + calcularFatorial(10));

        // Exercício 3
        System.out.println(verificarParidade(10));
        System.out.println(verificarParidade(101));

        // Exercício 4
        System.out.println(classificarNota(11));
        System.out.println(classificarNota(10));
        System.out.println(classificarNota(8));
        System.out.println(classificarNota(3));

        // Exercício 5
        // verificarIdade(12);

        verificarIdade(44);

        // Exercício 6
        int[] numeros = {100, 5, 22, 44, 5};

        System.out.println(encontrarMaior(numeros));

    }

    // Funções
    public static double converterTemperatura(double celsius) {

        return (celsius * 9/5) + 32;

    }

    public static int calcularFatorial(int numero) {

        if(numero == 0 || numero == 1) {
            return 1;
        } else {
            return numero * calcularFatorial(numero - 1);
        }

    }

    public static String verificarParidade(int x) {

        if(x % 2 == 0) {
            return "O número " + x + " é par!";
        } else {
            return "O número " + x + " NÃO é par!";
        }

    }

    public static String classificarNota(int nota) {

        if(nota < 0 || nota > 10) {
            return "Nota inválida!";
        }

        switch (nota) {
            case 10:
            case 9:
                return "A";
            case 8:
                return "B";
            case 7:
                return "C";
            case 6:
                return "D";
            default:
                return "F";
        }

    }

    public static void verificarIdade(int idade) {

        if(idade < 18) {
            System.out.println("Acesso negado!");
            System.exit(0);
        }

        System.out.println("Acesso permitido!");

    }

    public static int encontrarMaior(int[] numeros) {

        int maior = numeros[0];

        // Contador, cond. execução, Incremento
        for(int i = 1; i < numeros.length; i++) {
            if(numeros[i] > maior) {
                maior = numeros[i];
            }
        }

        return maior;

    }
}
