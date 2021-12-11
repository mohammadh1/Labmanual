package com.company;

import java.net.*;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Client {
    public Client(String address, int port) {
        try {
            Socket socket = new Socket(address, port);
            BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            String line = "";
            while (!line.equals("over")) {
                try {
                    line = scan.readLine();
                    out.writeUTF(line);
                    System.out.println(in.readUTF());
                } catch (IOException i) {
                    System.out.println(i);
                }
            }
            in.close();
            out.flush();
            out.close();
            socket.close();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String args[])
    {
        Client client = new Client("127.0.0.1", 5000);
    }
}