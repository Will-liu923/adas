package com.leoLW.javasestudy.day08.ObjectOriented.Homework;

public class Dog extends Animal {

    private String ID;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    private Dog() {}

    public Dog(String ID) {
        this.ID = ID;
    }

    public Dog(String name, String ID) {
        super(name);
        this.ID = ID;
    }

    public void play() {
        System.out.println(getID() + " " + getName() + " is woo woo...");
    }
}
