package com.practice;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int year;
    private String studentID;
    private String courses = "";
    private int tuitionBalance = 0;
    private static int courseCost = 600;
    private static int id = 1000;

    public Student(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first name: ");
        this.firstName = input.nextLine();

        System.out.println("Enter last name: ");
        this.lastName = input.nextLine();

        System.out.println("Enter digit corresponding to student's year: \n" +
                "(1) Freshman \n" +
                "(2) Sophomore \n" +
                "(3) Junior \n" +
                "(4) Senior");
        this.year = input.nextInt();

        setStudentID();
    }

    // Generate a Student ID (Year + ID)
    private void setStudentID(){
        id++;
        this.studentID = year + "" + id;
    }

    //Enroll in courses using loop
    public void enroll(){
        do {
            System.out.print("Enter course to enroll (Q to quit): ");
            Scanner input = new Scanner(System.in);
            String course = input.nextLine();
            if (!course.equals("Q")) {
                courses = courses + "\n" + course;
                tuitionBalance = tuitionBalance + courseCost;
            } else {
                break;
            }
        } while (1 != 0);
    }

    //View balance
    public void viewBalance(){
        System.out.println("Your balance is: $" + tuitionBalance);
    }

    //Pay Tuition
    public void payTuiton(){
        viewBalance();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your payment: $");
        int payment = input.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of $" + payment + "!");
        viewBalance();
    }

    //Show status
    public String showInfo(){
        return "NAME: " + firstName + " " + lastName +
                "\nYEAR: " + year +
                "\nSTUDENT ID: " + studentID +
                "\nCOURSES: " + courses +
                "\nBALANCE: $" + tuitionBalance;

    }
}
