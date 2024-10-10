package secao26;

public class Servico {
    
    @Log
    public void executarTarefa() {
        System.out.println("Executando tarefa...");
    }

    @Log
    public void processarDados() {
        System.out.println("Processando dados...");
    }

}
