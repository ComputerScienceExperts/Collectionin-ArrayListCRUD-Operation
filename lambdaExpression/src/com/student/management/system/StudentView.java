package com.student.management.system;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentView {

   static Scanner sc = new Scanner(System.in);
    static StudentDao studentDao = new StudentDao();
   ArrayList<Student> students = new ArrayList<>();
    public static void main(String[] args) {

        int choice;

        do{
            System.out.println("Student Management System");
            System.out.println("1. Add Student");
            System.out.println("2. View Student");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");

            System.out.println("Enter Your Choice : ");

            choice = sc.nextInt();

            switch (choice){
                case 1:
                    studentDao.addStudent();;
                    break;
                case 2:
                    studentDao.viewStudent();
                    break;
                case 3:
                        studentDao.searchStudent();
                    break;
                case 4:
                        studentDao.updateStudent();
                    break;
                case 5:
                    studentDao.deleteStudent();
                    break;
                case 6:
                    System.out.println("Thank You..❤");
                    break;
                default:
                    System.out.println("Invalid Choice!..");

            }

        }while (choice !=6);
        sc.close();


    }


}
