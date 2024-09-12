package secao19_CadastroAlunosP;

import java.util.Scanner;

public class Aluno {
    
    // Criar as propriedades
    private String nome;
    private String matricula;
    private double[] notas;

    // Constructor
    public Aluno(String nome, String matricula, int numeroDeNotas) {

        this.nome = nome;
        this.matricula = matricula;
        this.notas = new double[numeroDeNotas];

    }

    public String getNome() {
        return nome;
    }

    // Adicionando notas ao array de notas do aluno
    public void adicionarNotas(Scanner scanner) {

        System.out.println("Digite as notas para o aluno " + nome + ":");

        for(int i = 0; i < notas.length; i++) {

            System.out.println("Digite a nota " + (i + 1) + ":");

            notas[i] = scanner.nextDouble();

        }

    }

    // Calculando a média de notas
    public double calcularMedia() {
        double soma = 0;

        for(double nota : notas) {
            soma += nota;
        }

        return soma / notas.length;

    }

    // Mostrando se aluno passou ou nao
    public void exibirResultado() {

        double media = calcularMedia();

        System.out.println("Nome: " + nome);
        System.out.println("Matricula: " + matricula);
        System.out.println("Média final: " + media);

        if(media >= 6.0) {
            System.out.println("O aluno foi aprovado.");
        } else {
            System.out.println("O aluno foi reprovado.");
        }

    }

}
