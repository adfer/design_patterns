package com.adfer.designpatterns.abstractfactory.factory;

import com.adfer.designpatterns.abstractfactory.colors.Color;
import com.adfer.designpatterns.abstractfactory.enums.ColorEnum;
import com.adfer.designpatterns.abstractfactory.enums.ShapeType;
import com.adfer.designpatterns.abstractfactory.shapes.Circle;
import com.adfer.designpatterns.abstractfactory.shapes.Rectangle;
import com.adfer.designpatterns.abstractfactory.shapes.Shape;
import com.adfer.designpatterns.abstractfactory.shapes.Square;

/**
 * Created by adrianferenc on 16.07.2016.
 */
public class ShapeFactory extends AbstractFactory {

    public Shape getShape(ShapeType shapeType) {
        switch (shapeType) {
            case Rectangle:
                return new Rectangle();
            case Circle:
                return new Circle();
            case Square:
                return new Square();
            default:
                return null;
        }
    }

    public Color getColor(ColorEnum color) {
        return null;
    }
}
