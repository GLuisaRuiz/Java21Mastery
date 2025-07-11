package org.example.pojo;

//final
//Single level inheritance
public class Employee extends School{
    private Integer employeeId;
    private String employeeName;

    final void testFinal(){
    }

    public  void expFinal(final int x){
        //x=10; // This will generate an error because x is final and cannot be reassigned
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void workHour(){
        System.out.println("Employee works 8 hours a day");
    }
}
