package org.example.pojo;

//final
public class Employee {
    private Integer employeeId;
    private String employeeName;

    final void testFinal(){
    }

    public  void expFinal(final int x){
        //x=10; // This will generate an error because x is final and cannot be reassigned
    }
}
