package com.student.management.system;

import java.lang.classfile.Attributes;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentDao {

    ArrayList<Student> students = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void addStudent() {

        System.out.println("Enter Student Id ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Student Name ");
        String name = sc.nextLine();

        System.out.println("Enter Student Marks");
        double marks = sc.nextDouble();

        Student student = new Student(id, name, marks);

        students.add(student);
        System.out.println("Student Added Successfully..");

    }

    // View Stuse---
    public void viewStudent() {
        if (students.isEmpty()) {
            System.out.println("No Student Found!");
            return;
        }
        System.out.println("\n Student List");
        for (Student student : students) {
            System.out.println(student);
        }
    }
    // Search Student

    public void searchStudent(){
        System.out.println("Enter Student Id: ");
        int id = sc.nextInt();
        for (Student student : students) {
           if(student.getStdId() == id){
               System.out.println("Student Found.");
               System.out.println(student);
               return;
           }
        }
        System.out.println("Student Not Found.");

    }

    // Update Student

    public void updateStudent(){
        System.out.println("Enter Student Id: ");
        int id = sc.nextInt();
        sc.nextLine();
        for (Student student : students) {
            if(student.getStdId() == id){
                System.out.println("Enter New Name :");
                String name = sc.nextLine();

                System.out.println("Enter New Marks");
                double marks = sc.nextDouble();

                student.setStdName(name);
                student.setMarks(marks);

                System.out.println("Student Record Update Successfully");
                return;
            }
        }
        System.out.println("Student Not Found.");

    }

    // Delete Student

    public void deleteStudent(){
        System.out.println("Enter Student Id: ");
        int id = sc.nextInt();
        for (Student student : students) {
            if(student.getStdId() == id){
               students.remove(student);
                System.out.println("Student Delete Record Successfully");
                return;
            }
        }
        System.out.println("Student Not Found.");

    }


}