package com.adfer.designpatterns.prototype;

import com.adfer.designpatterns.prototype.enums.ShapeType;

/**
 * Created by adrianferenc on 16.07.2016.
 */
public class Rectangle extends Shape {

    public Rectangle(){
        type = ShapeType.Rectangle;
    }

    @Override
    void draw() {
        System.out.println("Inside Rectangle.draw() method");
    }
}
