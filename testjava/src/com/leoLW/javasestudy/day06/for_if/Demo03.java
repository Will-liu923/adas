package com.leoLW.javasestudy.day06.for_if;

import java.util.Random;

public class Demo03 {
    public static void main(String[] args) {
        Random random = new Random();
        int i = random.nextInt(10);//生成随机数[0,9]
        System.out.println(i);
        //生成1-10的随机数
        int j = random.nextInt(10)+1; //[1,10]
        System.out.println(j);
    }
}
