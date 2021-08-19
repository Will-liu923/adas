package com.leoLW.javasestudy.day13.objectTest;

import java.util.Objects;

public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        int i = test.hashCode();
        System.out.println(i);
        System.out.println(test.hashCode());
        System.out.println(test.toString());

        test = null;
        System.out.println(Objects.hashCode(test)); //0

        test = new Test();
        System.out.println(test.getClass().getName());
        System.out.println(test.getClass());
    }
}
