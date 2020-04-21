package com.layzbot.chat;

public class Client {
    Server s;
    public Client() {
        this.s = Server.getInstance();
        s.subscribeToServer(System.out::println);
    }

    public void send(String message) {
        s.broadcastMessage(message);
    }
}
