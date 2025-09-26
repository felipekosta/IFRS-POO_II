package edu.ifsc.calculadora;

/**
 *
 * @author felipe
 */
public class Calculadora {

    public double soma(double op1, double op2) {
        return op1 + op2;
    }

    public double subtracao(double op1, double op2) {
        return op1 - op2;
    }

    public double multiplicacao(double op1, double op2) {
        return op1 * op2;
    }

    public double divisao(double op1, double op2) {
        if(op2 == 0)
            throw new RuntimeException("Divisão por zero");
        else
            return op1 / op2;
    }
}

