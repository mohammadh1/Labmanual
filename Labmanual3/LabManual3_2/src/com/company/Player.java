package com.company;
/**
 * Player class for play song or pause song
 *
 * @author mohammad hoseinkhani
 * @version 0.0
 */
public class Player {
    //
    private static boolean isPlaying;
    /**
     * Constructor for objects of class MusicFilePlayer
     */
    public Player() {
        isPlaying = false;
    }
    /**
     * Start playing the given audio file.
     * The method returns once the playing has been started.
     * @param filename The file to be played.
     */
    public static void startPlaying(String filename) {
        System.out.println(filename + " is playing...");
        isPlaying = true;
    }
    /**
     * stop the selected music
     */
    public static void stopPlaying() {
        System.out.println("player is stopped!");
        isPlaying = false;
    }

}
