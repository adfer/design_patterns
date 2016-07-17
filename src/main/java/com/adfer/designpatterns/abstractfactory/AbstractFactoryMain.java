package com.adfer.designpatterns.abstractfactory;

import com.adfer.designpatterns.abstractfactory.colors.Color;
import com.adfer.designpatterns.abstractfactory.enums.ColorEnum;
import com.adfer.designpatterns.abstractfactory.enums.FactoryType;
import com.adfer.designpatterns.abstractfactory.enums.ShapeType;
import com.adfer.designpatterns.abstractfactory.factory.AbstractFactory;
import com.adfer.designpatterns.abstractfactory.factory.FactoryProducer;
import com.adfer.designpatterns.abstractfactory.shapes.Shape;

/**
 * Created by adrianferenc on 16.07.2016.
 */
public class AbstractFactoryMain {
    public static void main(String[] args) {
        FactoryProducer factoryProducer = new FactoryProducer();

        AbstractFactory shapeFactory = factoryProducer.getFactory(FactoryType.ShapeFactory);

        Shape circle = shapeFactory.getShape(ShapeType.Circle);
        circle.draw();

        Shape rectangle = shapeFactory.getShape(ShapeType.Rectangle);
        rectangle.draw();

        AbstractFactory colorFactory = factoryProducer.getFactory(FactoryType.ColorFactory);

        Color red = colorFactory.getColor(ColorEnum.Red);
        red.fill();

        Color blue = colorFactory.getColor(ColorEnum.Blue);
        blue.fill();
    }
}
