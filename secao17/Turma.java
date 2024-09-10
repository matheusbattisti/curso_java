package secao17;

import java.util.Arrays;

public class Turma {
    
    private String[] alunos;

    public Turma(String[] alunos) {
        this.alunos = Arrays.copyOf(alunos, alunos.length);
    }

    public String[] getAlunos() {
        return Arrays.copyOf(alunos, alunos.length);
    }

    public void setAlunos(String[] alunos) {

        if(alunos.length > 0) {
            this.alunos = Arrays.copyOf(alunos, alunos.length);
        }

    }

}
