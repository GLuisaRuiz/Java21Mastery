package org.example.abstractexample;

public class Rectangle extends  Shape{

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
}
