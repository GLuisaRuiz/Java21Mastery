package org.example.abstractexample;

import org.example.interfaces.IShape;

public class Circle implements IShape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI* radius * radius;
    }

    @Override
    public void printName() {
        System.out.println("Circle");
    }
}
