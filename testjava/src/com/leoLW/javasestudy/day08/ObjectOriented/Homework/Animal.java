package com.leoLW.javasestudy.day08.ObjectOriented.Homework;

public class Animal {
    private String name;

    public void move() {
        System.out.println(this + " is moving"); //值由Animal类创建的对象
    }

    public Animal() {}

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}
