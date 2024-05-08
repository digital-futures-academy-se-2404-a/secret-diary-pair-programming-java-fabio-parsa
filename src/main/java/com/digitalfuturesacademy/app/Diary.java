package com.digitalfuturesacademy.app;

import java.util.ArrayList;

public class Diary {

    ArrayList<String> entries = new ArrayList<String>();
    String pin;
    boolean isLocked;

    public void addEntries(String message) {
        if (message != null && !message.trim().isEmpty()) {
            entries.add(message);
        } else {
            System.out.println("We are very sorry but it seems you might have added an incorrect entry :( ");
        }
    }
}
