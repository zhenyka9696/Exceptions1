package com.company;

import java.util.Scanner;

//Singleton
public class WiseOwl {
    static Singleton wiseOwl;

    public static void main(String[] args) {
        wiseOwl = Singleton.getInstance();
        makeEvent("A boy helping an old man to carry a heavy basket");
        makeEvent("A little girl screamed at her mother");
        makeEvent("A woman telling another person how she saw an elephant jumping over her fence");

    }

    static void makeEvent(String s){
        Event event = new Event(s);
        System.out.println(s);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Will you help(y/n)?");
        String str= scanner.nextLine();
        if(str.equals("n"))wiseOwl.incWisdom();
        System.out.println("wisdom: "+wiseOwl.getWisdom());
    }
}

class Singleton{
    private static final Singleton instance = new Singleton();

    public int getWisdom() {
        return wisdom;
    }

    private int wisdom = 0;

    private Singleton(){
        System.out.println("New instance is created");
    }

    public static Singleton getInstance() {
        return instance;
    }

    public void incWisdom(){
        wisdom++;
    }
}

class Event{
    private final String name;

    Event(String name) {

        this.name
                = name;
    }
}