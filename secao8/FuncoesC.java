package secao8;

import java.util.Arrays;
import java.util.List;

public class FuncoesC {
    

    public static void main(String[] args) {
        
        // 12 - Funçao recursiva
        int soma = somaRecursiva(6);

        // 6 + 5 + 4 + 3 + 2 + 1 = 21
        System.out.println(soma);

        // 13 - method overloading
        System.out.println(soma(2, 4));
        System.out.println(soma(2, 4, 6));
        System.out.println(soma(2.2, 4.4));

        // 14 - funcao anonima
        Runnable tarefa = () -> System.out.println("Minha função anonima!");

        tarefa.run();

        // (arg1, arg2) -> {}

        List<String> nomes = Arrays.asList("Ana", "Pedro", "Paulo");

        nomes.forEach(nome -> System.out.println(nome));

    }

    public static int somaRecursiva(int n) {

        if(n == 1) {
            return 1;
        } else {
            return n + somaRecursiva(n - 1);
        }

    }

    public static int soma(int a, int b) {
        return a + b;
    }

    public static int soma(int a, int b, int c) {
        return a + b + c;
    }

    public static double soma(double a, double b) {
        return a + b;
    }
}
