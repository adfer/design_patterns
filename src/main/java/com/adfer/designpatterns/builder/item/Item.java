package com.adfer.designpatterns.builder.item;

import com.adfer.designpatterns.builder.packing.Packing;

/**
 * Created by adrianferenc on 16.07.2016.
 */
public interface Item {
    String name();
    Packing packing();
    float price();
}
