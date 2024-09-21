package secao24;

import java.lang.foreign.Linker.Option;
import java.util.*;

import java.util.stream.*;

public class Colecoes {
    
    public static void main(String[] args) {
        
        // 1 - List
        List<String> listaDeNomes = new ArrayList<>();

        // adicionar
        listaDeNomes.add("Maria");
        listaDeNomes.add("João");
        listaDeNomes.add("Pedro");

        // resgatar
        System.out.println("Primeiro nome: " + listaDeNomes.get(0));

        // alterar
        listaDeNomes.set(1, "Ana");

        System.out.println("Segundo nome: " + listaDeNomes.get(1));

        // Remover el
        listaDeNomes.remove(2);

        // Erro de execução, fora dos indices do array
        // System.out.println("Segundo nome: " + listaDeNomes.get(2));

        listaDeNomes.add("Teste");
        listaDeNomes.add("Outro teste");

        // Procura por valor de item
        System.out.println(listaDeNomes.contains("Teste"));


        // LinkedList
        List<Integer> numeros = new LinkedList<>();

        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);

        System.out.println(numeros.get(3));

        numeros.remove(0);

        // Ver os valores facilmente
        System.out.println(numeros.toString());

        numeros.set(0, 23);

        System.out.println(numeros.get(0));

        // As collections tem os mesmos métodos, qualquer uma
        // mas nem todas, podem aplicá-los

        // 2 - set

        // HashSet - reordena os elementos
        Set<String> conjunto = new HashSet<>();

        conjunto.add("Java");
        conjunto.add("Python");
        conjunto.add("PHP");
        conjunto.add("PHP");

        System.out.println(conjunto);

        System.out.println(conjunto.contains("PHP"));

        // LinkedHashSet - mantem ordem
        Set<Integer> numeros2 = new LinkedHashSet<>();

        numeros2.add(5);
        numeros2.add(10);
        numeros2.add(1);
        numeros2.add(2);
        numeros2.add(55);

        System.out.println(numeros2);

        // TreeSet - reordena elementos
        Set<String> nomes = new TreeSet<>();

        nomes.add("Maria");
        nomes.add("João");
        nomes.add("Roberto");
        nomes.add("Alan");

        System.out.println(nomes);

        // Set não tem get
        // System.out.println(nomes.get(0));

        // 3 - map

        // Hashmap
        Map<String, Integer> idadeMap = new HashMap<>();

        // adiciona no map com o put
        idadeMap.put("João", 30);
        idadeMap.put("Matheus", 33);
        idadeMap.put("Alan", 18);

        System.out.println(idadeMap);

        // map com chave ja existente, atualiza valor
        idadeMap.put("Alan", 24);

        System.out.println(idadeMap);

        System.out.println("Idade de Alan: " + idadeMap.get("Alan"));

        // Remove elementos
        idadeMap.remove("Matheus");

        System.out.println(idadeMap);

        // encontrando por chave, e por valor
        System.out.println(idadeMap.containsKey("Alan"));
        System.out.println(idadeMap.containsValue(99));

        // exibe valores
        System.out.println(idadeMap.entrySet());

        // LinkedHashMap
        Map<String, String> capitalMap = new LinkedHashMap<>();

        capitalMap.put("Brasil", "Brasília");
        capitalMap.put("Argentina", "Buenos Aires");
        capitalMap.put("França", "Paris");

        System.out.println(capitalMap.entrySet());

        System.out.println(capitalMap.containsKey("Brasil"));

        // TreeMap - reordena os itens
        Map<String, Double> produtoPrecoMap = new TreeMap<>();

        produtoPrecoMap.put("Maçã", 3.50);
        produtoPrecoMap.put("Pera", 4.50);
        produtoPrecoMap.put("Leite", 5.50);
        produtoPrecoMap.put("Avelã", 11.0);

        System.out.println(produtoPrecoMap);

        System.out.println(produtoPrecoMap.containsValue(11.0));

        // 4 - iterando

        // for-each
        for(String nome : nomes) {
            System.out.println(nome);
        }

        // Iterator
        Iterator<String> nomesIterator = nomes.iterator();

        // remover um elemento
        while(nomesIterator.hasNext()) {

            String nome = nomesIterator.next();

            if(nome.equals("João")) {
                nomesIterator.remove();
            }

        }

        System.out.println(nomes);

        // ListIterator
        ListIterator<String> listIteratorNomes = listaDeNomes.listIterator();

        while(listIteratorNomes.hasNext()) {
            System.out.println("Nome: " + listIteratorNomes.next());
        }

        while(listIteratorNomes.hasPrevious()) {
            System.out.println("Nome: " + listIteratorNomes.previous());
        }

        // 5 - collections imutaveis

        // criando lista imutavel
        List<String> listaMutavel = new ArrayList<>();

        listaMutavel.add("teste");
        listaMutavel.add("testando");

        List<String> listaImutavel = Collections.unmodifiableList(listaMutavel);

        System.out.println(listaImutavel);

        // n podemos adicionar novos elementos
        // listaImutavel.add("teste2");

        List<String> listaImutavel2 = List.of("item 1", "item 2", "item 3");

        // listaImutavel2.add("Item 4");

        System.out.println(listaImutavel2);

