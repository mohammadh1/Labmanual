package com.company;

import java.util.ArrayList;

/**
 * MedicalFile class to pair patients to theirs medical records
 *
 * @author Mohammad Hoseinkhani
 * @version beta
 */
public class MedicalFile {
    private MedicalRecord medicalRecord;
    private Patient patient;

    public MedicalFile(MedicalRecord medicalRecord, Patient patient) {
        this.medicalRecord = medicalRecord;
        this.patient = patient;
    }

    public MedicalRecord getMedicalRecord() {
        return medicalRecord;
    }
    public void setMedicalRecord(MedicalRecord medicalRecord) {
        this.medicalRecord = medicalRecord;
    }
    public Patient getPatient() {
        return patient;
    }
    public void setPatient(Patient patient) {
        this.patient = patient;
    }
}
