package edu.ifsc.nutricao.model;

public class ArrozIntegral extends Alimento {

    public ArrozIntegral(double peso) {
        super(peso);
    }

    public double valorEnergetico() {
        return super.getValorEnergetico() * super.getPeso();
    }    
    
    @Override
    public double getProteinas() {
        return 2.6;
    }

    @Override
    public double getCarboidratos() {
        return 25.8;
    }

    @Override
    public double getGorduras() {
        return 0.8;
    }

}
