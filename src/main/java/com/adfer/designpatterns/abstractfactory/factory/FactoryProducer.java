package com.adfer.designpatterns.abstractfactory.factory;

import com.adfer.designpatterns.abstractfactory.enums.FactoryType;

/**
 * Created by adrianferenc on 16.07.2016.
 */
public class FactoryProducer {
    public AbstractFactory getFactory(FactoryType factoryType) {
        switch (factoryType) {
            case ShapeFactory:
                return new ShapeFactory();
            case ColorFactory:
                return new ColorFactory();
            default:
                return null;
        }
    }
}
