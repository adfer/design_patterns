package com.adfer.designpatterns.builder.item;

/**
 * Created by adrianferenc on 16.07.2016.
 */
public class ChickenBurder extends Burger {
    public String name() {
        return "Chicken burger";
    }

    public float price() {
        return 12.40F;
    }
}
