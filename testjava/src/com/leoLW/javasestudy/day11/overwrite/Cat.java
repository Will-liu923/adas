package com.leoLW.javasestudy.day11.overwrite;

public class Cat extends Animal {

    @Override
    public void move() {
        System.out.println("running...");
    }


    public void catchMouse() {
        System.out.println("cat is catching mouse");
    }
}
