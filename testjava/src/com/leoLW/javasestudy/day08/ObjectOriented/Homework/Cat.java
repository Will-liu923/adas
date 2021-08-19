package com.leoLW.javasestudy.day08.ObjectOriented.Homework;

public class Cat extends Animal {
    private String size;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Cat() {}

    public Cat(String size) {
        this.size = size;
    }

    public Cat(String name, String size) {
        super(name);
        this.size = size;
    }

    public void move() {
        System.out.println(getSize() + " " + getName() + " is moving");
    }

    public void makeSound() {
        System.out.println(getSize() + " " + getName() + "is cew cew...");
    }
}
