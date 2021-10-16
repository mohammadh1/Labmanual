package com.company;
/**
 * Music Player App
 * @author mohammad hoseinkhani
 * @version 0.0
 */
import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    /**
     * search List for selected song
     * @param str1 name of song
     * @param songs List
     */
    public void searchSong(String str1 , Music[] songs) {
        Scanner sc  = new Scanner(System.in);
        str1 = sc.nextLine();
        for (int i = 0; i < 100 ; i++) {
            if (songs[i].getName().equals(str1) || songs[i].getArtist().equals(str1)) {
                Player.startPlaying(str1);
                break;
            }
            else
                System.out.println("not found");
        }
    }
    public static void main(String[] args) {
        ArrayList<Music> songs = new ArrayList<>();
        Music song1 = new Music("song1", "artist1", 2001);
        songs.add(song1);
        Music song2 = new Music("song2", "artist2", 2002);
        songs.add(song2);
        Music song3 = new Music("song3", "artist3", 2003);
        songs.add(song3);
        MusicCollection[] pop = new MusicCollection[3];
        for (int j = 0 ; j < 3 ; j++) {
            pop[j] = new MusicCollection();
        }
        pop[0].setFiles(songs);
        pop[0].printAllList();
        System.out.println("****************************8");
        pop[0].addLikedSong(song2);
        pop[0].printLikedSongs();
        System.out.println("****************************8");
        pop[0].deleteSong(song2);
        pop[0].printAllList();

    }
}








//Music temp = new Music();
            /*for (int i = 0; i < 3; i++) {
                System.out.println("***********************");
                System.out.println("(song #" + i + ")");

                System.out.print("name of song : ");
                Scanner sc = new Scanner(System.in);
                String str = sc.nextLine();
                temp.setName(str);

                System.out.print("name of artist : ");
                str = sc.nextLine();
                temp.setArtist(str);

                System.out.print("year : ");
                int yr = sc.nextInt();
                temp.setYear(yr);
                songs.add(temp);

                System.out.println("**********************");
            }
            System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");*/
