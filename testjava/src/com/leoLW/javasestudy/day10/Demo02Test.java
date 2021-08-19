package com.leoLW.javasestudy.day10;

public class Demo02Test {
    public static void main(String[] args) {
        new Demo02();
        new Demo02();
    }

    static {
        fun2();
    }

    public static void fun1(){
        fun2();
    }
    public static void fun2(){
    }
}
