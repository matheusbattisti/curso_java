package secao17;

import java.util.Arrays;

public class POO2 {
    
    public static void main(String[] args) {
        
        // 1 - Niveis de acesso
        Funcionario funcionario1 = new Funcionario("Matheus", 2000, "teste123");

        funcionario1.exibirDados();

        funcionario1.nome = "Teste";
        funcionario1.salario = 1500;
        // funcionario1.senha = "teste4321";

        funcionario1.exibirDados();

        funcionario1.aumentarSalario(10);

        // System.out.println(funcionario1.verificarSenha());

        if(funcionario1.autenticar("teste123")) {
            System.out.println("Usuário entrou no sistema");
        }

        // 2 - Classe imutável
        PessoaImutavel joaquim = new PessoaImutavel("Joaquim", 23);

        System.out.println(joaquim.getIdade());
        System.out.println(joaquim.getNome());

        // joaquim.nome = "teste";

        // 3 - Encapsulamento de arrays

        String[] meusAlunos = {"Matheus", "João", "Maria"};

        Turma novaTurma = new Turma(meusAlunos);

        System.out.println(Arrays.toString(novaTurma.getAlunos()));

        String[] outrosAlunos = {"ALuno 1", "Aluno 2"};

        novaTurma.setAlunos(outrosAlunos);

        System.out.println(Arrays.toString(novaTurma.getAlunos()));
 
    }

}
