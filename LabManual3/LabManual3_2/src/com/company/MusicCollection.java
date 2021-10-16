package com.company;
/**
 * MusicCollection class for creating a List of songs that has been created with Music class
 *
 * @author mohammad hoseinkhani
 * @version 0.0
 */
import java.util.ArrayList;
import java.util.Iterator;
public class MusicCollection {
    private ArrayList<Music> files;
    private ArrayList<Music> likedFiles;

    /**
     * constructor of MusicCollection
     */
    public MusicCollection() {
        this.files = new ArrayList<Music>();
        this.likedFiles = new ArrayList<Music>();
    }

    /**
     * get files
     * @return files
     */
    public ArrayList<Music> getFiles() {
        return files;
    }

    /**
     * set files
     * @param files ArrayList of Music
     */
    public void setFiles(ArrayList<Music> files) {
        this.files = files;
    }

    /**
     * add song into file ArrayList
     * @param song
     */
    public void addSong(Music song) {
            files.add(song);
    }

    /**
     * delete song from files ArrayList
     * @param song
     */
    public void deleteSong(Music song) {
        Iterator<Music> it = files.iterator();
        while(it.hasNext()) {
            Music name = it.next();
            if(name.getName().equals(song.getName()))
                it.remove();
        }
    }

    /**
     * play song and show status if user enter song name
     * @param song name of song
     */
    public void playSong(String song) {
        for (Music temp : files) {
            if (temp.getName().equals(song)) {
                Player.startPlaying(temp.getName());
                break;
            }
        }
    }

    /**
     * play song and show status if user enter index of ArrayList
     * @param index index of files line
     */
    public void playSong(int index) {
        if (validIndex(index)) {
            Music name = files.get(index);
            Player.startPlaying(name.getName());
        }
        else
            System.err.println("index is invalid, please try again");
    }

    /**
     * stop song
     */
    public void stopSong() {
        Player.stopPlaying();
    }

    /**
     * print the whole List
     */
    public void printAllList() {
        System.out.println("List of songs :");
        for (Music temp : files) {
            System.out.println("song : " + temp.getName());
        }
    }

    /**
     * print a specific object of List
     * @param index index of array list
     */
    public void printList(int index) {
        if (validIndex(index)){
            System.out.println("info of songs :");
            System.out.println(files.get(index));
        }
        else
            System.err.println("index is invalid, please try again");
    }

    /**
     * print size List
     */
    public void sizeList() {
        System.out.println("Number of songs : " + files.size());
    }

    /**
     * check if the index that user has entered is valid or not
     * @param index index of array list
     * @return a boolean variable
     */
    private boolean validIndex(int index) {
        int size = files.size();
        if (index > size || index < 0)
            return false;
        else
            return true;
    }

    /**
     * add liked song into List with name of song
     * @param music name os music
     */
    public void addLikedSong(Music music) {
                likedFiles.add(music);
    }
    /**
     * remove liked song into List with name of song
     * @param str1 name of song
     */
    public void removeLikedSong(String str1) {
        Iterator<Music> it = likedFiles.iterator();
        while (it.hasNext()) {
            Music name = it.next();
            if (name.getName().equals(str1)) {
                it.remove();
                break;
            }
        }
    }

    /**
     * print Liked songs List
     */
    public void printLikedSongs() {
        System.out.println("List of songs :");
        for (Music temp : likedFiles) {
            System.out.println(temp);
        }
    }

}
