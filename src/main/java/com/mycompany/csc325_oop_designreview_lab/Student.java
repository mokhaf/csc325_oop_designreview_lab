/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 * Concrete class representing a student
 * Extends Human class to include academic details like GPA and address
 *
 * @author MoaathAlrajab
 */
public class Student extends Human {

    /** Mailing address for the student */
    private String address;

    /**
     * Constructs a Student with name and age
     * @param name - student's name
     * @param age - student's age
     */
    public Student(String name, int age) {
        super(name, (short) age);
    }

    /**
     * Returns this student's address
     * @return the address set for this student
     */
    @Override
    public String getAddress() {
        return address;
    }

    /**
     * Sets this student's address
     * @param address - the student's new address
     */
    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    /** Grade point average of the student */
    private double gpa;

    /**
     * Gets the student's GPA
     * @return current GPA
     */
    public double getGPA() {
        return gpa;
    }

    /**
     * Sets the student's GPA
     * @param gpa - the GPA to set
     */
    public void setGPA(double gpa) {
        this.gpa = gpa;
    }

    /**
     * Provides a string representation of the student, including
     * name, age, address, and GPA for easy debugging or logging.
     * @return formatted string of student details
     */
    @Override
    public String toString() {
        return "Student{name = " + getName() +
                ", age = " + getAge() +
                ", address = " + getAddress() +
                ", GPA = " + getGPA() +
                "}";
    }

}
