package com.company;

import java.util.ArrayList;

/**
 * Insurance class to hold insurances and theirs info
 *
 * @author Mohammad Hoseinkhani
 * @version beta
 */
public class Insurance {
    private String name;
    private int id;
    private ArrayList<Insurance> insurances;

    public Insurance(String name, int id, ArrayList<Insurance> insurances) {
        this.name = name;
        this.id = id;
        this.insurances = insurances;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public ArrayList<Insurance> getInsurances() {
        return insurances;
    }
    public void setInsurances(ArrayList<Insurance> insurances) {
        this.insurances = insurances;
    }

    /**
     * add insurance to list
     * @param insurance
     */
    public void addInsurance (Insurance insurance) {}
}
