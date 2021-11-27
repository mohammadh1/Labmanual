package com.company;

import java.io.*;
import java.util.ArrayList;

import static com.company.NoteApp.fileNames;

/**
 * FileUtils class is created so we can read and write objects on files
 * @author Mohammad Hoseinkhani
 * @version 0.0
 */
public class FileUtils {

    /**
     * constructor of FileUtils
     */
    public FileUtils() {
    }

    /**
     * write method for writing to file and save it
     * @param note the note that must be written
     */
    public void write(Note note) {
        // name will be the hashcode so every note have a different name
        String fileName = note.hashCode() + ".txt";
        fileNames.add(String.valueOf(note.hashCode()));
        try ( FileOutputStream fo = new FileOutputStream(fileName) ){
            ObjectOutputStream oo = new ObjectOutputStream(fo);
            oo.writeObject(note);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * read method for reading from file and show it to user
     * @return the note that must be read
     */
    public Note read(int index) {
        Note note = null;
        String fileName = fileNames.get(index) + ".txt";
        try ( FileInputStream fi = new FileInputStream(fileName) ) {
            ObjectInputStream oi = new ObjectInputStream(fi);
            note = (Note) oi.readObject();
            System.out.println(note.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return note;
    }
}
