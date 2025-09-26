package edu.ifsc.calculadora;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraAnotTest {

    Calculadora calculadora = new Calculadora();

    @BeforeAll
    public void CriaCalc() {
        calculadora = new Calculadora();
    }

    @Test
    public void testSoma() {
        assertEquals(14.0, calculadora.soma(2, 2), 0);
        assertEquals(3.0, calculadora.soma(2, 1), 0);
    }

    @Test
    public void testDivisao() {
        assertThrows(RuntimeException.class, () -> calculadora.divisao(2, 0));
    }
}
