/**
     * The Lab class represents a lab that students are attending to participate in
     * It holds the lab details relevant in our context.
     * @author mohammadh1
     * @version 0.0
 */
package com.company;
public class Lab {
    // objects of student class
    private Student[] students;

    // average of grades
    private int avg;

    // the day that class will be held
    private String day;

    // the capacity of lab
    private int capacity;

    // the currentsize of lab
    private int currentSize;

    /**
     * Create a new lab with a specific capacity and the day that class will be held
     *
     * @param cap capacity of class
     * @param d day of class
     */
    public Lab(int cap, String d ) {
        capacity = cap;
        day = d;
        currentSize = 0;
        this.students = new Student[capacity];
    }

    /**
     * @param std set new student into students object
     */
    public void enrollStudent(Student std) {
        if (currentSize < capacity) {
            students[currentSize] = std;
            currentSize++;
        } else {
            System.out.println("Lab is full!!!");
        }
    }

    /**
     * Print the average of lab and day to the
     output terminal.
     */
    public void print() {
        System.out.println("avg :" + avg);
        System.out.println("day :" + day);
        for (int i = 0; i < capacity ; i++)
        {
            System.out.println("students :" + students[i]);
        }
    }

    public Student[] getStudents() {
        return students;
    }

    /**
     * @param students set students into students object   ????????
     */
    public void setStudents(Student[] students) {
        this.students = students;
    }

    /**
     * get average of lab 
     * @return avg field
     */
    public int getAvg() {
        return avg;
    }

    /**
     * calculating the average
     */
    public void calculateAvg() {
        int temp = 0;
        int score = 0;
        for ( int i = 0 ; i < currentSize ; i++ )
        {
            score = students[i].getGrade();
            temp += score;
        }
        avg = temp / currentSize;
    }

    /**
     * get day which lab will be held
     * @return day field
     */
    public String getDay() {
        return day;
    }

    /**
     * @param  day set day which class will be held
     */
    public void setDay(String day) {
        this.day = day;
    }

    /**
     * get capacity of lab
     * @return capacity field
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * @param capacity set capacity of lab
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
