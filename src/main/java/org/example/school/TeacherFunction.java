package org.example.school;

import org.example.pojo.Teacher;

public class TeacherFunction {
    public String setTeacherName(String teacherName) {
        Teacher teacher = new Teacher();
        teacher.setTeacherName(teacherName);
        return teacher.getTeacherName();
    }
}
