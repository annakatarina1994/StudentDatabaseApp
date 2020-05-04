package com.practice;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    //Ask how many new students to add
	System.out.print("Enter number of new students to enroll: ");
    Scanner input = new Scanner(System.in);
    int numberOfStudents = input.nextInt();
    Student[] students = new Student[numberOfStudents];

	//Create n number of new students
	for (int n = 0; n < numberOfStudents; n++) {
		students[n] = new Student();
		students[n].enroll();
		students[n].payTuiton();
		System.out.println(students[n].showInfo());
	}


    }
}
