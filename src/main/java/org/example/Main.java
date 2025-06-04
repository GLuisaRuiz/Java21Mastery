package org.example;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Scanner;
import org.example.pojo.Employee;

public class Main {
    //var message = "Hello, World!"; // This line will cause a compile-time error because 'var' cannot be used at the class level
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
        /*
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
*/
        /*---------------WRAPPER CLASSES---------------- */
/*
        Scanner obj = new Scanner(System.in);
        System.out.println("enter your age");
        int age = obj.nextInt();

        //Wrapper class Integer
        Integer ageObject = age; //autoboxing
        int age2 = ageObject; //unboxing
        int age3 = ageObject.intValue(); //unboxing using intValue method

        System.out.println("Your age is: " + ageObject);
        System.out.println("Your age is: " + age2);
        System.out.println("Your age is: " + age3);
 */
        /*---------------IF / ELSE---------------- */
/*
        Scanner obj = new Scanner(System.in);
        System.out.println("enter your age");
        int age = obj.nextInt();

        if (age>18) {
            System.out.println("You are an adult");

            //Nested if statement
            if (age>60) {
                System.out.println("You are a senior citizen");
            }else {
                System.out.println("You are a young adult");
            }
        } else if (age>12 && age<=18) {
            System.out.println("You are a teenager");
        } else if (age>0 && age<=12) {
            System.out.println("You are a child");
        } else {
            System.out.println("Invalid age");
        }

 */
        /*---------------SWITCH STATEMENT---------------- */
/*
        Scanner obj = new Scanner(System.in);
        System.out.println("enter day number ");
        int noOfday = obj.nextInt();

        String day = switch (noOfday){
            case 1,7 -> //Multiple cases can be combined
                "weekend";
            case 2,3,4,5,6 -> "weekday";
            default ->"Error";
        };
        System.out.println(day);
*/

        /*---------------ARRAYS---------------- */
/*
        String [][] fruits = {{"mango", "apple"}, {"banana", "orange","berry"}};
        int [] weekNumbers = {1,2,3,4,5,6,7};
        int lengthOfFruits = fruits.length;

        System.out.println("Length of fruits array: " + lengthOfFruits);

        String fruit1 [] = fruits[0];
        System.out.println(fruit1[0]);
        System.out.println(fruits[1][0]);
        System.out.println(fruits[1].length);
*/
        /*---------------LOOPS---------------- */
/*
        //WHILE LOOP
        int index = 0;
        String [] fruits = {"mango", "apple","banana", "orange","berry"};
        int length = fruits.length;
        while(length>index){
            System.out.println("The value of fruit arrray is: " +fruits[index]);
            index++;
        }
        System.out.println("I am outside while loop");

        //DO WHILE LOOP
        int var = 0;
        do {
            System.out.println("The value of fruit arrray is: " +fruits[var]);
            var++;
        }while(length>var);

        //FOR LOOP
        System.out.println("This is For loop" );
        for (int i=0; i < length; i++) {
            System.out.println("The value of fruit arrray is: " +fruits[i]);
        }
        System.out.println("I am outside loop" );

        //FOR EACH LOOP

        for(String fruit : fruits) {
            System.out.println("The value of fruit arrray is: " + fruit);
        }
        System.out.println("I am outside for each loop" );

 */
        /*---------------Break and continue statement---------------- */
        // Break statement stops the execution of the loop
/*
        System.out.println("BREAK" );
        String [] fruits = {"mango", "apple","banana", "orange","berry"};
        boolean val = false;
        for(String fruit : fruits) {
            if (val){
                break;
            }
            if (fruit.equals("banana")) {
                System.out.println("Found banana, breaking the loop");
                val = true;
            }
            System.out.println("The value of fruit arrray is: " + fruit);
        }

        // Continue statement just break a one interation of the loop
        System.out.println("Continue" );
        for(String fruit : fruits) {
            if (fruit== "banana") {
                continue; // Skip the current iteration when fruit is banana
            }
            System.out.println("The value of fruit arrray is: " + fruit);
        }

 */
        /*---------------NESTED LOOP---------------- */
        /*
        System.out.println("Nested loop" );
        String [][] fruits = {{"mango", "apple"},{"banana", "orange","berry"}};
        Integer [][] twoD = new Integer[2][3]; // 2 rows and 3 columns
        int [] test = new int[5]; // 1D array of size 5

        boolean val = true;
        for(int i=0; i < fruits.length; i++) {
            String [] singleDim = fruits[i];
            for(int j=0; j < singleDim.length; j++) {
                String fruit = singleDim[j];
                System.out.println("The value of fruit arrray is: " + fruits[i][j]);
            }
        }

        System.out.println("I am outside of nested loop" );
         */

