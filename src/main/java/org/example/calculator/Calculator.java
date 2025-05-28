package org.example.calculator;

public class Calculator {
    int firstNumber;
    int secondNumber;

    public int add() {
        return this.firstNumber + this.secondNumber;
    }

    public int add1(int value1, int value2) {
        return value1 + value2;
    }

    public int add2(int value2) {
        return this.firstNumber + value2;
    }

    //Static methods
    public static int addStatic(int value1, int value2) {
        return value1 + value2;
    }
}
