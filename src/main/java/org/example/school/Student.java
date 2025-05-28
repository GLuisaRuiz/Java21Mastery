package org.example.school;

public class Student {
    public Integer studentId;
    public String studentName;

    //Teacher class is public and can be accessed from other packages and classes
    public Teacher getTeacher() {
        Teacher teacher = new Teacher();
        teacher.Name = "John Doe";
        //teacher.email = "asdasd"; //this generates a error because email is private in Teacher class
        return teacher;
    }

    public Teacher setemailToTeacher() {
        Teacher teacher = new Teacher();
        teacher.setTeacher("Smith", "smith@ola.com");
        return teacher;
    }
}
