package org.example;

import org.example.client.TelegramBot;

public class App {
    public static void main(String[] args) {


        new Thread(new TelegramBot(new DefaultHandler())).start();

    }
}
