package edu.ifsc.nutricao.model;

import edu.ifsc.nutricao.abstracts.ValorNutricional;

public abstract class Alimento extends ValorNutricional {
    // em gramas
    private double peso;

    public Alimento(double peso) {
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
}
