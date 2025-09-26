package edu.ifsc.calculadora;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Calculadora1Test {
    Calculadora calc = new Calculadora();

    @Test
    public void testaSoma() {
        assertEquals(2, calc.soma(1, 1), 0);
        assertEquals(3, calc.soma(2, 1), 0);
    }

    @Test
    public void testaSubtracao() {
        assertEquals(1, calc.subtracao(2, 1), 0);
        assertEquals(1, calc.subtracao(1, 1), 0);
    }
}

