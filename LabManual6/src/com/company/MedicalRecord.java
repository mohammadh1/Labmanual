package com.company;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * MedicalRecord class to save records of patients and show them
 *
 * @author Mohammad Hoseinkhani
 * @version beta
 */
public class MedicalRecord {
    private Disease disease;
    private String state;
    private String doctorAdvice;
    private ArrayList<Medicine> selectedMedicines;
    private HashMap<Doctor, Integer> selectedDoctors;
    private ArrayList<Date> dates;

    public MedicalRecord() {
        this.disease = new Disease();
        this.state = new String();
        this.doctorAdvice = new String();
        this.selectedMedicines = new ArrayList<>();
        this.selectedDoctors = new HashMap<>();
        this.dates = new ArrayList<>();
    }

    public void setDisease(Disease disease) {
        this.disease = disease;
    }
    public void setState(String state) {
        this.state = state;
    }
    public void setDoctorAdvice(String doctorAdvice) {
        this.doctorAdvice = doctorAdvice;
    }

    /**
     * adding selected doctor to list
     * @param doctor selected doctor
     */
    public void addDoctor (Doctor doctor) {}

    /**
     * adding advised medicine to list
     * @param medicine advised medicine
     */
    public void addMedicine (Medicine medicine) {}

    /**
     * adding dates that patient was visited
     * @param date
     */
    public void addDate (Date date) {}

    /**
     * showing the record
     */
    public void showRecord () {}
}
