package secao8;

public class Funcoes {
    
    public static void main(String[] args) {
        
        // 1 - Criando a primeira função
        // tanto funcoes como variáveis, a gente nomeia
        saudacao();
        saudacao();
        saudacao();

    }

    // NIVEL DE ACESSO, STATIC => não preciso instanciar classe para executar, TIPO RETORNO
    // NOME, OS PARENTESES (ARGS), BLOCO {}
    public static void saudacao() {

        System.out.println("Olá, esta é a minha primeira função!");

    }

}
