package com.company;

import java.io.*;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileUtils {
    public void writeStr(String str) {
        try (FileOutputStream out = new FileOutputStream("file.txt")){
            out.write(str.getBytes());
            //System.out.println(str);
            System.out.println("text is written");
        } catch (IOException e) {
            System.err.println("Exception");
        }
    }
    public void readStr() {
        try (FileInputStream in = new FileInputStream("file.txt")) {
            int c;
            String str = "";
            while ((c = in.read()) != -1) {
                str += (char)c;
            }
            System.out.println("text : " + str);
        } catch (IOException e) {
            System.err.println("Exception");
        }
    }
}
