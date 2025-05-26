package org.example;

public class FirstClass {
    int age;
    String message;

    //Constructor
    FirstClass() {
        System.out.println("I'm in constructor");
    }

    //we could create multiple constructors with DIFFERENTS parameters
    //Overloading constructors
    FirstClass(int value) {
        this.age = value;
        System.out.println("I am setting age");
    }

    FirstClass(int value, String message) {
        this.age = value;
        this.message = message;
        System.out.println("I am setting message");
    }
}
