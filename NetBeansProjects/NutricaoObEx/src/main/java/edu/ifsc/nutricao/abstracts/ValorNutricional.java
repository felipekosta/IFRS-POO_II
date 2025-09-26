package edu.ifsc.nutricao.abstracts;

public abstract class ValorNutricional {
    
    // Representado em quilocalorias (kcal)
    // Cálculo: Carboidratos x 4 + Proteínas x 4 + Gorduras x 9 
    protected double getValorEnergetico() {
        return ( (this.getCarboidratos() * 4) +
                 (this.getProteinas() * 4) +
                 (this.getGorduras() * 9) );
    }
    
    public abstract double getProteinas();
    public abstract double getCarboidratos();
    public abstract double getGorduras();
    
}
