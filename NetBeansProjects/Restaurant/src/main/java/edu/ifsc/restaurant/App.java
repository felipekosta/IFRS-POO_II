package edu.ifsc.restaurant;

import edu.ifsc.restaurant.model.BeefBurgerRestaurant;
import edu.ifsc.restaurant.model.Restaurant;
import edu.ifsc.restaurant.model.VeggieBurgerRestaurant;

public class App {

    public static void main(String[] args) {
        Restaurant veggie = new VeggieBurgerRestaurant();
        veggie.orderBurger();
        
        Restaurant beef = new BeefBurgerRestaurant();
        beef.orderBurger();
    }
}
