package com.leoLW.javasestudy.day10;

public class Mail {

    static {
        System.out.println("静态代码块");
    }

    public static void main(String[] args) {

        Demo demo = new Demo();
        Demo.age = 18;
        System.out.println(demo.age); //不推荐使用对象调用静态变量
    }
}
