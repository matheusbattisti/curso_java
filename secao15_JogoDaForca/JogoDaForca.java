package secao15_JogoDaForca;

/**
 *  1 - Importar Scanner: Importar a classe Scanner para capturar a entrada do usuário.

    2 - Definir Palavra Secreta: Criar uma variável palavraSecreta 
    com a palavra a ser adivinhada e inicializar um array palavraOculta 
    com caracteres de sublinhado _ para representar a palavra oculta.

    3 -Configurar Tentativas: Definir o número máximo de tentativas 
    e uma variável para verificar se o usuário venceu.

    4 - Loop Principal: Criar um loop que continua enquanto houver tentativas restantes.

    5 - Exibir Status: Mostrar a palavra oculta e o número de tentativas restantes. 
    Solicitar a entrada do usuário para uma letra.

    6 - Verificar Letra: Comparar a letra inserida com a palavra secreta. 
    Atualizar a palavra oculta se a letra for correta. 
    Diminuir o número de tentativas se a letra for incorreta.

    7 - Verificar Vitória: Verificar se a palavra oculta corresponde à palavra secreta 
    e sair do loop se o usuário vencer.

    8 -Finalizar Jogo: Exibir mensagem de vitória ou derrota e mostrar a palavra secreta.

    9 -Fechar Scanner: Fechar o Scanner para liberar recursos.
 */

 import java.util.Scanner;

public class JogoDaForca {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Definir a palavra a ser advinhada
        String palavraSecreta = "JAVA";

        char[] palavraOculta = new char[palavraSecreta.length()];

        for(int i = 0; i < palavraSecreta.length(); i++) {
            palavraOculta[i] = '_';
        }

        // número máximo de tentativas
        int tentativas = 6;
        boolean venceu = false;

        // Loop que solicita as letras para o usuario
        while(tentativas > 0) {

            System.out.println("Palavra: " + String.valueOf(palavraOculta));
            System.out.println("Tentativas restantes: " + tentativas);
            System.out.println("Digite uma letra: ");

            char letra = scanner.next().toUpperCase().charAt(0);

            System.out.println(letra);

            boolean acertou = false;

            for(int i = 0; i < palavraSecreta.length(); i++) {

                if(palavraSecreta.charAt(i) == letra) {
                    palavraOculta[i] = letra;
                    acertou = true;
                }

            }

            // Dedução de tentativas
            if(!acertou) {
                tentativas--;
                System.out.println("Letra incorreta.");
            } else {
                System.out.println("Letra correta.");
            }


            if(String.valueOf(palavraOculta).equals(palavraSecreta)) {
                venceu = true;
                break;
            }

        }

        // A condição de vitória
        if(venceu) {
            System.out.println("Parabéns, você venceu! Ainda restavam " + tentativas + " tentativas.");
        } else {
            System.out.println("Você perdeu!");
        }

        System.out.println("A palavra era: " + palavraSecreta);

        scanner.close();
    }

}
