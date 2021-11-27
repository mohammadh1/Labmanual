package com.company;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * Patient class to save info of patients and show them
 *
 * @author Mohammad Hoseinkhani
 * @version beta
 */
public class Patient {
    private String name;
    private Date birthDate;
    private char sex;
    private Insurance insurance;
    private MedicalRecord medicalRecord;
    private String degree;
    private Location location;

    public Patient(String name, Date birthDate, char sex, Insurance insurance, MedicalRecord medicalRecord, String degree, Location location) {
        this.name = name;
        this.birthDate = birthDate;
        this.sex = sex;
        this.insurance = insurance;
        this.medicalRecord = medicalRecord;
        this.degree = degree;
        this.location = location;
    }

    public String getName() {
        return name;
    }
    public Date getBirthDate() {
        return birthDate;
    }
    public char getSex() {
        return sex;
    }
    public Insurance getInsurance() {
        return insurance;
    }
    public MedicalRecord getMedicalRecord() {
        return medicalRecord;
    }
    public String getDegree() {
        return degree;
    }
    public Location getLocation() {
        return location;
    }

    /**
     * give permission to the doctor to see theirs records
     * @param nameOfDoctor
     */
    public void givePermissionToDoctor (String nameOfDoctor) {}

    /**
     * showing the info of patient
     */
    public void showPatientInfo () {}
}
