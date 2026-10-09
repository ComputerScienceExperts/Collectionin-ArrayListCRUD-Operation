package com.student.management.system;

public class Student {

    private int stdId;
    private String stdName;
    private double marks;
     // default Constructor
    public Student() {
    }
     // Parametriszed constructor
    public Student(int stdId, String stdName, double marks) {
        this.stdId = stdId;
        this.stdName = stdName;
        this.marks = marks;
    }

    // Setter Getter


    public int getStdId() {
        return stdId;
    }

    public void setStdId(int stdId) {
        this.stdId = stdId;
    }

    public String getStdName() {
        return stdName;
    }

    public void setStdName(String stdName) {
        this.stdName = stdName;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }
    // Display output toString()


    @Override
    public String toString() {
        return "Student{" +
                "stdId=" + stdId +
                ", stdName='" + stdName + '\'' +
                ", marks=" + marks +
                '}';
    }
}


