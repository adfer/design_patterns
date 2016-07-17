package com.adfer.designpatterns.factory;

import com.adfer.designpatterns.factory.enums.ShapeType;
import com.adfer.designpatterns.factory.shapes.Shape;

/**
 * Created by adrianferenc on 16.07.2016.
 */
public class FactoryPatternMain {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape circle = shapeFactory.getShape(ShapeType.Circle);
        circle.draw();

        Shape rectangle = shapeFactory.getShape(ShapeType.Rectangle);
        rectangle.draw();

        Shape square = shapeFactory.getShape(ShapeType.Square);
        square.draw();
    }
}
