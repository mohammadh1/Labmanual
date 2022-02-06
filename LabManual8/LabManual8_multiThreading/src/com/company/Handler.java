package com.company;

import java.io.*;
import java.net.Socket;

public class Handler implements Runnable{
    private Socket socket;

    /**
     * constructor of Handler class
     * @param socket socket for every client
     */
    public Handler(Socket socket)
    {
        this.socket = socket;
    }
    public void run()
    {
        try {
            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
            String line = "";
            StringBuilder total = new StringBuilder();
            while (!line.equals("over"))
            {
                line = dataInputStream.readUTF();
                total = total.append(line);
                total = total.append("  ");
                dataOutputStream.writeUTF(total.toString());
            }
            dataInputStream.close();
            dataOutputStream.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

