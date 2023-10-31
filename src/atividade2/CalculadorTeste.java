package atividade2;

import java.util.ArrayList;
import org.junit.Test;
import junit.framework.TestCase;

public class CalculadorTeste extends TestCase {

    Calculador<Integer> c = new Calculador<>();

    ArrayList<Integer> lista = new ArrayList<>();

    @Test
    public void testMedia() {
        lista.add(5);
        lista.add(1);
        lista.add(3);
        lista.add(2);

        assertEquals(2.75, c.media(lista));

        lista.add(4);

        assertEquals(3.0, c.media(lista));

        lista.add(9);

        assertEquals(4.0, c.media(lista));
    }
    
    @Test
    public void testModa() {
        lista.add(1);
        lista.add(3);
        lista.add(1);
        lista.add(4);

        assertEquals(1.0, c.moda(lista).doubleValue());

        lista.add(3);
        lista.add(3);

        assertEquals(3.0, c.moda(lista).doubleValue());

        lista.add(7);
        lista.add(7);
        lista.add(7);
        lista.add(7);

        assertEquals(7.0, c.moda(lista).doubleValue());
    }

    @Test
    public void testMediana() {
        lista.add(5);
        lista.add(21);
        lista.add(7);

        assertEquals(7.0, c.mediana(lista));

        lista.add(9);

        assertEquals(8.0, c.mediana(lista));

        lista.add(12);

        assertEquals(9.0, c.mediana(lista));
    }

    @Test
    public void testVariancia() {
        lista.add(4);
        lista.add(7);
        lista.add(1);

        assertEquals(6.0, c.variancia(lista));

        lista.add(10);

        assertEquals(11.25, c.variancia(lista));

        lista.add(13);

        assertEquals(18.0, c.variancia(lista));
    }

    @Test
    public void testDesvioPadrao() {
        lista.add(1);
        lista.add(1);

        assertEquals(0.0, c.desvioPadrao(lista));

        lista.add(2);
        lista.add(2);

        assertEquals(0.5, c.desvioPadrao(lista));

        lista.clear();
        lista.add(1);
        lista.add(4);
        
        assertEquals(1.5, c.desvioPadrao(lista));
    }

}
