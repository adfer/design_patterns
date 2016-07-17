package com.adfer.designpatterns.abstractfactory.factory;

import com.adfer.designpatterns.abstractfactory.colors.Blue;
import com.adfer.designpatterns.abstractfactory.colors.Color;
import com.adfer.designpatterns.abstractfactory.colors.Green;
import com.adfer.designpatterns.abstractfactory.colors.Red;
import com.adfer.designpatterns.abstractfactory.enums.ColorEnum;
import com.adfer.designpatterns.abstractfactory.enums.ShapeType;
import com.adfer.designpatterns.abstractfactory.shapes.Shape;

/**
 * Created by adrianferenc on 16.07.2016.
 */
public class ColorFactory extends AbstractFactory {


    public Shape getShape(ShapeType shapeType) {
        return null;
    }

    public Color getColor(ColorEnum color) {
        switch (color) {
            case Red:
                return new Red();
            case Blue:
                return new Blue();
            case Green:
                return new Green();
            default:
                return null;
        }
    }
}
