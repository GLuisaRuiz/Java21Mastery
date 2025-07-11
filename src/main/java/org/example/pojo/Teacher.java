package org.example.pojo;

//Multi-level inheritance example
//Teacher class extends Employee class and Employee class extends School class
public class Teacher extends Employee{
   private String teachingSubject;

    public String getTeachingSubject() {
        return teachingSubject;
    }

    public void setTeachingSubject(String teachingSubject) {
        this.teachingSubject = teachingSubject;
    }

    // Overriding the workHour method from Employee class
    public void workHour(){
        System.out.println("Teacher works 6 hours a day");
    }
}
