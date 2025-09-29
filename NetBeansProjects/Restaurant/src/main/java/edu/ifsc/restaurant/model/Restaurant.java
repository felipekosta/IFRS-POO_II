package edu.ifsc.restaurant.model;

import edu.ifsc.restaurant.interfaces.Burger;

public abstract class Restaurant {

        public void orderBurger() {
            System.out.println("Solicitando hamburguer...");
            Burger burger = createBurger();
            burger.prepare();
        }
        
        public abstract Burger createBurger();
}
