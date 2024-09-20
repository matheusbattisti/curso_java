package secao23;

import java.util.*;

public class Generics {
    
    public static void main(String[] args) {
        
        // 1 - classes genéricas

        // quando instanciamos o objeto, agora o T é ALGUMA COISA
        Caixa<Integer> caixaInteira = new Caixa<>();

        caixaInteira.adicionar(100);

        System.out.println(caixaInteira.obter());

        Caixa<String> caixaStr = new Caixa<>();

        caixaStr.adicionar("teste");

        System.out.println(caixaStr.obter());

        // 2 - métodos genericos
        System.out.println("Maior valor entre 5 e 10: " + obterMaior(5, 10));

        System.out.println("Maior valor entre Java e Python: " + obterMaior("Java", "Python"));

        String[] letras = {"a", "b", "c", "d"};

        Integer[] numeros = {12, 44, 123, 999};

        Boolean[] bools = {true, false, false, true};

        imprimirArray(letras);

        imprimirArray(numeros);

        imprimirArray(bools);

        System.out.println();

        // 3 - bounded types
        Comparador<Integer> comparadorInteiros = new Comparador<>();

        System.out.println("Maior numero entre 20 e 10: " + comparadorInteiros.obterMaior(20, 10));

        Comparador<Double> comparadorInteiros2 = new Comparador<>();

        System.out.println("Maior numero entre 1.95 e 4.55: " + comparadorInteiros2.obterMaior(1.95, 4.55));
    
        // Erro de compilação
        // Comparador<String> comparadorStrings = new Comparador<>();

        // 4 - wildcard
        List<Integer> numeros2 = List.of(1, 2, 3);
        List<String> palavras2 = List.of("teste", "Java", "olá");

        // aceita qualquer tipo de lista (?)
        imprimirLista(numeros2);

        imprimirLista(palavras2);

        // aceita listas numericas (? extends Number)
        System.out.println(somarNumeros(numeros2));

        // somarNumeros(palavras2);

        // aceita apenas tipos numericos especificos
        // Number > Integer (5,4,3)
        List<Integer> numeros3 = new ArrayList<>();

        // adicionarNumeros aceita apenas Lista de Inteiros
        adicionarNumeros(numeros3);

        for(Integer numero : numeros3) {
            System.out.println(numero);
        }

        // 5 - generics com collections
        List<Integer> listaInteiros = new ArrayList<>();

        listaInteiros.add(10);
        listaInteiros.add(20);
        listaInteiros.add(30);
        listaInteiros.add(25);
        // listaInteiros.add(30.1);

        for(Number numero : listaInteiros) {
            System.out.println(numero);
        }

        Set<String> conjuntoDePalavras = new HashSet<>();

        conjuntoDePalavras.add("Java");
        conjuntoDePalavras.add("Java");
        conjuntoDePalavras.add("Generics");

        for(String palavras : conjuntoDePalavras) {
            System.out.println(palavras);
        }

        Map<String, Integer> mapaDeIdades = new HashMap<>();

        mapaDeIdades.put("Matheus", 33);
        mapaDeIdades.put("Maria", 21);
        mapaDeIdades.put("João", 18);

        for(Map.Entry<String, Integer> entrada : mapaDeIdades.entrySet()) {
            System.out.println(entrada.getKey() + " tem " + entrada.getValue() + " anos de idade.");
        }

        // 6 - generics com interfaces
        Armazenamento<String> aTexto = new ArmazenamentosTexto();

        aTexto.salvar("teste");

        System.out.println(aTexto.recuperar());

        Armazenamento<Integer> aNumero = new ArmazenamentoNumeros();

        aNumero.salvar(14);

        System.out.println(aNumero.recuperar());

        // 7 - Restrição multipla de tipos
        Pato pato = new Pato();

        CriaturaGenerica<Pato> criaturaPato = new CriaturaGenerica<>(pato);

        criaturaPato.usarHabilidades();

    }

    public static <T extends Comparable<T>> T obterMaior(T valor1, T valor2) {
        return (valor1.compareTo(valor2) > 0) ? valor1 : valor2;
    }

    public static <K> void imprimirArray(K[] array) {
        for(K elemento : array) {
            System.out.print(elemento + ", ");
        }
    }

    public static void imprimirLista(List<?> lista) {
        for(Object elemento : lista) {
            System.out.println(elemento);
        }
    }

    public static double somarNumeros(List<? extends Number> lista) {
        double soma = 0;

        for(Number numero : lista) {
            soma += numero.doubleValue();
        }

        return soma;

    }

    public static void adicionarNumeros(List<? super Integer> lista) {

        for(int i = 1; i <= 5; i++) {
            lista.add(i);
        }

    }
}
