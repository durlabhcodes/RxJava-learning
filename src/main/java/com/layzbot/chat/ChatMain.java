package com.layzbot.chat;

public class ChatMain {
    public static void main(String[] args) {

        Client c = new Client();

        c.send("Hello");
        c.send("World");

    }
}
