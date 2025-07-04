package com.mycompany.csc325_oop_designreview_lab;

/**
 * Represents a freshman student, extending Student
 * Tracks the number of credits a freshman has completed
 */

public class Freshman extends Student {

    /** Completed credit hours for this freshman */
    private int credits;

    /**
     * Constructs a freshman with name, age, and earned credits
     * @param name - student's name
     * @param age - student's age
     * @param credits - number of credits earned
     */
    public Freshman(String name, int age, int credits) {
        super(name, age);
        this.credits = credits;
    }

    /**
     * Returns the number of credits this freshman has completed.
     * @return completed credits
     */
    public int getCredits() {
        return credits;
    }

    /**
     * Updates the credit count for this freshman.
     * @param credits new completed credits value
     */
    public void setCredits(int credits) {
        this.credits = credits;
    }

    /**
     * Returns a string representation of the freshman,
     * including inherited student info and credit count.
     * @return formatted freshman details
     */
    @Override
    public String toString() {
        return "Freshman{name = " + getName() +
                ", age = " + getAge() +
                ", address = " + getAddress() +
                ", GPA = " + getGPA() +
                ", credits = " + credits +
                "}";
    }
}
