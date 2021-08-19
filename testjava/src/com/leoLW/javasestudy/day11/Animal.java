package com.leoLW.javasestudy.day11;

public class Animal {

    private String name;
    private boolean sex;
    private String color;

    public void move() {}
    private void eat() {
        System.out.println("private eat()...");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal(String name, boolean sex, String color) {
        System.out.println("父类有参构造");
        this.name = name;
        this.sex = sex;
        this.color = color;
    }

    public Animal() {
        System.out.println("父类无参构造");
    }

    public static void run() {
        System.out.println("静态方法");
    }

    static {
        System.out.println("father static");
    }

    {
        System.out.println("father not static");
    }
}
