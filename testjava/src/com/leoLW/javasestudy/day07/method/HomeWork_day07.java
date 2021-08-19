package com.leoLW.javasestudy.day07.method;

import java.util.Scanner;

public class HomeWork_day07 {
    public static void main(String[] args) {

        System.out.println(multiplyToN(0));

        login();

       /* System.out.println(getMaxNum(1,2));
        System.out.println(getMaxNum(3,2));
        System.out.println(getMaxNum(3,3));
        System.out.println(getMaxNum(3,2,5));
        System.out.println(getMaxNum(4,2,4));
        System.out.println(getMaxNum(4,2,4,6));
        System.out.println(getMaxNum(4,7,4,6));*/
    }

    //两数之和
    public static int sum(int a,int b) {
        return a + b;
    }

    //两数之差
    public static int decries(int a, int b) {
        return a - b;
    }
    //两数之除
    public static int divide(int a, int b) {
        return a - b;
    }

    //乘
    public static int multiply(int a, int b) {
        return a * b;
    }

    //计算n的阶乘
    public static int multiplyToN(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        } else {
            return n * multiplyToN(n - 1);
        }
    }

    //登入返回结果程序
    public static void loginResult(boolean flag) {
        if (flag) {
            System.out.println("[系统]欢迎登入三体世界");
        }else{
            System.out.println("[系统]用户名或者密码错误");
        }
    }

    //登入程序
    public static boolean login() {
        boolean flag;
        Scanner scanner = new Scanner(System.in);
        System.out.println("[系统]欢迎使用三体世界");
        System.out.print("[系统]请输入用户名:");
        String username = scanner.next();
        if ("789".equals(username)) {
            System.out.print("[系统]请输入密码:");
            int password = scanner.nextInt();
            if (123 == password) {
                flag = true;
            } else {
                flag = false;
            }
        } else {
            System.out.print("[系统]请输入密码:");
            int password = scanner.nextInt();
            flag = false;
        }
        loginResult(flag);
        return flag;
    }

    //方法重载，返回最大的数，参数个数2,3,4
    public static int getMaxNum(int a, int b) {
        if (a >= b) {
            return a;
        }else {
            return b;
        }
    }

    public static int getMaxNum(int a, int b, int c) {
        /*int maxNum = getMaxNum(a,b);
        maxNum = getMaxNum(maxNum,c);
        return maxNum;*/
        return getMaxNum(getMaxNum(a,b),c);
    }

    public static int getMaxNum(int a, int b, int c, int d) {
        int maxNum = getMaxNum(a,b,c);
        maxNum = getMaxNum(maxNum,d);
        return maxNum;
    }
}
