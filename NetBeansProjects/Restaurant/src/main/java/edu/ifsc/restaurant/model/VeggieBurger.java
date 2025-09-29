package edu.ifsc.restaurant.model;

import edu.ifsc.restaurant.interfaces.Burger;

public class VeggieBurger implements Burger {

    @Override
    public void prepare() {
        System.out.println("Preparando hamburguer vegano...");
    }

}
