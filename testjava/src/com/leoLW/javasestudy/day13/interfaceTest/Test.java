package com.leoLW.javasestudy.day13.interfaceTest;

import java.util.Arrays;
import java.util.Objects;

public class Test implements InterDemo {
    public static void main(String[] args) {
        InterDemo.fun2();
        Test test = new Test();
        test.fun1();

        InterDemo interDemo = new InterDemo() {
            @Override
            public void fun1() {
                InterDemo.super.fun1();
            }
        };

    }
}
