package com.mycompany.csc325_oop_designreview_lab;

/**
 * Represents a senior student, extending Student
 * Enforces a minimum credit requirement (85+) for senior status
 */

public class Senior extends Student {

    /** Completed credit hours for this senior (must be >= 85) */
    private int credits;

    /**
     * Constructs a Senior, enforcing at least 85 credits
     * @param name - student's name
     * @param age - student's age
     * @param credits - number of credits earned (must be >=85)
     * @throws IllegalArgumentException if credits < 85
     */
    public Senior(String name, int age, int credits) {
        super(name, age);
        if (credits < 85) {
            throw new IllegalArgumentException("Senior must have at least 85 credits");
        }
        this.credits = credits;
    }

    /**
     * Returns the number of credits this senior has completed.
     * @return completed credits
     */
    public int getCredits() {
        return credits;
    }

    /**
     * Updates the credit count for this senior.
     * Re-validates the minimum credit rule.
     * @param credits new completed credits (must be >= 85)
     * @throws IllegalArgumentException if credits < 85
     */
    public void setCredits(int credits) {
        if (credits < 85) {
            throw new IllegalArgumentException("Senior must have at least 85 credits");
        }
        this.credits = credits;
    }

    /**
     * Returns a string representation of the senior,
     * including inherited student info and credit count.
     * @return formatted senior details
     */
    @Override
    public String toString() {
        return "Senior{name = " + getName() +
                ", age = " + getAge() +
                ", address = " + getAddress() +
                ", GPA = " + getGPA() +
                ", credits = " + getCredits() +
                "}";
    }
}
