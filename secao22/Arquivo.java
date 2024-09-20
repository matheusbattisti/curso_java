package secao22;

import java.io.*;

import java.awt.*;

import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

import java.nio.file.*;

import java.util.zip.*;

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

        try (
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(currentDir + "video.mkv"));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(currentDir + "copia_video.mkv"))
        ) {
            
            byte[] buffer = new byte[1024]; // Buffer 1kb em 1kb

            int bytesLidos;

            while((bytesLidos = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesLidos);
            }

            System.out.println("Vídeo copiado com sucesso.");

        } catch (Exception e) {
            System.out.println("Erro ao copiar vídeo: " + e.getMessage());
        }

        // 5 - manipulação de imagem

        // imagem.jpg e colocar um texto no centro

        try {

            BufferedImage imagem = ImageIO.read(new File(currentDir + "imagem.jpg"));
            
            if(imagem == null) {
                System.out.println("A imagem não pode ser carregada.");
                return;
            } 

            Graphics2D g2d = imagem.createGraphics();

            // preparando o texto
            g2d.setFont(new Font("Arial", Font.BOLD, 50));
            FontMetrics fm = g2d.getFontMetrics();
            String texto = "Texto no Centro";

            // centralizar texto na imagem
            int larguraTexto = fm.stringWidth(texto);
            int alturaTexto = fm.getHeight();

            // posicionamento
            int x = (imagem.getWidth() - larguraTexto) / 2;
            int y = (imagem.getHeight() - alturaTexto) / 2 + fm.getAscent();

            // desenhar retangulo
            g2d.setColor(Color.BLACK);
            g2d.fillRect(x - 10, y - fm.getAscent(), larguraTexto + 20, alturaTexto);

            // desenhar o texto em cima do retangulo
            g2d.setColor(Color.RED);
            g2d.drawString(texto, x, y);

            // liberacao de recursos
            g2d.dispose();

            // salvar a imagem
            File outputFile = new File(currentDir + "imagem_com_texto.png");

            ImageIO.write(imagem, "png", outputFile);

            System.out.println("Gerou o texto na imagem com sucesso.");


        } catch (Exception e) {
            System.out.println("Erro ao processar imagem: " + e.getMessage());
        }

        // 6 - manip. de arquivos e diretorios


        // criacao de dirs.

        // eu nunca instanciei Paths ou Files
        // como eu posso usar os metodos? pq sao static

        Path caminhoDiretorio = Paths.get(currentDir + "diretorioNovo");

        try {
            
            if(!Files.exists(caminhoDiretorio)) {
                Files.createDirectories(caminhoDiretorio);

                System.out.println("Diretorio criado com sucesso: " + caminhoDiretorio.toString());

            } else {

                System.out.println("Diretório já existe.");

            }

        } catch (Exception e) {
            System.out.println("Erro ao criar diretorio: " + e.getMessage());
        }

        // criar, copiar e mover arquivos

        Path caminhoArquivoOriginal = Paths.get(currentDir + "arquivo_criado.txt");
        Path caminhoArquivoCopia = Paths.get(currentDir + "arquivo_criado_copia.txt");
        Path caminhoArquivoMovido = Paths.get(currentDir, "diretorioNovo", "arquivo_movido.txt");

        try {
            
            // criar
            if(!Files.exists(caminhoArquivoOriginal)) {
                Files.createFile(caminhoArquivoOriginal);
                System.out.println("Arquivo criado.");
            }

            // copiar
            if(!Files.exists(caminhoArquivoCopia)) {
                Files.copy(caminhoArquivoOriginal, caminhoArquivoCopia);
            }

            // mover
            Files.move(caminhoArquivoCopia, caminhoArquivoMovido);

        } catch (Exception e) {
            System.out.println("Erro ao fazer ações com arquivos: " + e.getMessage());
        }


        // 7 - arquivos temporarios

        try {
            
            Path arquivoTemporario = Files.createTempFile("meuTempFile", ".txt");

            System.out.println("Arquivo criado em: " + arquivoTemporario.toAbsolutePath());

            Files.writeString(arquivoTemporario, "Conteúdo temporário");

            String conteudo = Files.readString(arquivoTemporario);

            System.out.println("Conteúdo: " + conteudo);

            Files.deleteIfExists(arquivoTemporario);

        } catch (Exception e) {
            System.out.println("Erro ao criar arquivo temporario: " + e.getMessage());
        }

        // 8 - arquivos zip

        // comprimir
        Path arquivoOriginal = Paths.get(currentDir + "arquivo.txt");
        Path arquivoZip = Paths.get(currentDir + "arquivo_comprimido.zip");

        try (
            ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(arquivoZip.toFile()));
            FileInputStream fis = new FileInputStream(arquivoOriginal.toFile())
        ) {
            
            // cria uma entrada ZIP para o arquivo
            ZipEntry zipEntry = new ZipEntry(arquivoOriginal.getFileName().toString());

            zos.putNextEntry(zipEntry);

            // Le o conteudo do arquivo e grava no zip
            byte[] buffer = new byte[1024];
            int bytesRead;

            while((bytesRead = fis.read(buffer)) != -1) {
                zos.write(buffer, 0, bytesRead);
            }

            // fechar a entrada do zip
            zos.closeEntry();
            System.out.println("Arquivo compactado com sucesso.");


        } catch (Exception e) {
            System.out.println("Erro ao compactar arquivo: " + e.getMessage());
        }

        // descomprimir        
        Path arquivoZipado = Paths.get(currentDir + "arquivo_comprimido.zip");
        Path destino = Paths.get(currentDir + "descompactado");

        try (
            ZipInputStream zis = new ZipInputStream(new FileInputStream(arquivoZipado.toFile()))
        ) {

            ZipEntry zipEntry;

            // criar o diretorio se nao existir
            if(!Files.exists(destino)) {
                Files.createDirectories(destino);
            }

            // iterar em cada um dos arquivos zip
            while((zipEntry = zis.getNextEntry()) != null) {

                Path caminhoDestino = destino.resolve(zipEntry.getName());

                // /destino -> /destino/arquivo.txt
                // /destino -> /destino/arquivo2.txt

                try(FileOutputStream fos = new FileOutputStream(caminhoDestino.toFile())) {

                    // Le o conteudo do arquivo e grava no zip
                    byte[] buffer = new byte[1024];
                    int bytesRead;

                    while((bytesRead = zis.read(buffer)) != -1) {
                        fos.write(buffer, 0, bytesRead);
                    }

                }

                System.out.println("Arquivo descompactado: " + caminhoDestino);

                zis.closeEntry();

            }
            
        } catch (Exception e) {
            System.out.println("Erro ao descompactar arquivo: " + e.getMessage());
        }

        // 9 - manipulacao csv \

        // leitura
        String arquivoCSV = currentDir + "dados.csv";
        String linha;
        String separador = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(arquivoCSV))) {
            
            while((linha = br.readLine()) != null) {

                // dividir a string / explodir a string em array
                String[] dados = linha.split(separador);

                System.out.println("Nome: " + dados[0] + ", Idade: " + dados[1] + ", Cidade: " + dados[2]);

            }

        } catch (Exception e) {
            System.out.println("Erro ao ler CSV: " + e.getMessage());
        }

        // escrita
        String arquivoEscritaCSV = currentDir + "dadosEscrita.csv";

        try (FileWriter writer = new FileWriter(arquivoEscritaCSV)) {
            
            // insercao de linha a linha, respeitando o separador e quebrando linha no final
            writer.append("Nome,Idade,Cidade\n");
            writer.append("Isabel,22,Rio de Janeiro\n");
            writer.append("Maria,45,Florianópolis\n");
            writer.append("Igor,19,Cachoeirinha\n");

            System.out.println("Conteúdo gravado no CSV com sucesso.");

        } catch (Exception e) {
            System.out.println("Erro ao escrever em CSV: " + e.getMessage());
        }

    }
}
