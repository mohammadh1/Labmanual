package com.company;
/**
 * Music class to assign name , artist , year to every song
 *
 * @author mohammad hoseinkhani
 * @version 0.0
 */
public class Music {
    public String name;
    public String artist;
    public int year;

    /**
     * constructor of MusicCollection
     */
    public Music(String name, String artist, int year) {
        this.name = name;
        this.artist = artist;
        this.year = year;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getArtist() {
        return artist;
    }
    public void setArtist(String artist) {
        this.artist = artist;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public String toString(){
        return "[" + name + "," + artist + "," + year + "]";
    }
}
