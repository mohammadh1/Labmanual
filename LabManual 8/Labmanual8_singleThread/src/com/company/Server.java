package com.company;

import java.net.*;
import java.io.*;
import java.util.Scanner;

import static java.lang.System.in;

public class Server {
    public Server(int port)
    {
        try {
            ServerSocket server = new ServerSocket(port);
            Socket socket = server.accept();
            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            String line = "";
            StringBuilder total = new StringBuilder();
            while (!line.equals("over"))
            {
                line = in.readUTF();
                total = total.append(line);
                total = total.append("  ");
                out.writeUTF(total.toString());
            }
            socket.close();
            in.close();
            out.close();
        }
        catch(IOException i)
        {
            System.out.println(i);
        }
    }
    public static void main(String args[])
    {
        Server server = new Server(5000);
    }
}
