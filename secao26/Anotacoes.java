package secao26;

import java.lang.reflect.Field;

public class Anotacoes {
    

    public static void main(String[] args) {
    
        // 1 - annotations pre definidas
        Cachorro cachorro = new Cachorro();

        cachorro.emitirSom();

        cachorro.testeMover();

        // 2 - annotation customizada
        Exemplo exemplo = new Exemplo();

        // anotações geralmente vão precisar de try catch

        // loop em cada um dos métodos
        for(var metodo : exemplo.getClass().getDeclaredMethods()) {

            System.out.println(metodo);

            // verifica se a anotacao esta presente no método
            if(metodo.isAnnotationPresent(Executar.class)) {

                // resgatar ql é a annotation
                Executar anotacao = metodo.getAnnotation(Executar.class);

                // loop baseado em qts vezes tem q executar
                for(int i = 0; i < anotacao.vezes(); i++) {

                    // invoco o método -> mostrarMensagem
                    try {
                        metodo.invoke(exemplo);
                    } catch (Exception e) {
                        System.out.println("Erro: " + e.getMessage());
                    }

                }

            }

        }


        // 3 - annotation para validar campos
        Usuario usuario = new Usuario("", "joao@gmail.com");

        validarCampos(usuario);

        Usuario usuario2 = new Usuario("", "");

        validarCampos(usuario2);
    }


    // funcao para validar campos anotados
    public static void validarCampos(Object objeto) throws IllegalArgumentException {

        // Pegar a classe, pegar os campos, verificar se eles tem annotation

        Class<?> classe = objeto.getClass();

        for(Field campo : classe.getDeclaredFields()) {

            if(campo.isAnnotationPresent(NotEmpty.class)) {

                // saber o valor de message de cada campo
                NotEmpty anotacao = campo.getAnnotation(NotEmpty.class);

                // ativar a acessibilidade do campo privado
                campo.setAccessible(true);

                try {
                    Object valor = campo.get(objeto);

                    // validar o campo
                    if(valor == null || valor.toString().isEmpty()) {
                        System.out.println(anotacao.message());
                    }

                } catch (Exception e) {
                    System.out.println("Erro: " + e.getMessage());
                }

            }

            // 4 - annotation com processador

            Servico servico = new Servico();

            try {
                
                LogProcessor.processarLogs(servico);

            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }

        } 
    }

}
