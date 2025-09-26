package edu.ifsc.nutri1.abstracts;

public abstract class ValorNutricional {
    public double getValorEnergetico() {
        return (getProteinas() * 4) +
               (getCarboidratos() * 4) +
               (getGorduras() * 9);
    }
    
    public abstract double getProteinas();
    public abstract double getCarboidratos();
    public abstract double getGorduras();
    
}
