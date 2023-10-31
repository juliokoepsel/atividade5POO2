package atividade1;

import org.junit.Test;
import junit.framework.TestCase;

public class TabelaTeste extends TestCase {

    Tabela t = new Tabela();

    @Test
    public void testCriar() {
        assertEquals("\'codigo\' INT NOT NULL AUTO_INCREMENT,", t.criar("codigo", "int", true, true));
        assertEquals("\'data\' DATE() NOT NULL,", t.criar("data", "date()", true, false));
        assertEquals("\'valor\' DECIMAL(10,2),", t.criar("valor", "decimal(10,2)", false, false));
    }
}
