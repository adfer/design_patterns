package com.adfer.designpatterns.abstractfactory.factory;

import com.adfer.designpatterns.abstractfactory.colors.Color;
import com.adfer.designpatterns.abstractfactory.enums.ColorEnum;
import com.adfer.designpatterns.abstractfactory.enums.ShapeType;
import com.adfer.designpatterns.abstractfactory.shapes.Shape;

/**
 * Created by adrianferenc on 16.07.2016.
 */
public abstract class AbstractFactory
{
    public abstract Shape getShape(ShapeType shapeType);
    public abstract Color getColor(ColorEnum color);
}
