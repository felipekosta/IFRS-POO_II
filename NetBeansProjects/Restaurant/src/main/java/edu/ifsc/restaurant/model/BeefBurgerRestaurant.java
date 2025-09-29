package edu.ifsc.restaurant.model;

import edu.ifsc.restaurant.interfaces.Burger;

public class BeefBurgerRestaurant extends Restaurant {

    @Override
    public Burger createBurger() {
        System.out.println("Criando hamburguer de carne...");
        return new BeefBurger();
    }

}
