package org.example.library;

import org.example.oldschool.Teacher;

public class Books {
    public Integer bookId;
    public String bookName;
    public String authorName;

    //Teacher class is public and can be accessed from other packages and classes
    public Teacher bookAllocatedtoTeacher() {
        Teacher teacher = new Teacher();
        teacher.Name = "Mariana";
        return teacher;
    }

    //Access to private, default and protected members of Teacher class is not allowed here
    public Teacher setTeacher() {
        Teacher teacher = new Teacher();
        teacher.setTeacher("Gallego","");
        return teacher;
    }
}
