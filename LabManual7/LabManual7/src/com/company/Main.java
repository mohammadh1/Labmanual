package com.company;

import java.util.ArrayList;

import static com.company.NoteApp.fileNames;

public class Main {

    public static void main(String[] args) {
        Note note1 = new Note(1, "hi", "salam chetori", "1397-01-23");
        Note note2 = new Note(2, "info", "mohammad hoseinkhani", "1397-01-23");
        FileUtils ff = new FileUtils();
        NoteApp noteApp = new NoteApp();
        noteApp.add(note1);
        noteApp.add(note2);
        System.out.println("###################");
        NoteApp.
    }
}
