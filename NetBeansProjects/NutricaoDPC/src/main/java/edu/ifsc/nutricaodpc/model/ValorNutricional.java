package edu.ifsc.nutricaodpfm.model;

public class ValorNutricional {
    private double carboidratos;
    private double proteinas;
    private double gorduras;

    public ValorNutricional(double carboidratos, double proteinas, double gorduras) {
        this.carboidratos = carboidratos;
        this.proteinas = proteinas;
        this.gorduras = gorduras;
    }

    public double getValorEnergetico() {
        return (getCarboidratos() * 4) + 
                (getProteinas() * 4) +
                (getGorduras() * 9);
    }
    
    public double getCarboidratos() {
        return carboidratos;
    }

    public void setCarboidratos(double carboidratos) {
        this.carboidratos = carboidratos;
    }

    public double getProteinas() {
        return proteinas;
    }

    public void setProteinas(double proteinas) {
        this.proteinas = proteinas;
    }

    public double getGorduras() {
        return gorduras;
    }

    public void setGorduras(double gorduras) {
        this.gorduras = gorduras;
    }
    
    
}
