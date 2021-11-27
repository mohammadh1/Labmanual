package com.company;

import java.util.ArrayList;
/**
 * Medicine class to save medicines and hold theirs info
 *
 * @author Mohammad Hoseinkhani
 * @version beta
 */
public class Medicine {
    private String name;
    private String id;
    private String price;

    public Medicine(String name, String id, String price) {
        this.name = name;
        this.id = id;
        this.price = price;
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
    public String getPrice() {
        return price;
    }
    public void setPrice(String price) {
        this.price = price;
    }

    /**
     * selected medicine will be added into list of medicine that patient should take
     * @param medicine selected medicine
     */
    public void addMedicine (Medicine medicine) {}
}
