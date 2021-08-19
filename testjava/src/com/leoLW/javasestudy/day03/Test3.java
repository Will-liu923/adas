package com.leoLW.javasestudy.day03;

public class Test3 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
        }
        //System.out.println(i);//编译报错：找不到符号，变量i----i只在循环内可用。

        int j = 0;
        for (; j < 10; j ++) {
            System.out.println("j = " + j);
        }
        System.out.println(j); //这样就可以再循环体外访问j了----因为j的作用域扩大了,不建议这么写
    }
}
