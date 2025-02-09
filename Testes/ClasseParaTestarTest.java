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


        ListaSeparandoFeminio.processarEntrada(input);


        List<String> nomesFemininos = ListaSeparandoFeminio.getNomesFemininos();

        assertEquals(3, nomesFemininos.size());
        assertTrue(nomesFemininos.contains("Ana"));
        assertTrue(nomesFemininos.contains("Carla"));
        assertTrue(nomesFemininos.contains("Maria"));


        assertFalse(nomesFemininos.contains("João"));
        assertFalse(nomesFemininos.contains("Pedro"));
    }

}