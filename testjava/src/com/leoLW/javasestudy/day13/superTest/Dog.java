package com.leoLW.javasestudy.day13.superTest;

public class Dog extends Animal {

    public Dog() {
        fun();
        System.out.println("子类无参。。。");
    }

    public Dog(String name) {
        super(name);
        System.out.println("子类有参。。。");
    }

    @Override
    public void fun() {
        super.fun();
        System.out.println("子类....");
    }

    public static void fn() {
    }
}
