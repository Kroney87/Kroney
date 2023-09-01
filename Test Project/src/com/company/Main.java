package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /**
         * int rows = 5;
         * int i,j;
         *
         *for(i =1;i<= rows; i++){
         *for(j = 1;j <= i; j++){
         *     System.out.print("*");
         * }
         * System.out.println();
         }
         */
        System.out.println("Welcome to Student Database!\n");
        System.out.println("Enter Students: Age, First Name, Last Name, & UID number separated by commas.");

        int age;
        String fName;
        String lName;
        int UID;

        Scanner kb = new Scanner(System.in);
        System.out.print("Enter Age: ");
        age = kb.nextInt();
        System.out.print("Enter First Name: ");
        fName = kb.next();
        System.out.print("Enter Last Name: ");
        lName = kb.next();
        System.out.print("Enter UID Number: ");
        UID = kb.nextInt();

        Student student = new Student(age, fName, lName, UID);
        student.PrintStudent();

        //Student student = new Student(21, "Cole", "Kronenwetter", 12345678);
        //student.PrintStudent();


    }
}


