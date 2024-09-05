package secao11;

public class Loops {
    
    public static void main(String[] args) {
        
        // 1 - for

        // loop que vai rodar de 1 a 5

        // Variavel de inicializacao = i, j, k
        // Condição -> determina até quando ou quantas vezes, o loop vai rodar
        // incremento -> a variável vai chegar na condição
        for(int i = 1; i <= 5; i++) {
            // repetir
            System.out.println("Contador: " + i);
        } 

        // mostrar cada caractere de uma string
        String palavra = "Java";

        // length em strings da o numero de letras

        // arrays e strings a primeira posicao é o 0
        // J -> 0, a -> 3
        for(int i = 0; i < palavra.length(); i++) {

            // palavra.charAt(0) => palavra.charAt(1) ...
            // i < 4
            System.out.println("Caractere: " + palavra.charAt(i));

        }

        // contagem regressiva
        for(int i = 5; i > 0; i--) {
            System.out.println("Contador: " + i);
        }

        // 2 - While
        int i = 0;

        while(i <= 5) {

            System.out.println("While contador: " + i);
            // 
            // 
            // 
            // 
            // 

            i++;
        }

        int valor = 0;

        while(valor != 7) {

            // .111 => 1
            valor = (int)(Math.random() * 100);

            System.out.println("Valor aleatorio: " + valor);

        }

        // 3 - loop infinito

        // while(true) {
        //     System.out.println("Infinito!");
        // }

        // for(int j = 0; j <= 5; j--) {
        //     System.out.println(j);
        // }

        // 4 - do while

        int j = 10;

        do {

            System.out.println("O valor de j é: " + j);

            j--;
        } while(j > 0);

        int numero = 0;

        do {

            numero = (int)(Math.random() * 10);

            System.out.println("numero aleatorio: " + numero);

        } while (numero != 1);

        // 5 - break

        // break pode ser utilizado com qlqr estrutura de loop

        for(int x = 0; x <= 10; x++) {

            System.out.println("O valor de x é: " + x);

            if(x == 5) {
                System.out.println("Parando o loop!");
                break;
            }

        }

        // 6 - continue

        for(int x = 10; x > 0; x--) {

            System.out.println("teste");

            if(x % 2 == 0) {
                System.out.println("par!");
                continue;
            }

            // quando ele pula, isso aqui nao executa

            System.out.println("Contador: " + x);

        }

        // 7 - nested loops

        for(int m = 1;  m <= 3; m++) {

            System.out.println("EXTERNO!");

            for(int n = 1; n <= 3; n++) {

                System.out.println(m + " x " + n + " = " + (m * n));

            }

        }

        // Padrão de estrelas
        for(int o = 1; o <= 10; o++) {

            for(int p = 1; p <= o; p++) {
                System.out.print("*");
            }

            System.out.println();

        }

    }

}
