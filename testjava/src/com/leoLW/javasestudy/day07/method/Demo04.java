package com.leoLW.javasestudy.day07.method;

/*
overload
 */

public class Demo04 {

    //方法1
    public static void sum(int a,int b) {

    }

    //方法2
    public static void sum(long a,long b) {

    }

    //方法3
    public static void sum(int a) {

    }

    //方法4
    public static int sum1(int a,int b) { //和方法1不构成重载
        return a + b;
    }
}
