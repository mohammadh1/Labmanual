package com.company;

/**
 * Location class to save addresses
 *
 * @author Mohammad Hoseinkhani
 * @version beta
 */
public class Location {
    private String city;
    private String street;
    private String alley;
    private String number;

    public Location(String city, String street, String alley, String number) {
        this.city = city;
        this.street = street;
        this.alley = alley;
        this.number = number;
    }

    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public String getAlley() {
        return alley;
    }
    public void setAlley(String alley) {
        this.alley = alley;
    }
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
}
