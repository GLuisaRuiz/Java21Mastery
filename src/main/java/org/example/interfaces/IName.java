package org.example.interfaces;

public interface  IName {
    public static final String NAME = "ShapeName";

    public  void printName();

    //Default methods
    public default String getConstValue() {
        return NAME;
    }
}
