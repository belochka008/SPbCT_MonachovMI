Client 2:
package com.metanit;

import java.net.*;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;


class ClientSomthing {

    private Socket socket;
    private BufferedReader in; // поток чтения из сокета
    private BufferedWriter out; // поток чтения в сокет
    private BufferedReader inputUser; // поток чтения с консоли
    private String addr; // ip адрес клиента
    private int port; // порт соединения
    private String nickname; // имя клиента
    private Date time;
    private String dtime;
    private SimpleDateFormat dt1;

    

    public ClientSomthing(String addr, int port) {
        this.addr = addr;
        this.port = port;
        try {
            this.socket = new Socket(addr, port);
        } catch (IOException e) {
            System.err.println("Socket failed");
        }
        try {
            
            inputUser = new BufferedReader(new InputStreamReader(System.in));
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            this.pressNickname(); 
            new ReadMsg().start(); 
            new WriteMsg().start(); 
        } catch (IOException e) {
            
            ClientSomthing.this.downService();
        }
        // В противном случае сокет будет закрыт
        // в методе run() нити.
    }

    

    private void pressNickname() {
        System.out.print("Press your nick: ");
        try {
            nickname = inputUser.readLine();
            out.write("Hello " + nickname + "\n");
            out.flush();
        } catch (IOException ignored) {
        }

    }

   
    private void downService() {
        try {
            if (!socket.isClosed()) {
                socket.close();
                in.close();
                out.close();
            }
        } catch (IOException ignored) {}
    }

   
    private class ReadMsg extends Thread {
        @Override
        public void run() {

            String str;
            try {
                while (true) {
                    str = in.readLine(); // ждем сообщения с сервера
                    if (str.equals("stop")) {
                        ClientSomthing.this.downService(); 
                        break; 
                    }
                    System.out.println(str); // пишем сообщение с сервера на консоль
                }
            } catch (IOException e) {
                ClientSomthing.this.downService();
            }
        }
    }

    
    public class WriteMsg extends Thread {

        
        public void run() {
            while (true) {
                String userWord;
                try {
                    time = new Date(); 
                    dt1 = new SimpleDateFormat("HH:mm:ss"); 
                    dtime = dt1.format(time); // время
                    userWord = inputUser.readLine(); // сообщения с консоли
                    if (userWord.equals("stop")) {
                        out.write("stop" + "\n");
                        ClientSomthing.this.downService(); 
                        break; // выходим из цикла если пришло "stop"
                    } else {
                        out.write("(" + dtime + ") " + nickname + ": " + userWord + "\n"); 
                    }
                    out.flush(); 
                } catch (IOException e) {
                    ClientSomthing.this.downService(); 
                }

            }
        }
    }
}

public class Main {

    public static String ipAddr = "localhost";
    public static int port = 8080;

   
    public static void main(String[] args) {
        new ClientSomthing(ipAddr, port);
    }
}