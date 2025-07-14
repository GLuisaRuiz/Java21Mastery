package org.example.abstractexample;

import org.example.interfaces.IShape;

public class Rectangle extends  Shape implements IShape {

    private double height;
    private double base;

    public Rectangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return base*height;
    }

    @Override
    public double getArea() {
        return  base*height;
    }

    @Override
    public void printName() {
        System.out.println("Rectangle");
    }
}
