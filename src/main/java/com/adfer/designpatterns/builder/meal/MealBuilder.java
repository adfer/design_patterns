package com.adfer.designpatterns.builder.meal;

import com.adfer.designpatterns.builder.item.ChickenBurder;
import com.adfer.designpatterns.builder.item.CocaCola;
import com.adfer.designpatterns.builder.item.Pepsi;
import com.adfer.designpatterns.builder.item.VegBurder;
import com.adfer.designpatterns.builder.meal.Meal;

/**
 * Created by adrianferenc on 16.07.2016.
 */
public class MealBuilder {

    public Meal prepareVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new VegBurder());
        meal.addItem(new CocaCola());
        return meal;
    }
    public Meal prepareMeal(){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurder());
        meal.addItem(new Pepsi());
        return meal;
    }
}
