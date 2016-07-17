package com.adfer.designpatterns.factory;

import com.adfer.designpatterns.factory.enums.ShapeType;
import com.adfer.designpatterns.factory.shapes.Circle;
import com.adfer.designpatterns.factory.shapes.Rectangle;
import com.adfer.designpatterns.factory.shapes.Shape;
import com.adfer.designpatterns.factory.shapes.Square;

/**
 * Created by adrianferenc on 16.07.2016.
 */
public class ShapeFactory {
    public Shape getShape(ShapeType shapeType) {
        switch (shapeType) {
            case Rectangle:
                return new Rectangle();
            case Square:
                return new Square();
            case Circle:
                return new Circle();
            default:
                return null;
        }
    }
}
