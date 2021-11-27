package com.company;

import java.util.HashMap;

/**
 * University class to save info about university
 *
 * @author Mohammad Hoseinkhani
 * @version beta
 */
public class University {
    private String name;
    private String id;
    private int level;
    private HashMap<University, Boolean> selecteduniversities;


    public University(String name, String id, int level) {
        this.name = name;
        this.id = id;
        this.level = level;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }
    public HashMap<University, Boolean> getUniversities() {
        return selecteduniversities;
    }

    /**
     * @param university selected university that must be add into list
     * @param selected a boolean statement that tell us whether the university is selected or not
     */
    public void addUniversityIntoList (University university, boolean selected) {}
}
