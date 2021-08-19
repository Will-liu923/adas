package com.leoLW.javasestudy.day13.superTest;

public class Animal {

    private String name;

    public Animal() {

        System.out.println("父类无参。。。。");
    }

    public Animal(String name) {
        this.name = name;
        System.out.println("父类有参。。。。");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void fun() {
        System.out.println("父类....");
    }
}
