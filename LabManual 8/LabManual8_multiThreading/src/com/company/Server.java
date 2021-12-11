package com.company;

import java.net.*;
import java.io.*;
import java.util.Scanner;

import static java.lang.System.in;

public class Server {
    public Server(int port) {
        try {
            ServerSocket server = new ServerSocket(port);
            while (true) {
                Socket client = server.accept();
                System.out.println("New client connected" + client.getInetAddress().getHostAddress());
                //Handler clientSock = new Handler(client);
                new Thread(new Handler(client)).start();
            }
        } catch (IOException i) {
            System.out.println(i);
        }
    }

    public static void main(String args[]) {
        Server server = new Server(5000);
    }
}
