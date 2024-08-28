// Obter nome do aluno e 3 notas
// Exibir mensagem com nome e média final
// Bônus: Se a nota for maior ou igual a 7, imprimir Aprovado, se não: Reprovado

package secao4_media;

import java.util.Scanner;

public class MediaAluno {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Obter o nome
        System.out.println("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        // Obter as notas
        System.out.println("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.println("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.println("O nome do aluno é: " + nome + ". E sua média foi: " + media);


        if(media >= 7.0) {
            System.out.println("Aluno aprovado!");
        } else {
            System.out.println("Aluno reprovado!");
        }

        scanner.close();

    }

}
