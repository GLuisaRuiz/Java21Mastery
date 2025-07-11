package org.example.calculator;

public class Calculator {

    public Calculator() {
        System.out.println("No args constructor");
    }
    public Calculator(int i) {
        System.out.println("int arg constructor");
    }
    public Calculator(double i) {
        System.out.println("Double arg constructor");
    }

    public static int add(int a, int b) {
        System.out.println("2 int args");
        return a + b;
    }

    public static int add(double a, int b) {
        System.out.println("double and int args");
        return (int) (a + b);
    }

    public static int add(int a, int b,int c) {
        System.out.println("3 int args");
        return (a + b + c);
    }
}
