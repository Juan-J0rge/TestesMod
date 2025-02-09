package Streams.TarefaListFem.Testes;

import Streams.TarefaListFem.ListaSeparandoFeminio;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import java.util.List;

import static org.junit.Assert.*;

public class ClasseParaTestarTest {
    @Test
    public void testarFem() {
        String input = "Ana-F, João-M, Carla-F, Pedro-M, Maria-F";

        // Chama o método diretamente (sem precisar do Scanner)
        ListaSeparandoFeminio.processarEntrada(input);

        // Obtém a lista de nomes femininos
        List<String> nomesFemininos = ListaSeparandoFeminio.getNomesFemininos();

        // Verifica se a lista contém apenas nomes femininos
        assertEquals(3, nomesFemininos.size()); // Deve ter exatamente 3 nomes femininos
        assertTrue(nomesFemininos.contains("Ana"));
        assertTrue(nomesFemininos.contains("Carla"));
        assertTrue(nomesFemininos.contains("Maria"));

        // Garante que a lista não contém nomes masculinos
        assertFalse(nomesFemininos.contains("João"));
        assertFalse(nomesFemininos.contains("Pedro"));
    }

}