package com.leoLW.javasestudy.day03;

public class Test5 {
    public static void main(String[] args) {
        double result = Math.sqrt(4); //计算平方根，返回值类型为double
        System.out.println(result);
        result = Math.pow(2,3);//2^3
        System.out.println(result);
        result = Math.cos(Math.PI);//三角函数
        System.out.println(result);
        result = Math.round(2.6); //3.0---四舍五入
        System.out.println(result);

        System.out.println("Java\u2122");//Java™

        String str1 = "a";
        String str2 = "a";
        System.out.println(str1.equals(str2)); //true
        System.out.println(str1 == str2); //true 字符串常量池内存共享.

        int i = "hello".indexOf("o"); //返回指定str在原string中出现的位置，不存在返回-1
        System.out.println(i);

        String str3 = "Hello".replace("l","e");//将字符串中的l用e代替
        System.out.println(str3);

        String str4 = String.join("/","S","M","L","XL"); //用/来连接给定的字符串
        System.out.println(str4);

    }
}
