package com.company;

import java.io.*;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
public class FileUtils {
    public void writeStr(String str) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("file.txt"));
            writer.write(str);
            System.out.println("text is written");
            writer.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void readStr() {
        try (BufferedReader reader = new BufferedReader(new FileReader("file.txt"))){
            int count;
            char[] buffer = new char[1024];
            while (reader.ready()) {
                count = reader.read(buffer);
                System.out.println(new String(buffer, 0, count));
            }
        }
        catch (FileNotFoundException ex) {
            ex.printStackTrace(System.err);
        } catch (IOException ex) {
            ex.printStackTrace(System.err);
        }
    }
}
