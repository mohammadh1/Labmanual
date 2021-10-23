package com.company;

import ir.huri.jcal.JalaliCalendar;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**
         * changing color of output texts in terminal
         */
        final String ANSI_YELLOW = "\u001B[33m";
        final String ANSI_RESET = "\u001B[0m";
        /**
         * define scanners
         */
        Scanner scanIndex = new Scanner(System.in);
        Scanner scanDate = new Scanner(System.in);
        Scanner scanInfo = new Scanner(System.in);
        Scanner scanChoice = new Scanner(System.in);
        /**
         * define a new VotingSystem object
         * define a arraylist for saving choices
         */
        VotingSystem votingSys = new VotingSystem();
        ArrayList<String> votedChoices = new ArrayList<String>();
        /**
         * add question and choices
         */
        votingSys.createVoting("which continent do you prefer?", 0);
        votingSys.createChoice("which continent do you prefer?", "Europe");
        votingSys.createChoice("which continent do you prefer?", "North America");
        votingSys.createChoice("which continent do you prefer?", "Asia");
        votingSys.createVoting("which movie do you like most?", 1);
        votingSys.createChoice("which movie do you like most?", "Se7en");
        votingSys.createChoice("which movie do you like most?", "Godfather");
        votingSys.createChoice("which movie do you like most?", "Shawshank redemption");
        votingSys.createChoice("which continent do you prefer?", "South America");
        /**
         * print list of voting (questions and their choices)
         */
        votingSys.printListOfVoting();
        System.out.println("**************************************");
        /**
         * save index of voting to print
         */
        System.out.print(ANSI_YELLOW + "Enter the index of voting : " + ANSI_RESET);
        int index = scanIndex.nextInt();
        System.out.println(ANSI_YELLOW + "*index saved*" + ANSI_RESET);
        System.out.println("**************************************");
        System.out.println(ANSI_YELLOW + "Showing of selected index : " + ANSI_RESET);
        votingSys.printVoting(index);
        System.out.println("**************************************");
        /**
         * save date of vote to pass in the vote method
         * use split method to separate year and month and day
         */
        System.out.print(ANSI_YELLOW + "Enter date of vote : " + ANSI_RESET);
        int[] dateInt = new int[3];
        String[] date = scanDate.nextLine().split("/");
        for (int i = 0; i < 3; i++) {
            dateInt[i] = Integer.parseInt(date[i]);
        }
        JalaliCalendar day = new JalaliCalendar(dateInt[0], dateInt[1], dateInt[2]);
        System.out.println(day);
        System.out.println(ANSI_YELLOW + "*Date saved*" + ANSI_RESET);
        System.out.println("**************************************");
        // while (scan)      try to run program endlessly
        /**
         * get the info of vote such as firstname and lastname and index of voting
         */
        System.out.println(ANSI_YELLOW + "Enter vote info : (voteIndex-firstname-lastname)" + ANSI_RESET);
        String[] info = scanInfo.nextLine().split("-");
        int voteIndex = Integer.parseInt(info[0]);
        System.out.println(ANSI_YELLOW + "*Info saved*" + ANSI_RESET);
        System.out.println("**************************************");
        /**
         * get choices of who are voting
         */
        System.out.println(ANSI_YELLOW + "Enter your choices : (enter !exit when it's done)" + ANSI_RESET);
        String selectedChoice = scanChoice.nextLine();
        while (scanChoice.hasNext()) {
            votedChoices.add(selectedChoice);
            selectedChoice = scanChoice.nextLine();
            if (Objects.equals(selectedChoice, "exit"))
                break;
        }
        votingSys.vote(voteIndex, info[1], info[2], day, votedChoices);
        votingSys.printResult(0);


    }
}
