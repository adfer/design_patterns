package com.adfer.designpatterns.builder.meal;

import com.adfer.designpatterns.builder.item.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by adrianferenc on 16.07.2016.
 */
public class Meal {

    private List<Item> items = new ArrayList<Item>();

    public void addItem(Item item){
        items.add(item);
    }

    public float getCost(){
        float result = 0F;
        result = (float) items.stream().mapToDouble(item -> item.price()).sum();
        return result;
    }

    public void showItems(){
        items.stream().forEach(item -> {
            System.out.println(item.name());
            System.out.println(item.packing().pack());
            System.out.println(item.price());
        });
    }
}
