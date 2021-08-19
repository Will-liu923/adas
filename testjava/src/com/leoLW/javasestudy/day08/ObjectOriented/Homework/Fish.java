package com.leoLW.javasestudy.day08.ObjectOriented.Homework;

public class Fish extends Animal {

    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Fish() {}

    public Fish(String color) {
        this.color = color;
    }

    public Fish(String name, String color) {
        super(name);
        this.color = color;
    }

    public void move() {
        System.out.println(this.getName() + " is moving");
    }
}
