package com.leoLW.javasestudy.day13.interfaceTest;

public interface InterDemo {
    default void fun1() {
        System.out.println("1...");
    }
    static void fun2() {
        System.out.println("2...");
    }
}
