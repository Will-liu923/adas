package com.leoLW.javasestudy.day11;

public class Cat extends Animal {

    private String size;

    public void makeSound() {
        System.out.println("mew mew ...");
    }

    public Cat() {
        System.out.println("子类无参构造");
    }

    public Cat(String name, boolean sex, String color, String size) {
        super(name, sex, color);
        this.size = size;
    }

    static {
        System.out.println("son static");
    }

    {
        System.out.println("son not static");
    }
}