        /*---------------STRINGS---------------- */
/*
        String name = "Luisa";
        System.out.println(2+3+name); // Output: 5Luisa, Java evaluates the expression from left to right
        System.out.println(name+2+3); // Output: Luisa23, Java evaluates the expression from left to right

        System.out.println(name.charAt(1)); // Output: u, charAt method returns the character at the specified index
        System.out.println(name.indexOf("s")); // Output: 3, indexOf method returns the index of the first occurrence of the specified character
        System.out.println(name.indexOf("l",3)); // Output: -1, indexOf method returns -1 if the character is not found after the specified index
        System.out.println(name.indexOf("s",3)); // Output: 3, indexOf method returns the index of the first occurrence of the specified character after the specified index
        System.out.println(name.substring(1,3)); // Output: ui, substring method returns the substring from the specified start index to the specified end index (exclusive)
        System.out.println(name.toLowerCase()); // Output: luisa, toLowerCase method returns the string in lowercase
        System.out.println(name.toUpperCase()); // Output: LUISA toUpperCase method returns the string in uppercase


        String name2 = "Luisa";
        String name3 = "Luisa     ";
        String name4 = new String("Luisa");
        System.out.println(name.equals(name2)); // Output: true, equals method compares the two strings for equality
        System.out.println(name==name2); // Output: true, == operator compares the two strings for reference equality
        System.out.println(name3.trim()); // Output: Luisa, trim method removes the leading and trailing whitespace from the string
        System.out.println(name.equals(name4)); // Output: true, equals method compares the two strings for equality
        System.out.println(name==name4); // Output: false, == operator compares the two strings for reference equality, name4 is a new object in memory

        System.out.println(name.startsWith("L")); // Output: true, startsWith method checks if the string starts with the specified prefix
        System.out.println(name.startsWith("l")); // Output: false, sensitive for lowcase or uppercase
        System.out.println(name.contains("ui")); // Output: true, contains method checks if the string contains the specified sequence of characters
        System.out.println(name.contains("za")); // Output: false, contains method checks if the string contains the specified sequence of characters

 */

        /*---------------VAR key word---------------- */
        /*
        //The var keyword was introduced in Java 10 and allows you to declare a variable without specifying its type.

        var name = "Luisa"; // The var keyword infers the type of the variable is String based on the assigned value
        //name = 20; // This will cause a compile-time error because the type of name is inferred as String, and you cannot assign an int to a String variable
        //var age; // This will cause a compile-time error because the var keyword requires an initializer to infer the type

        System.out.println(name.contains("is"));// Output: true, var keyword infers the type of the variable based on the assigned value

         */

        /*----------------DATE TIME API--------------- */
/*
        LocalDate date = LocalDate.of(2023, 10, 1 );// Year, Month, Day
        System.out.println(date); // Output: 2023-10-01
        System.out.println(date.minusDays(2)); // Output: 2023-09-29,
        LocalTime time1 = LocalTime.of(10, 30); // Hour, Minute
        System.out.println(time1); // Output: 10:30
        LocalTime time2 = LocalTime.of(10, 30, 45); // Hour, Minute, Second
        System.out.println(time2); // Output: 10:30:45

        LocalDateTime dateTime = LocalDateTime.of(date,time1);
        System.out.println(dateTime); // Output: 2023-10-01T10:30

        ZoneId zone = ZoneId.of("America/New_York");
        ZonedDateTime zonedDateTime = ZonedDateTime.of(dateTime, zone);
        System.out.println(zonedDateTime); // Output: 2023-10-01T10:30-04:00[America/New_York]

        Duration duration = Duration.ofMinutes(30);
        //PT = Period of Time
        System.out.println(duration); // Output: PT30M, Duration represents a time-based amount of time, such as '30 minutes'
        Duration duration1 = Duration.between(time1,time2);
        System.out.println(duration1);// Output: PT0H0M45S, Duration represents the difference between two time points

        Period period = Period.ofDays(5);
        System.out.println(period);
 */

        /*---------------FINAL keyword---------------- */
/*
        final int x = 10; // The value of x cannot be changed
        //x = 20; // This will cause a compile-time error because x is declared as final
        System.out.println(x);

 */
        /*---------------SINGLE INHERITANCE ---------------- */
        Employee emp =  new Employee();
        emp.setSchoolName("ABC High School");
        emp.setSchoolId("SHS123");
        emp.setEmployeeId(112);
        emp.setEmployeeName("Jhon");

        System.out.println(emp.getSchoolName());


        /*---------------VAR key word---------------- */

        /*---------------VAR key word---------------- */

    }

}

class  Test{
    int age;
    String message;
    static int height;
}
