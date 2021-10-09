/**
     * The Faculty class represents a faculty that contains all the labs and students
     * It holds the faculty details relevant in our context.
     * @author mohammadh1
     * @version 0.0
 */
package com.company;
public class Faculty {
    // objects of student class
    private Student[] students;

    // objects of student labs
    private Lab[] labs;

    // the capacity of faculty
    private int capacity;

    // number of classes
    private int numbersOfClasses;

    // number of courses
    private int numbersOfCourses;
    //private instructors[] instructors;
    /**
     * Create a new lab with a specific capacity and the day that class will be held
     *
     * @param capacity capacity of class
     * @param numOfCourses number of courses
     * @param numOfclasses number of classes
     */
    public Faculty(int capacity, int numOfclasses , int numOfCourses) {
        numbersOfClasses = numOfclasses;
        numbersOfCourses = numOfCourses;
        this.capacity = capacity;
    }

    /**
     * @param cap set capacity of faculty
     */
    public void setCapacity (int cap) {
        capacity = cap;
    }

    /**
     * @param num set number of classes
     */
    public void setNumbersOfClasses ( int num ) {
        numbersOfClasses = num;
    }

    /**
     * @param num set number of courses
     */
    public void setNumbersOfCourses ( int num ) {
        numbersOfCourses = num;
    }

    /**
     * get number of classes that take places in faculty
     * @return numberOfClasses field
     */
    public int getNumbersOfClasses() {
        return numbersOfClasses;
    }

    /**
     * get number of classse
     * @return numbersOfCourses field
     */
    public int getNumbersOfCourses() {
        return numbersOfCourses;
    }

    /**
     * get capacity of faculty
     * @return capacity field
     */
    public int getCapacity() {
        return capacity;
    }
}
