package edu.ifsc.restaurant.model;

import edu.ifsc.restaurant.interfaces.Burger;

/**
 *
 * @author felipe
 */
public class BeefBurger implements Burger {

    @Override
    public void prepare() {
        System.out.println("Preparando hamburguer de carne...");
    }

}
