package secao16_VerificadorDeSenha;

/**
    1 - Importar Scanner: Importar a classe Scanner para capturar a entrada do usuário.

    2 - Receber Senha: Solicitar ao usuário que digite uma senha 
    e armazená-la em uma variável.

    3 - Verificar Força da Senha: Chamar o método verificarForcaSenha 
    para avaliar a força da senha.

    > mais de x caracteres +1
    > se tem letras  +1
    > se tem caracteres especiais +1
    > se tem numeros +1

    forca = 3

    'a senha tem seguranca média'

    4 - Avaliar e Exibir Resultado: Exibir uma mensagem indicando a força da senha 
    com base no valor retornado.

    5 - Fechar Scanner: Fechar o Scanner para liberar recursos.
 */

import java.util.Scanner;

public class VerificadorForcaSenha {
    

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Pegar a senha do usuário
        System.out.println("Digite a senha: ");
        String senha = scanner.next();

        // Verificar a força
        int forca = verificarForcaSenha(senha);

        // Passar a mensagem para o usuário, dependendo da força
        if(forca <= 2) {
            System.out.println("A sua senha é fraca.");
        } else if(forca == 3) {
            System.out.println("A sua senha é média.");
        } else if(forca == 4) {
            System.out.println("A sua senha é segura.");
        } else {
            System.out.println("A sua senha é muito forte.");
        }

        scanner.close();

    }


    public static int verificarForcaSenha(String senha) {

        int forca = 0;

        // Lógica para ver se a senha é forte
        if(senha.length() > 8) {
            forca++;
        }

        // letras maiúsculas de a a z
        if(senha.matches(".*[A-Z].*")) {
            forca++;
        }

        // letras minúsculas de a a z
        if(senha.matches(".*[a-z].*")) {
            forca++;
        }

        // verificar se tem números
        if(senha.matches(".*\\d.*")) {
            forca++;
        }

        // - > traço
        // - > intervalo entre 2 caracteres
        if(senha.matches(".*[!@#$%&*()\\-_?<>].*")) {
            forca++;
        }

        return forca;

    }

}
