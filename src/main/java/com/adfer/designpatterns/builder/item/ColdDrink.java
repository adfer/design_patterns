package com.adfer.designpatterns.builder.item;

import com.adfer.designpatterns.builder.packing.Bottle;
import com.adfer.designpatterns.builder.packing.Packing;

/**
 * Created by adrianferenc on 16.07.2016.
 */
public abstract class ColdDrink implements Item {
    public Packing packing() {
        return new Bottle();
    }
}
