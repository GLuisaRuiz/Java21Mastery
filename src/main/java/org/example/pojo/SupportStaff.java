package org.example.pojo;

//runtime error: it's not supported in Java, but you can achieve it using interfaces
public class SupportStaff extends Teacher,NonTeachingStaff{
    private String supportStaffType;

    public String getSupportStaffType() {
        return supportStaffType;
    }

    public void setSupportStaffType(String supportStaffType) {
        this.supportStaffType = supportStaffType;
    }
}
