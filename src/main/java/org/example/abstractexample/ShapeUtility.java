package org.example.abstractexample;

import org.example.interfaces.IShape;

public class ShapeUtility {
    public void calculateArea(Shape shape) {
        double area = shape.calculateArea();
        System.out.println( area);
    }

    public void getArea(IShape shape){
        double area = shape.getArea();
        System.out.println( area);
    }
}
