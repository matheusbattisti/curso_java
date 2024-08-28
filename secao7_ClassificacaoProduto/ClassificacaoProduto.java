package secao7_ClassificacaoProduto;

// Ter três produtos catalogados => Nome
// Pedir o nome do produto => Novo ou de um ja existente
// Verificar se o produto está catalogado
// Se sim, podemos escolher alterar o preço ou não
    // Se alterar o preco, exibir classificação (Abaixo)
    // Se não alterar, Encerrar programa
// Se não, pedir o preço do produto
    // Exibir classificação
// Classificações: preco < 50 = barato, 50 a 100 = moderado, maior que 100 = caro
// Exibir no fim nome do produto e preço

import java.util.Scanner;

public class ClassificacaoProduto {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Catalogo de produtos
        String produto1 = "Teclado";
        String produto2 = "Mouse";
        String produto3 = "Mointor";

        double preco = 0;

        System.out.println("Digite o nome do produto: ");

        String nomeProduto = scanner.nextLine();

        // Ver se o produto está no catalogo
        if(produto1.equalsIgnoreCase(nomeProduto) || 
        produto2.equalsIgnoreCase(nomeProduto) || 
        produto3.equalsIgnoreCase(nomeProduto)) {

            System.out.println("Produto já existe. Quer atualizar o preço? (sim/não)");

            String resposta = scanner.nextLine();

            if(resposta.equalsIgnoreCase("sim")) {

                System.out.println("Insira o novo preço: ");
                preco = scanner.nextDouble();

            } else {

                System.out.println("Preço não atualizado!");
                scanner.close();
                return;

            }

        } else {

            System.out.println("Insira o preço do produto: ");
            preco = scanner.nextDouble();

        }

        // Classificação do preço
        if(preco < 50) {
            System.out.println("Classificação: barato");
        } else if(preco >= 50 && preco <= 100) {
            System.out.println("Classificação: moderado");
        } else {
            System.out.println("Classificação: Caro");
        }

        System.out.println("Produto: " + nomeProduto + ". Preço: " + preco);

        scanner.close();

    }
    
}
