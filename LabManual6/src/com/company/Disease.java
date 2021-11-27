package com.company;

import java.util.ArrayList;

/**
 * Disease class to save info about disease
 *
 * @author Mohammad Hoseinkhani
 * @version beta
 */
public class Disease {
    private String name;
    private int level;
    private int securityLevel;
    private ArrayList<Disease> diseases;

    public Disease(String name, int level, int securityLevel, ArrayList<Disease> diseases) {
        this.name = name;
        this.level = level;
        this.securityLevel = securityLevel;
        this.diseases = diseases;
    }
    public Disease() {
        this.name = new String();
        this.level = 0;
        this.securityLevel = 0;
        this.diseases = new ArrayList<>();
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }
    public int getSecurityLevel() {
        return securityLevel;
    }
    public void setSecurityLevel(int securityLevel) {
        this.securityLevel = securityLevel;
    }
    public ArrayList<Disease> getDiseases() {
        return diseases;
    }

    public void addDisease (Disease disease) {}
}
