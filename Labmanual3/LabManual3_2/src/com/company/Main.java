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
        MusicCollection[] categories = new MusicCollection[3];
        
        for (int j = 0 ; j < 2 ; j++) {
            ArrayList<Music> songs = new ArrayList<>();
            Music temp = new Music();
            System.out.println("(Category #" + j + ")");
            for (int i = 0; i < 1; i++) {
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
            System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
            categories[j].setFiles(songs);
        }
    }
}
