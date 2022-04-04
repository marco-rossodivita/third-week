package com.corso.java.studentdeparment;

public class Student {

    private long id;
    private String name;
    private String lastName;
    private Department department;

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }


    public Student() {}

    public Student(String name, String lastName, Department department) {
        this.name = name;
        this.lastName = lastName;
        this.department = department;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Department getCodDepartment() {
        return department;
    }

    public void setCodDepartment(Department department) {
        this.department = department;
    }
}
