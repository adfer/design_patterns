package com.adfer.designpatterns.builder.item;

import com.adfer.designpatterns.builder.packing.Packing;
import com.adfer.designpatterns.builder.packing.Wrapper;

/**
 * Created by adrianferenc on 16.07.2016.
 */
public abstract class Burger implements Item{
    public Packing packing() {
        return new Wrapper();
    }
}
