package secao21;

import java.io.*;

public class Erros {

    public static void main(String[] args) {
        
        // 1 - try catch
        try {

            int a = 0;
            int b = 10;

            int resultado = b / a;

        } catch(ArithmeticException e) {

            System.out.println("Divisão por 0 não é possível.");

        }

        try {
            
            int[] numeros = {1,2,3};

            System.out.println(numeros[3]);

        } catch (Exception error) {
            
            System.out.println("Erro genérico");

            System.out.println("Msg: " + error.getMessage());

        }

        // Excessão e o erro => para o mesmo fim

        // 2 - finally
        try {
            
            int[] numeros = {1,2,3};

            System.out.println(numeros[3]);

        } catch (ArrayIndexOutOfBoundsException error) {
            
            System.out.println("Erro genérico finally");

            System.out.println("Msg: " + error.getMessage());

        } finally {
            System.out.println("Executou o finally");
        }  
        
        try {
            
            int[] numeros = {1,2,3};

            System.out.println("Acessando indice existente: " + numeros[2]);

        } catch (ArrayIndexOutOfBoundsException error) {
            
            System.out.println("Erro genérico finally");

            System.out.println("Msg: " + error.getMessage());

        } finally {
            System.out.println("Executou o finally");
        }   

        try {
            
            int[] numeros = {1,2,3};

            System.out.println("Acessando indice sem catch: " + numeros[2]);

        } finally {
            System.out.println("Executou o finally");
        }  

        // 3 - verificadas e nao verificadas

        // verificada

        try {
            BufferedReader reader = new BufferedReader(new FileReader("arquivo.txt"));
            String linha = reader.readLine();
            System.out.println(linha);
        } catch (Exception e) {
            System.out.println("Erro ao ler arquivo: " + e.getMessage());
        }

        // não verificadas
        String texto = null;

        // System.out.println(texto.length());

        // 4 - exceções com throw

        try {   

            validarIdade(20);
            
            validarIdade(10);

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

        // 5 - exceções customizadas

        Banco minhaConta = new Banco(5000);

        try {
            
            minhaConta.sacar(6000);

        } catch (Exception e) {
           
            System.out.println("Erro: " + e.getMessage());

        }

        // 6 - throws em métodos

        try {
            
            processarArquivo("/var/www/arquivo.txt");

        } catch (FileNotFoundException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch(IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        // 7 - Encadeamento de exceções
        try {
            
            abrirArquivo(null);

        } catch (Exception e) {
            
            System.out.println("Mensagem: " + e.getMessage());

            System.out.println("Causa original: " + e.getCause());

        }

        // 8 - multicatch
        
        try {
            
            processarArquivo("asd");
            
        } catch (NullPointerException | IOException e) {
            
            System.out.println("Erro multicatch: " + e.getMessage());

        }
        
        // 9 - re lancar as excecoes
        try {
            
            processarDados(null);

        } catch (Exception e) {
            
            System.out.println("Outra coisa...");

            System.out.println("MSG: " + e.getMessage());

            System.out.println("Pilha de execução: " + e.getStackTrace());

        }

    }

    public static void validarIdade(int idade) {

        if(idade < 18) {
            throw new IllegalArgumentException("Idade deve ser maior que 18.");
        }

        System.out.println("Idade válida :" + idade);

    }

    public static void processarArquivo(String caminho) throws FileNotFoundException, IOException {

        if(caminho == null || caminho.isEmpty()) {
            throw new IOException("Caminho inválido.");
        }

        File arquivo = new File(caminho);

        if(!arquivo.exists()) {
            throw new FileNotFoundException("Arquivo não encontrado.");
        }

        System.out.println("Arquivo encontrado com sucesso!");

    }

    public static void abrirArquivo(String caminho) {

        try {
            
            if(caminho == null) {
                throw new NullPointerException("Caminho nulo.");
            }

            throw new FileNotFoundException("Arquivo não encontrado");

        } catch (FileNotFoundException e) {
            
            NullPointerException npe = new NullPointerException("Erro ao processar arquivo");

            npe.initCause(e);

            throw npe;

        }

    }


    public static void processarDados(String dados) throws Exception {

        try {
            
            if(dados == null) {
                throw new NullPointerException("Os dados são nulos.");
            }


        } catch (Exception e) {

            System.out.println("Tratamento, criação de log, ...");

            throw e;
        }


    }
}