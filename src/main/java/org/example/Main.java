package org.example;

public class Main {
    public static void main(String[] args) {

        //Variable types
        //local variablesa
        //Primitive variables
        int length = 10;
        short height = 5;
        byte ageOfPerson = 25;

        //Non-primitive datat types
        String messsage = "Hello, World!";


        System.out.println("");
        System.out.println(messsage);
        System.out.println(length);
        System.out.println(height);
        System.out.println(ageOfPerson);

        Test testObject = new Test();
        Test testObject1 = new Test();

        testObject.message = "Hello from test-1";
        testObject.age = 25;
        testObject.height = 10;

        testObject1.message = "Hello from test-2";
        testObject1.age = 70;
        testObject1.height = 18;
        //Static variable
        Test.height = 20;

        System.out.println("Objects' variables");
        System.out.println("Object1");
        System.out.println(testObject.message);
        System.out.println(testObject.age);
        System.out.println(testObject.height);

        System.out.println("Object2");
        System.out.println(testObject1.message);
        System.out.println(testObject1.age);
        System.out.println(testObject1.height);

    }
}

class  Test{
    int age;
    String message;
    static int height;
}
