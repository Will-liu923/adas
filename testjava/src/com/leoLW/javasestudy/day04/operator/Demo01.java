package com.leoLW.javasestudy.day04.operator;

public class Demo01 {
    public static void main(String[] args) {

        //+ 三种使用方法
        //1.运算
        int a = 1;
        int b = 2;
        int c = a + b;

        //2、+ 作为正负的正 ， - 同理
        int d = +5;

        //3、作为拼接  字符换类型和其他类型拼接，结果一定是字符串类型
        int age = 18;
        String str = "年龄 :" + age;

        //- 两种使用方法
        //1、运算
        //2、作为正负的负
        int e = -1;

        //* 乘法

        // / 除法

        // % 取余

        // ++ 自增1
        int f = 5;
        System.out.println(f++); //5--先其他操作，后自加1
        System.out.println(f); //6
        System.out.println(++f);//7 --先自加1，后其他操作
        System.out.println(f);//7

        int x = 5;
        x = x++;
        x = x++;
        x = x++;
        x = x++;
        System.out.println(x); //5

        int y = 5;
        y = ++y;
        System.out.println(y); //6

        int p = 2;
        int q = 3;
        int w = p+ ++q;

        int l = 2;
        int i = 3;
        int m = l++ +i;

        int u = 2;
        int v = 3;
        int n = u+++v; //u++优先级高
        System.out.println("w:" + w);//6
        System.out.println("m:" + m);//5
        System.out.println("n:" + n);//5

        // --自减 运算方式于++同理
    }
}
