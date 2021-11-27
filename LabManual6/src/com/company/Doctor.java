package com.company;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Doctor class to save info of doctors and show them
 *
 * @author Mohammad Hoseinkhani
 * @version beta
 */
public class Doctor {
    private String name;
    private int id;
    private ArrayList<Doctor> doctors;

    public Doctor(String name, int id) {
        this.name = name;
        this.id = id;
        Doctor doctor = new Doctor(name, id);
        doctors.add(doctor);
    }

    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }

}
