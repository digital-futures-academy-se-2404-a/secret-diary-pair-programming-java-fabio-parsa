package com.digitalfuturesacademy.app;

import java.util.ArrayList;

public class Diary {

    ArrayList<String> entries = new ArrayList<String>();
    String pin;
    boolean isLocked;

    public void addEntries(String message) {
       validateString(message, "We are very sorry but it seems you might have added an incorrect entry :( ");
        entries.add(message);
    }

    public ArrayList <String> getEntries (){
        return entries;
    };

    public void changePin (String newPin){
        validateString(newPin, "Invalid pin code, please try again");
        pin = newPin;
    }

    public String getPin(){
        return pin;
    }

    public void validateString (String string, String message){
           if (string == null || string.trim().isEmpty()) throw new IllegalArgumentException(message);
    }
}

