package com.layzbot.chat;

import rx.functions.Action;
import rx.functions.Action1;
import rx.subjects.PublishSubject;

public class Server {

    public static final PublishSubject<String> chatHistory = PublishSubject.create();

    private static Server INSTANCE = null;
    private Server() {
    }
    public static Server getInstance() {
        if(INSTANCE ==null) {
            INSTANCE = new Server();
        }
        return INSTANCE;
    }

    public void broadcastMessage(String message) {
        chatHistory.onNext(message);
    }

    public void subscribeToServer(Action1 action) {
        chatHistory.subscribe(action);
    }

}
