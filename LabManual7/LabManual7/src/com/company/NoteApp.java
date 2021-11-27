package com.company;

import java.util.ArrayList;

public class NoteApp {
    public static ArrayList<String> fileNames;
    private FileUtils tool;
    public NoteApp() {
        this.fileNames = new ArrayList<>();
        this.tool = new FileUtils();
    }

    /**
     * brief list of
     * show a brief list of notes to user
     */
    public void list() {

    }

    /**
     * show all notes
     * show all notes to user
     */
    public void showAll() {
        for (String str : fileNames) {
            tool.read(fileNames.indexOf(str));
        }
    }

    /**
     * showing the note
     * @param index index of the note that user requested to watch
     */
    public void show(int index) {
        tool.read(index);
    }

    /**
     * removing note from app
     * @param index index of the note that user requested to remove
     */
    public void remove(Note note) {
        //fileNames.remove(note);
    }

    /**
     * adding note to app
     * @param note that user requested to add in app
     */
    public void add(Note note) {
        tool.write(note);
    }
    public 
}
