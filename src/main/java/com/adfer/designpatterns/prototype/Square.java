package com.adfer.designpatterns.prototype;

import com.adfer.designpatterns.prototype.enums.ShapeType;

/**
 * Created by adrianferenc on 16.07.2016.
 */
public class Square extends Shape {

    public Square(){
        type = ShapeType.Square;
    }

    @Override
    void draw() {
        System.out.println("Inside Square.draw() method");
    }
}
