package com.adfer.designpatterns.prototype;

import com.adfer.designpatterns.prototype.enums.ShapeType;

/**
 * Created by adrianferenc on 16.07.2016.
 */
public class Circle extends Shape {

    public Circle() {
        type = ShapeType.Circle;
    }

    @Override
    void draw() {
        System.out.println("Inside Circle.draw() method");
    }
}
