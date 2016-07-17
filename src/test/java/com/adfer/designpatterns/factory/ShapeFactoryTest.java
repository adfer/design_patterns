package com.adfer.designpatterns.factory;

import com.adfer.designpatterns.factory.enums.ShapeType;
import com.adfer.designpatterns.factory.shapes.Circle;
import com.adfer.designpatterns.factory.shapes.Rectangle;
import com.adfer.designpatterns.factory.shapes.Square;
import com.sun.org.apache.xerces.internal.impl.xs.identity.Selector;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.regex.Matcher;

import static org.hamcrest.core.IsInstanceOf.instanceOf;

/**
 * Created by adrianferenc on 16.07.2016.
 */
public class ShapeFactoryTest {

    private ShapeFactory shapeFactory = new ShapeFactory();


    @Test
    public void shouldReturnCircleShape() {
        Assert.assertThat(shapeFactory.getShape(ShapeType.Circle), instanceOf(Circle.class));
    }

    @Test
    public void shouldReturnRectangleShape() {
        Assert.assertThat(shapeFactory.getShape(ShapeType.Rectangle), instanceOf(Rectangle.class));
    }

    @Test
    public void shouldReturnSquareShape() {
        Assert.assertThat(shapeFactory.getShape(ShapeType.Square), instanceOf(Square.class));
    }
}
