package com.company;

/**
 * Person class to save firstname and lastname
 *
 * @author Mohammad Hoseinkhani
 * @version 0.0
 */
public class Person {
    private String firstname;
    private String lastname;

    public Person (String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }
    public String getFirstname() {
        return firstname;
    }
    public String getLastname() {
        return lastname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    @Override
    public String toString(){
        return "[" + firstname + "," + lastname + "]";
    }
}
