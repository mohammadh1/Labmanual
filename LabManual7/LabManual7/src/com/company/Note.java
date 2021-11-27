package com.company;

import java.io.Serializable;
import java.util.Objects;

/**
 * Note class is created so we can create object with specific information about each note
 * @author Mohammad Hoseinkhani
 * @version 0.0
 */
public class Note implements Serializable {
    private int index;
    private String name;
    private String text;
    private String date;
    public Note(int index, String name, String text, String date) {
        this.index = index;
        this.name = name;
        this.text = text;
        this.date = date;
    }

    /**
     * getter and setter methods for 3 fields that mentioned above
     * name - text - date
     */
    public int getIndex() {
        return index;
    }
    public void setIndex(int index) {
        this.index = index;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    @Override
    public String toString() {
        return "Name:" + name + "\ntext: " + text + "\ndate: " + date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Note)) return false;
        Note note = (Note) o;
        return index == note.index && name.equals(note.name) && text.equals(note.text) && date.equals(note.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(index, name, text, date);
    }

}
