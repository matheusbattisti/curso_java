package secao25;

import java.util.regex.*;

public class Regex {

    public static void main(String[] args) {
        
        // 1 - quantificadores
        // exp. reg, text, ver se no texto há a exp. reg.
        String regex = "a*"; // zero ou mais "a"
        String texto = "b aaab aa ba";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        System.out.println("Correspondencias para a*");
        while(matcher.find()) {

            // find = encontrar algo na string

            System.out.println("'" + matcher.group() + "'");

        }

        regex = "a+"; // uma ou mais ocorrencias
        texto = "b aaab aa ba";

        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(texto);

        System.out.println("Correspondencias para a+");
        while(matcher.find()) {

            // find = encontrar algo na string

            System.out.println("'" + matcher.group() + "'");

        }

        regex = "a{2,4}"; // entre 2 a 4 a's
        texto = "b aaab aa ba";

        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(texto);

        System.out.println("Correspondencias para a{2,4}");
        while(matcher.find()) {

            // find = encontrar algo na string

            System.out.println("'" + matcher.group() + "'");

        }

        regex = "a{2}"; // apenas com 2 a's
        texto = "b aaab aa ba";

        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(texto);

        System.out.println("Correspondencias para a{2}");
        while(matcher.find()) {

            // find = encontrar algo na string

            System.out.println("'" + matcher.group() + "'");

        }

        // 2 - ancoras e fronteiras

        // ^ no inicio da string
        regex = "^c";
        texto = "carro casa cadeira";

        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(texto);

        System.out.println("Correspodencia para ^c");
        while(matcher.find()) {
            System.out.println("Encontrado: " + matcher.group());
        }

        // $ no final
        regex = "cadeira$";
        texto = "carro casa cadeira";

        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(texto);

        System.out.println("Correspodencia para a$");
        while(matcher.find()) {
            System.out.println("Encontrado: " + matcher.group());
        }

        // fronteira \b -> apenas o que ta entre os \b
        regex = "\\bpalavra\\b";
        texto = "palavra compalavra palavras";

        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(texto);

        System.out.println("Correspodencia para \\bpalavra\\b");
        while(matcher.find()) {
            System.out.println("Encontrado: " + matcher.group());
        }

        // fronteira \B -> string com fronteira com o texto a ser procurado
        regex = "\\Bpalavra";
        texto = "palavra compalavra apalavras";

        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(texto);

        System.out.println("Correspodencia para \\Bpalavra");
        while(matcher.find()) {
            System.out.println("Encontrado: " + matcher.group());
        }

        // 3 - grupos e captura
        regex = "(\\d{2})-(\\d{2})-(\\d{4})"; // (DD)-(MM)-(AAAA), \\d{2}-\\d{2}-\\d{4}
        texto = "A data de hoje é 23-09-2024 e a data de ontem foi 22-09-2024";

        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(texto);

        System.out.println("Correspondencia de grupo");
        while(matcher.find()) {
            System.out.println("Dia: " + matcher.group(1) );
            System.out.println("Mês: " + matcher.group(2 ));
            System.out.println("Ano: " + matcher.group(3) );
            System.out.println("Todos os grupos: " + matcher.group(0) ); // 0 = todos os grupos
        }

        // Backreference para substituicao
        // $1 = grupo 1, $2 = grupo 2...
        String textoSubstituido = texto.replaceAll("(\\d{2})-(\\d{2})-(\\d{4})", "$3/$2/$1");

        System.out.println("Texto após substituição: " + textoSubstituido);

        // 4 - avançando em pattern e matcher

        // correspondencia parcial
        regex = "\\d{2}";
        texto = "123ABC456";

        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(texto);

        System.out.println("Correspondencias parciais lookingAt");
        if(matcher.lookingAt()) {
            System.out.println("Encontrado: " + matcher.group());
        }

        // contando grupos com groupCount
        // alem de contar os grupos, a regex precisa estar no texto alvo
        regex = "(\\d{3})-(\\d{3})-(\\d{3})";
        texto = "123-456-712";

        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(texto);

        System.out.println("Contando grupos");
        if (matcher.matches()) {
            
            System.out.println("Total de grupos encontrados: " + matcher.groupCount());

            for(int i = 0; i <= matcher.groupCount(); i++) {
                System.out.println("Grupo " + i + " tem o valor de " + matcher.group(i));
            }

        }

        // start e end para obter posicao das correspondencias na string
        regex = "\\d{3}";
        texto = "O código é 123 e o segundo código é 456";

        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(texto);

        System.out.println("Posicao das correspondencias");
        while (matcher.find()) {
            
            // qnd eu tiver uma ocorrencia, o start é onde comeca e o end onde termina
            System.out.println("Encontrado: " + matcher.group() + ", começa em " + matcher.start() + " e termina em " + matcher.end());

        }

        // quote para tratar caracteres literais
        String literalRegex = Pattern.quote("resultado");
        texto = "A equação correta é 1+1=2 e é o resultado do exercício";

        pattern = Pattern.compile(literalRegex);
        matcher = pattern.matcher(texto);

        System.out.println("Caracteres literais");
        if(matcher.find()) {
            System.out.println("Encontrado: " + matcher.group());
            System.out.println(matcher.start() + " - " + matcher.end());
        }

        // 5 - expressoes avançadas

        // lookahead positivo -> DO QUE A GENTE SINALIZOU PARA TRÁS
        String regexLookAhead = "\\d+(?=\\$)";
        texto = "Preços: 100$ 200$ $300 $400";

        pattern = Pattern.compile(regexLookAhead);
        matcher = pattern.matcher(texto);

        System.out.println("Lookahead positivo");
        while (matcher.find()) {
            System.out.println("Encontrou: " + matcher.group());
        }

        // lookbehind positivo -> PARA FRENTE DO QUE A GENTE DEFINIU
        String regexLookBehind = "(?<=\\$)\\d+";
        texto = "Preços: 100$ 200$ $300 $400";

        pattern = Pattern.compile(regexLookBehind);
        matcher = pattern.matcher(texto);

        System.out.println("Lookbehind positivo");
        while (matcher.find()) {
            System.out.println("Encontrou: " + matcher.group());
        }

        // lookahead negativo
        // que vai encontrar palavras QUE NÃO TEM (negativo) ponto final
        // w -> a-z != é
        String regexLookAheadNegativo = "\\b\\w+\\b(?!\\.)";
        texto = "Esta é uma frase. E esta é outra";

        pattern = Pattern.compile(regexLookAheadNegativo);
        matcher = pattern.matcher(texto);

        System.out.println("Lookahead negativo");
        while (matcher.find()) {
            System.out.println("Encontrou: " + matcher.group());
        }

        // lookbehind negativo
        // Todas as palavras que não são precedidas por #
        String regexLookBehindNegativo = "(?<!#)\\b\\w+\\b";
        texto = "#java #javascript #php python";

        pattern = Pattern.compile(regexLookBehindNegativo);
        matcher = pattern.matcher(texto);

        System.out.println("Lookbehind negativo");
        while (matcher.find()) {
            System.out.println("Encontrou: " + matcher.group());
        }

        // 6 - validacao ddata e horario

        String regexData = "^([0-2][0-9]|3[01])/(0[1-9]|1[0-2])/([0-9]{4})$";
        String[] datas = {"12/09/2010", "30/30/2000", "29/01/1999"};

        System.out.println("Validar data DD/MM/YYYY");
        for(String data : datas) {
            if(validarRegex(data, regexData)) {
                System.out.println("Data válida: " + data);
            } else {
                System.out.println("Data Inválida: " + data);
            }
        }

        // Validação horário HH:MM:SS
        String regexHorario = "^([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9]$";
        String[] horarios = {"12:60:12", "10:33:32", "99:01:01"};

        System.out.println("Validar horário HH:MM:SS");
        for(String hora : horarios) {
            if(validarRegex(hora, regexHorario)) {
                System.out.println("hora válida: " + hora);
            } else {
                System.out.println("hora Inválida: " + hora);
            }
        }

        // 7 - flags

        // CASE_INSENSITIVE - q vai ignorar maiusculas e minusculas
        regex = "java";
        texto = "Java é muito bom. É legal aprender JAVA e JaVa não é tão difícil.";

        pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        matcher = pattern.matcher(texto);

        while(matcher.find()) {
            System.out.println("ENcontrado: " + matcher.group());
        }

        // Flag MULTILINE (correspondencia por linha)
        regex = "^\\d+";
        texto = "123 este é o meu texto\nQue pula linhas\n4321 termina aqui.";

        pattern = Pattern.compile(regex, Pattern.MULTILINE);
        matcher = pattern.matcher(texto);

        while(matcher.find()) {
            System.out.println("ENcontrado: " + matcher.group());
        }
    }

    public static boolean validarRegex(String texto, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        return matcher.matches();
    }
}
