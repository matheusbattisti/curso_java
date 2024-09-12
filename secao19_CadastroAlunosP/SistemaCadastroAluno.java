package secao19_CadastroAlunosP;

/**
 * 
    Criando o Sistema de Cadastro de Alunos
    
    > 1 - Criar a Classe Aluno:

    Crie a classe Aluno que irá representar cada aluno do sistema.
    Declare os atributos privados: nome, matricula (do tipo String) 
    e notas (um array de double).
    
    > 2 - Criar o Construtor da Classe Aluno:

    Defina um construtor que receba o nome, a matrícula 
    e o número de notas que o aluno terá.
    Dentro do construtor, inicialize o array notas com o tamanho recebido.
    
    > 3 - Método para Adicionar Notas:

    Crie o método adicionarNotas(Scanner scanner) na classe Aluno.
    Dentro desse método, peça ao usuário para digitar as notas uma a uma e 
    armazene cada nota no array notas.
    
    > 4 - Método para Calcular a Média:

    Implemente o método calcularMedia(), 
    que deve somar todas as notas do array notas e dividir pelo número de notas.
    Retorne a média calculada.
    
    > 5 - Método para Exibir o Resultado:

    Crie o método exibirResultado() que:
    Exiba o nome do aluno, a matrícula e a média final calculada.
    Verifique se o aluno foi aprovado ou reprovado com base na média. 
    (Aprovado se média >= 6.0).
    
    > 6 - Criar a Classe SistemaCadastroAlunos:

    Crie a classe principal SistemaCadastroAlunos.
    No método main(), use um Scanner para coletar o número de alunos que o usuário deseja cadastrar.
    
    > 7 - Cadastrar os Alunos:

    Dentro de um loop for, peça ao usuário o nome, a matrícula 
    e o número de notas para cada aluno.
    Para cada aluno, crie um novo objeto Aluno e armazene no array alunos[].
    Use o método adicionarNotas() para permitir que o usuário insira 
    as notas para cada aluno.
    
    > 8 - Calcular e Exibir Resultados:

    Após cadastrar todos os alunos, crie um loop para percorrer o array de alunos.
    Para cada aluno, chame o método exibirResultado() para calcular 
    e exibir a média e o status (aprovado ou reprovado).
    
    > 9 - Fechar o Scanner:

    Ao final do programa, lembre-se de fechar o Scanner para evitar vazamento de recursos.
    
 */

import java.util.Scanner;

public class SistemaCadastroAluno {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Solicitar o número de alunos a serem cadastrados
        System.out.println("Quantos alunos deseja cadastrar?");
        int numeroDeAlunos = scanner.nextInt();

        // Criacao de array de alunos
        Aluno[] alunos = new Aluno[numeroDeAlunos];

        // Rodar um loop para cadastrar os alunos
        for(int i = 0; i < numeroDeAlunos; i++) {

            System.out.println("Cadastro de aluno " + (i + 1) + ": ");

            System.out.println("Nome: ");
            String nome = scanner.next();

            System.out.println("Matricula: ");
            String matricula = scanner.next();

            System.out.println("Quantidade de provas: ");

            int numeroDeNotas = scanner.nextInt();

            scanner.nextLine();

            Aluno aluno = new Aluno(nome, matricula, numeroDeNotas);

            // Adicionar as notas
            aluno.adicionarNotas(scanner);

            // Armazenar o aluno no array
            alunos[i] = aluno;

        }

        // Exibir os resultados
        System.out.println("Resultado dos alunos:");
        for(Aluno aluno : alunos) {
            aluno.exibirResultado();
            System.out.println();
        }

        scanner.close();

    }

}
