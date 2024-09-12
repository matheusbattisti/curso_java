package secao20;

public class Pessoa {
    
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Override - sobrescrita
    // Não é uma boa pratica fazer sobrescrita de métodos do Java
    @Override
    public String toString() {
        return "Nome: " + nome + ", idade: " + idade;
    }

}
