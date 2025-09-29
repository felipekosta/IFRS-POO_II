package edu.ifsc.restaurant.model;

import edu.ifsc.restaurant.interfaces.Burger;

public class VeggieBurgerRestaurant extends Restaurant {

    @Override
    public Burger createBurger() {
        System.out.println("Criando hamburguer vegano...");
        return new VeggieBurger();
    }

}
