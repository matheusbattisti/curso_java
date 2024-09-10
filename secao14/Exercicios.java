package secao14;

/**
 * 
    > Exercício 1: Inverter Elementos de um Array

    Crie um programa que receba um array de inteiros do usuário 
    e inverta a ordem dos elementos. 
    Exiba o array original e o array invertido.

    [1, 2, 3]
    [3, 2, 1]
    
    > Exercício 2: Encontrar o Elemento Mais Frequente em um Array

    Desenvolva um programa que receba um array de inteiros 
    e determine qual elemento aparece com maior frequência. 
    Caso haja empate, exiba todos os elementos empatados.
    
    > Exercício 3: Transpor uma Matriz 2D

    Crie um programa que receba uma matriz 2D 
    e crie a matriz transposta (troca de linhas por colunas). 
    Exiba a matriz original e a matriz transposta.
    
    > Exercício 4: Substituir Valores em um Array com Condição

    Escreva um programa que receba um array de inteiros 
    e substitua todos os valores negativos por zero. 
    Exiba o array antes e depois da modificação.


    // [ -1, 2 , 3]
    // [0, 2, 3]
    
    > Exercício 5: Remover Elementos Duplicados de um Array

    Desenvolva um programa que remova os elementos duplicados de um array de inteiros, 
    mantendo apenas a primeira ocorrência de cada valor. 
    Exiba o array original e o array sem duplicatas.

    [1, 1, 2, 2, 3]
    [1, 2, 3]
    
*/

import java.util.Arrays;
import java.util.ArrayList;

public class Exercicios {
    
    public static void main(String[] args) {
        
        // Exercício 1
        int[] arrayOriginal = {1, 2, 3, 4, 5};
        int[] arrayInvertido = new int[arrayOriginal.length];

        for(int i = 0; i < arrayOriginal.length; i++) {

            arrayInvertido[i] = arrayOriginal[arrayOriginal.length - 1 - i];

        }

        System.out.println(Arrays.toString(arrayOriginal));
        System.out.println(Arrays.toString(arrayInvertido));

        // Exercício
        int[] arrayInteiros = {1, 2, 2, 3, 4, 4, 4, 5 };

        int maisFrequente = arrayInteiros[0];

        int maxContagem = 1;

        for(int i = 0; i < arrayInteiros.length; i++) {

            int contagem = 0;

            for(int j = 0; j < arrayInteiros.length; j++) {
                if(arrayInteiros[j] == arrayInteiros[i]) {
                    contagem++;
                }
            }

            if(contagem > maxContagem) {
                maxContagem = contagem;
                maisFrequente = arrayInteiros[i];
            }

        }

        System.out.println("O mais frequente é: " + maisFrequente);


        // Exercício 3
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] matrizTransposta = new int[matriz[0].length][matriz.length];

        for(int[] linha : matrizTransposta) {
            System.out.println(Arrays.toString(linha));
        }

        for(int i =  0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[0].length; j++) {
                matrizTransposta[j][i] = matriz[i][j];
            }
        }

        for(int[] linha : matrizTransposta) {
            System.out.println(Arrays.toString(linha));
        }

        // Exercício 4
        int[] arrayComNegativos = {1, -2, 3, -4, 5, -6};

        System.out.println(Arrays.toString(arrayComNegativos));

        for(int i = 0; i < arrayComNegativos.length; i++) {

            if(arrayComNegativos[i] < 0) {
                arrayComNegativos[i] = 0;
            }

        }

        System.out.println(Arrays.toString(arrayComNegativos));

        // Exercício 5

        int[] arrayComDuplicados = {1, 2, 2, 2, 3, 4, 4, 5};

        // array numerico sem qtd de elementos definida
        ArrayList<Integer> arraySemDuplicados = new ArrayList<>(); 
        
        for(int numero : arrayComDuplicados) {

            if(!arraySemDuplicados.contains(numero)) {
                arraySemDuplicados.add(numero);
            }

        }

        System.out.println(Arrays.toString(arrayComDuplicados));
        System.out.println(arraySemDuplicados);

    }
}