        Set<Integer> listaImutavelSet = Set.of(1, 2, 3);

        // listaImutavelSet.add(4);

        System.out.println(listaImutavelSet);

        // 6 - filter

        List<Integer> numerosFiltrados = numeros.stream()
                                                .filter(numero -> numero > 3)
                                                .collect(Collectors.toList());

        System.out.println(numeros);

        System.out.println(numerosFiltrados);

        // 7 - busca

        // for
        int numeroParaEncontrar = 4;

        boolean encontrou = false;

        for(Integer numero : numeros) {
            if(numero == numeroParaEncontrar) {
                encontrou = true;
            }
        }

        System.out.println(numeros);

        System.out.println("Encontrou? " + encontrou);

        // contains
        String nomeBuscado = "Maria";
        boolean encontrou2 = nomes.contains(nomeBuscado);

        System.out.println(nomes);
        System.out.println("Entrou nome? " + encontrou2);

        // findAny
        Optional<Integer> qualquerNumero = numeros.stream().findAny();

        System.out.println(qualquerNumero);

        Optional<Integer> primeiroNumero = numeros.stream().findFirst();

        System.out.println(primeiroNumero);

        Optional<Integer> primeiroPar = numeros.stream().filter(num -> num % 2 == 0).findFirst();

        System.out.println(primeiroPar);

        // 8 - Map

        // modificam a collection
        List<Integer> quadrados = numeros.stream()
                                         .map(n -> n * n)
                                         .collect(Collectors.toList());

        System.out.println(numeros);
        System.out.println(quadrados);

        List<String> nomesMaiusculos = nomes.stream()
                                            .map(String::toUpperCase)
                                            .collect(Collectors.toList());

        System.out.println(nomesMaiusculos);

        // 9 - modificação

        // adiciona novo el.
        numeros.add(50);

        System.out.println(numeros);

        // remove elementos pelo valor
        numeros.remove(Integer.valueOf(3));

        System.out.println(numeros);

        // alterar todos os elementos
        numeros.replaceAll(numero -> numero * 3);

        System.out.println(numeros);

        numeros.add(201);
        numeros.add(205);
        numeros.add(208);

        System.out.println(numeros);

        // remocao baseada em condicao
        numeros.removeIf(numero -> numero > 200);

        System.out.println(numeros);

        // 10 - reduce

        int soma = numeros.stream()
                          .reduce(0, (acumulador, numero) -> acumulador + numero);

        // 0 + 10
        // 10 + 20
        // 30 + 10
        // resultado = 40 -> variável

        System.out.println("Soma de todos os números: " + soma);

        String frase = nomes.stream()
                            .reduce("", (concatenador, nome) -> concatenador + " " + nome);

        System.out.println(frase);

        // 11 - ordenacao com comparator

        List<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(new Pessoa("Pedro", 33));
        pessoas.add(new Pessoa("Ana", 25));
        pessoas.add(new Pessoa("João", 67));
        pessoas.add(new Pessoa("Maria", 18));
        pessoas.add(new Pessoa("Rodrigo", 40));
        pessoas.add(new Pessoa("Ana", 19));

        // ordenar pelo nome
        pessoas.sort(Comparator.comparing(Pessoa::getNome));

        for(Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }

        // Ordenar pelo nome e idade
        pessoas.sort(Comparator.comparing(Pessoa::getNome)
                                .thenComparing(Pessoa::getIdade));
        
        for(Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }

        // 12 - uso avançado de streams

        // flatMap - achatar listas
        List<List<String>> listaDeListas = Arrays.asList(
            Arrays.asList("Maçã", "Morango"),
            Arrays.asList("Banana", "Mamão"),
            Arrays.asList("Uva", "Melão")
        );

        List<String> listUnica = listaDeListas.stream()
                                              .flatMap(List::stream)
                                              .collect(Collectors.toList());

        System.out.println(listUnica);

        // pipeline
        List<Integer> resultado = numeros.stream()
                                         .filter(n -> n % 2 == 0) // filtro de nums. pares
                                         .map(n -> n * 5) // multiplicacao
                                         .sorted() // ordenacao
                                         .collect(Collectors.toList());

        System.out.println(numeros);
        System.out.println(resultado);

        // 13 - Collectors
        List<Produto> produtos = Arrays.asList(
            new Produto("Camisa", "Roupas"),
            new Produto("TV", "Eletrônicos"),
            new Produto("Rádio", "Eletrônicos"),
            new Produto("Sofá", "Móveis"),
            new Produto("Mesa", "Móveis")
        );

        // agrupar por categoria
        Map<String, List<Produto>> produtosPorCategoria = produtos.stream()
                                                                  .collect(Collectors.groupingBy(p -> p.categoria));

        System.out.println(produtos);

        System.out.println(produtosPorCategoria);

        // Particionar
        Map<Boolean, List<Produto>> eletronicosENaoEletronicos = produtos.stream()
                                                                         .collect(Collectors.partitioningBy(p -> p.categoria.equals("Eletrônicos")));

        System.out.println(eletronicosENaoEletronicos);

        // Contando quantos produtos existem
        long totalProdutos = produtos.stream()
                                     .collect(Collectors.counting());

        System.out.println(totalProdutos);

    }

}
