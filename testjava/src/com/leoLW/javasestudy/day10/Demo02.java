package com.leoLW.javasestudy.day10;

public class Demo02 {
    {
        System.out.println("非静态");
    }

    static {
        System.out.println("静态");
    }

    public Demo02() {
        System.out.println("无参构造");
    }
}
