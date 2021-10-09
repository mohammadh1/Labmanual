/**
        * The Student class represents a student in a student
        administration system.
        * It holds the student details relevant in our context.
        * @author mohammadh1
        * @version 0.0
 */
package com.company;
public class Student {

    // the student's firstname
    private String firstName;

    // the student's lastname
    private String lastName;

    // the student's id
    private String id;

    // the student grade
    private int grade;

    /**
     * Create a new student with a given name and ID number.
     *
     * @param fName first name of student
     * @param lName last name of student
     * @param sID student ID
     */
    public Student(String fName, String lName, String sID) {
        firstName = fName;
        lastName = lName;
        id = sID ;
        grade = 0;
    }

    /**
     * get the first name of student
     * @return firstName field
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * get the last name of student
     * @return lastName field
     */
    public String getLastName() {
        return lastName;
    }
    /**
     * get the id of student
     * @return id field
     */
    public String getId() {
        return id;
    }

    /**
     * get the grade of student
     * @return grade field
     */
    public int getGrade() {
        return grade;
    }
    /**
     * @param fName set first name of a student
     */
    public void setFirstName(String fName) {
        firstName = fName;
    }

    /**
     * @param lName set last name of a student
     */
    public void setLastName(String lName) {
        lastName = lName;
    }
    public void setGrade (int gradeNum) {
        grade = gradeNum;
    }

    /**
     * @param id set id of a student
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Print the student’s first and last name and ID number and grade to the
     output terminal.
     */
    public void print () {
        System.out.println( "Name : " + firstName + " " + lastName );
        System.out.println( "ID :" + id + " // " + "grade :" + grade );
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
    }
}
