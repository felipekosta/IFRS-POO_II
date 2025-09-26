package edu.ifsc.calculadora;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author felipe
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
    }

    @Test
    public void testSoma() {
        System.out.println("soma");
        double op1 = 0.0;
        double op2 = 0.0;
        Calculadora instance = new Calculadora();
        double expResult = 0.0;
        double result = instance.soma(op1, op2);
        assertEquals(expResult, result, 0);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSubtracao() {
        System.out.println("subtracao");
        double op1 = 0.0;
        double op2 = 0.0;
        Calculadora instance = new Calculadora();
        double expResult = 0.0;
        double result = instance.subtracao(op1, op2);
        assertEquals(expResult, result, 0);
        fail("The test case is a prototype.");
    }

    @Test
    public void testMultiplicacao() {
        System.out.println("multiplicacao");
        double op1 = 0.0;
        double op2 = 0.0;
        Calculadora instance = new Calculadora();
        double expResult = 0.0;
        double result = instance.multiplicacao(op1, op2);
        assertEquals(expResult, result, 0);
        fail("The test case is a prototype.");
    }

    @Test
    public void testDivisao() {
        System.out.println("divisao");
        double op1 = 0.0;
        double op2 = 0.0;
        Calculadora instance = new Calculadora();
        double expResult = 0.0;
        double result = instance.divisao(op1, op2);
        assertEquals(expResult, result, 0);
        fail("The test case is a prototype.");
    }
    
}
