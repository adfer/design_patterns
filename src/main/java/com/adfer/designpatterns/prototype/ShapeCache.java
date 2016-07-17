package com.adfer.designpatterns.prototype;

import com.adfer.designpatterns.prototype.enums.ShapeType;

import java.util.Hashtable;
import java.util.Map;

/**
 * Created by adrianferenc on 16.07.2016.
 */
public class ShapeCache {
    private static Hashtable<String, Shape> shapeMap = new Hashtable<>();

    public static Shape getShape(String shapeId) {
        return (Shape) shapeMap.get(shapeId).clone();
    }


    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("c1");
        shapeMap.put(circle.getId(), circle);

        Circle circle2 = new Circle();
        circle2.setId("c2");
        shapeMap.put(circle2.getId(), circle2);

        Square square = new Square();
        square.setId("s1");
        shapeMap.put(square.getId(), square);

        Square square2 = new Square();
        square2.setId("s2");
        shapeMap.put(square2.getId(), square2);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("r1");
        shapeMap.put(rectangle.getId(), rectangle);

        Rectangle rectangle2 = new Rectangle();
        rectangle2.setId("r2");
        shapeMap.put(rectangle2.getId(), rectangle2);

    }

}
