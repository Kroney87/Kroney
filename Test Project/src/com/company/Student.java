package com.company;

public class Student {
    private int age;
    private String fName;
    private String lName;
    private int UID;
    private int studentNum;

    public Student(int age, String fName, String lName, int UID){
        this.age = age;
        this.fName = fName;
        this.lName  =lName;
        this.UID = UID;
        studentNum++;
    }

    public void PrintStudent(){
        System.out.println("Student [" + studentNum + "]: " + lName + ", " + fName + " - " + age + " - <" + UID + ">");
    }


}
