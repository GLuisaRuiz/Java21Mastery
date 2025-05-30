package org.example.oldschool;

import org.example.pojo.Employee;

//if employee class is final, we cannot extend it, so Teacher class cannot extend Employee class
public class Teacher extends Employee {

    //teacheName is public and can be accessed from other packages and classes
    //if we change it to protected, it will not be accessible from other packages, library package have a problem.
    //we could solve this by using getter and setter methods
    public String Name;
    protected String lastName;
    private String email; //private email is not accessible from other packages and classes, library package have a problem.

    public void setTeacher(String lastName, String email) {
        this.lastName = lastName;
        this.email = email;
    }

    final void testFinal() {
        // This method cannot be overridden in subclasses
    }

}
