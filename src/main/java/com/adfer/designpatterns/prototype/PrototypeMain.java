package com.adfer.designpatterns.prototype;

/**
 * Created by adrianferenc on 16.07.2016.
 */
public class PrototypeMain {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape circle1 = ShapeCache.getShape("c1");
        System.out.println(circle1);

        Shape rectangle2 = ShapeCache.getShape("r2");
        System.out.println(rectangle2);

        Shape square1 = ShapeCache.getShape("s1");
        System.out.println(square1);

        Shape newSquare = ShapeCache.getShape("s1");
        newSquare.setId("newId");
        System.out.println(square1);
        System.out.println(newSquare);
    }
}
