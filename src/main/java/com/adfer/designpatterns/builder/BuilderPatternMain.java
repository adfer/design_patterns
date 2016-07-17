package com.adfer.designpatterns.builder;

import com.adfer.designpatterns.builder.meal.Meal;
import com.adfer.designpatterns.builder.meal.MealBuilder;

/**
 * Created by adrianferenc on 16.07.2016.
 */
public class BuilderPatternMain {

    public static void main(String[] args) {
        MealBuilder builder = new MealBuilder();

        Meal vegMeal = builder.prepareVegMeal();
        System.out.println("---> Veg meal:");
        vegMeal.showItems();
        System.out.println("Total cost: "+vegMeal.getCost());

        System.out.println("\n");

        Meal meal = builder.prepareMeal();
        System.out.println("---> Meal:");
        meal.showItems();
        System.out.println("Total cost: "+meal.getCost());

    }
}
