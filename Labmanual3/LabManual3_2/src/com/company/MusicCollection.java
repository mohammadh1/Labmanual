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
    public static ArrayList<Music> files;
    public static ArrayList<Music> likedFiles;

    /**
     * constructor of MusicCollection
     */
    public MusicCollection() {
        files = new ArrayList<Music>();
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
     * @param files
     */
    public void setFiles(ArrayList<Music> files) {
        this.files = files;
    }

    /**
     * add song into file ArrayList
     * @param song
     */
    public void addSong(Music song) {
        if (files == null) {
            files.add(song);
        }
    }

    /**
     * delete song from files ArrayList
     * @param song
     */
    public void deleteSong(Music song) {
        Iterator<Music> it = files.iterator();
        while(it.hasNext()) {
            Music name = it.next();
            if(name.equals(song))
                it.remove();
        }
    }

    /**
     * play song and show status if user enter song name
     * @param song
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
     * @param index
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
    public void printALLList() {
        System.out.println("List of songs :");
        for (Music temp : files) {
            System.out.println(temp);
        }
    }

    /**
     * print a specific object of List
     * @param index
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
     * @param index
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
     * @param str1
     */
    public void addLikedSong(String str1) {
        for (int i = 0; i < files.size() ; i++) {
            if (likedFiles.get(i).getName().equals(str1)) {
                likedFiles.add(files.get(i));
                break;
            }
        }
    }
    /**
     * remove liked song into List with name of song
     * @param str1
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
