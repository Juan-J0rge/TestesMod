package Streams.TarefaListFem;

import java.util.*;
import java.util.stream.Collectors;

public class ListaSeparandoFeminio {
    private static List<String> nomesFemininos = new ArrayList<>();

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o sexo e o nome (utilize - para separar eles e utilize , para separar dos outros)");
        String insiraDados = s.nextLine();

        processarEntrada(insiraDados); // Chama o método para processar a entrada

        System.out.println("Lista apenas do sexo feminino:");
        nomesFemininos.forEach(System.out::println);
    }


    public static void processarEntrada(String insiraDados) {
        String[] separaDados = insiraDados.split(",");

        Map<String, List<String>> juntaNomes = new TreeMap<>();

        for (String coleta : separaDados) {
            String[] separe = coleta.split("-");
            if (separe.length == 2) {
                String nome = separe[0].trim();
                String sexo = separe[1].trim().toUpperCase();

                juntaNomes.computeIfAbsent(sexo, k -> new ArrayList<>()).add(nome);
            }
        }

        nomesFemininos = juntaNomes.getOrDefault("F", new ArrayList<>()).stream()
                .collect(Collectors.toList());
    }

    public static List<String> getNomesFemininos() {
        return nomesFemininos;
    }
}

