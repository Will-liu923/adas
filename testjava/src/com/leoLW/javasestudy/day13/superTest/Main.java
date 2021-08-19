package com.leoLW.javasestudy.day13.superTest;

import sun.misc.GC;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        Main main = new Main();
        main = null;

        System.gc();
        Runtime.getRuntime().gc(); //手动激活垃圾回收机制

        for (int i = 0; i < 10000; i++) {
            System.out.print("");
        }
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("回收垃圾");
    }
}
