package org.example;

public class Main {
    public static void main(String[] args) {
 /*
        //Variable types
        //local variables
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

*/
        /*---------------CLASSES AND OBJECTS---------------- */
/*
        //Creating an object of a class
        //Java provides a default constructor.
        FirstClass object1 = new FirstClass();
        object1.age=10;
        System.out.println("Object1 age: " + object1.age);
        FirstClass object2 = new FirstClass(20);
        //all instances variable is initialized with some value
        //non-primitive variables are initialized with null
        //primitive variables are initialized with 0
        System.out.println("Object2 age: " + object2.age+ " and message: " + object2.message);
        FirstClass object3 = new FirstClass(30,"Hello");
        System.out.println("Object3 age: " + object3.age+ " and message: " + object3.message);
*/
        /*---------------METHODS---------------- */
        Calculator calculator = new Calculator();
        calculator.firstNumber=10;
        calculator.secondNumber=8;
        int sumOfCalculator = calculator.add() ;
        System.out.println(sumOfCalculator);

        Calculator calculator1 = new Calculator();
        calculator1.firstNumber=20;
        calculator1.secondNumber=7;
        int sumOfCalculator1 = calculator1.add() ;
        System.out.println(sumOfCalculator1);

        Calculator calculator2 = new Calculator();
        int sum2 = calculator2.add1(20,5) ;
        System.out.println(sum2);

        Calculator calculator3 = new Calculator();
        calculator3.firstNumber=15;
        int sum3 = calculator3.add2(5) ;
        System.out.println(sum3);

        //Static methods
        //Static methods can be called without creating an object of the class
        int sumStatic = Calculator.addStatic(10, 20);
        System.out.println("Sum using static method: " + sumStatic);

    }

}

class  Test{
    int age;
    String message;
    static int height;
}
