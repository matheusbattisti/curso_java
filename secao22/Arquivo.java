package secao22;

import java.io.*;

public class Arquivo {
 
    public static void main(String[] args) {
        
        // 1 - Leitura de arquivos
        String currentDir = System.getProperty("user.dir") + "\\secao22\\";

        System.out.println(currentDir); 
        System.out.println("D:\\CURSOS\\42_JAVA\\curso\\secao22\\");        

        // Windows -> \
        // Linux -> /

        // FileReader = caracter por caracter
        // BufferedReader = linha por linha

        try (FileReader reader = new FileReader(currentDir + "arquivo.txt")) {
            
            int caracter;

            while((caracter = reader.read()) != -1) {
                System.out.print((char) caracter);
            }

        } catch (Exception e) {
           
            System.out.println("Erro ao ler arquivo: " + e.getMessage());

        }

        System.out.println();

        try (BufferedReader reader = new BufferedReader(new FileReader(currentDir + "arquivo.txt"))) {
            
            String linha;

            while((linha = reader.readLine()) != null) {
                System.out.println(linha);
            }

        } catch (Exception e) {
           
            System.out.println("Erro ao ler arquivo: " + e.getMessage());

        }

        // 2 - Escrever em arquivos

        try (FileWriter writer = new FileWriter(currentDir + "saida.txt")) {
            
            writer.write("Escrevendo em arquivo \n");
            writer.write("Escrevendo em arquivo 2");

        } catch (Exception e) {
            System.out.println("Erro ao escrever em arquivo: " + e.getMessage());
        }


        try (BufferedWriter writer = new BufferedWriter(new FileWriter(currentDir + "saida2.txt"))) {
            
            writer.write("Escrevendo em arquivo com o buffered");
            writer.newLine();
            writer.write("Escrevendo em arquivo com o buffered 2");
            writer.newLine();

        } catch (Exception e) {
            System.out.println("Erro ao escrever em arquivo: " + e.getMessage());
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(currentDir + "saida2.txt", true))) {
            
            writer.append("Testando");

        } catch (Exception e) {
            System.out.println("Erro ao escrever em arquivo: " + e.getMessage());
        }

        // 3 - serializacao de objetos
        Pessoa pessoa = new Pessoa("Matheus", 33);

        System.out.println(pessoa.getNome());

        // serializacao

        // arquivos serializados, tem a extensão .ser

        // SERIALIZAR = OUTPUT

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(currentDir + "pessoa.ser"))) {
            
            oos.writeObject(pessoa);

            System.out.println("Objeto serializado com sucesso.");

        } catch (Exception e) {
            System.out.println("Erro ao serializar objeto: " + e.getMessage());
        }

        // deserializacao = INPUT
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(currentDir + "pessoa.ser"))) {
            
            Pessoa pessoa2 = (Pessoa) ois.readObject();

            System.out.println("Nome: " + pessoa2.getNome());
            System.out.println("Idade: " + pessoa2.getIdade());

        } catch (Exception e) {
            System.out.println("Erro ao deserializar objeto: " + e.getMessage());
        }

        // 4 - manipulacao de binários

        try (
            FileInputStream fis = new FileInputStream(currentDir + "imagem.jpg");
            FileOutputStream fos = new FileOutputStream(currentDir + "copia_imagem.jpg");
        ) {
            
            int byteData;

            while((byteData = fis.read()) != -1) {
                fos.write(byteData);
            }

            System.out.println("Arquivo copiado com sucesso.");

        } catch (Exception e) {
            System.out.println("Erro ao copiar arquivo: " + e.getMessage());
        }

    }
}
