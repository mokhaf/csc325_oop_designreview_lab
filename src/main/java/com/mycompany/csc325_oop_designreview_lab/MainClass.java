/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.csc325_oop_designreview_lab;

import java.util.Scanner;

/**
 * Driver class for the OOP Design Review Lab
 * Demonstrates creation, configuration, and display of
 * Student, Freshman, and Senior objects.
 *
 * @author MoaathAlrajab
 */
public class MainClass {

 public static void main(String[] args) {

	// Create a basic student and assign address
	Student std1= new Student("James", 20);
	std1.setAddress("123 Farmingdale Ave");

	// Prompt for and set GPA
 	Scanner scnr = new Scanner(System.in);
 	System.out.print("Enter GPA for " + std1.getName() + ": ");
 	std1.setGPA(scnr.nextDouble());


	// Create a freshman student, set address and GPA
	Freshman std2 = new Freshman("Huda", 20, 12); // name, age, credits
	std2.setAddress("321 Hurricane Ln");
	std2.setGPA(3.0);


	// Create a senior student, set address and GPA
	Senior std3 = new Senior("Amaya", 30, 90);
	std3.setAddress("456 Papaya Rd");
	std3.setGPA(3.5);

	// Display all student's info
 	System.out.println(std1);
 	System.out.println(std2);
 	System.out.println(std3);

 	scnr.close(); // close scanner

	}

}

