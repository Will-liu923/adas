package com.leoLW.javasestudy.day04.IfDemo;

public class Demo01 {
    public static void main(String[] args) {
        double score = 80.0;
        if (score >= 90) {
            System.out.println("游乐园");
        }

        //if语句可以省略{}，但是后面只能接一个代码语句(不可以声明变量)，以分号结束。
        if (score < 90) System.out.println("加油");

        if (score > 60);//编译通过，只有条件表达式，但是没有if执行体

        if (score >= 80) { //条件表达式成立
            System.out.println("吃鱼");
        } else { //条件表达式不成立
            System.out.println("抓鱼");
        }
        //不存在两个执行体都执行，也不存在两个表达式都不成立

        //省略{}，if和else后面只能接一句代码语句（不能声明变量），以分号结尾
        if (score >= 80) System.out.println("吃鱼");
        else System.out.println("抓鱼");


        double salary = 100;
        if (salary > 0 && salary <= 10000) {
            System.out.println("穷人");
        }else if (salary <= 20000) {
            System.out.println("普通人");
        }else if (salary <= 50000) {
            System.out.println("有点小钱");
        }else if (salary <= 100000) {
            System.out.println("土豪");
        }else {
            System.out.println("富豪");
        }

        int day = 5;
        switch (day) {
            case 1:
                System.out.println("第一天");
                break;
            case 2:
                System.out.println("第二天");
                break;
            case 3:
                System.out.println("第三天");
                break;
            default:
                System.out.println("假期结束了");
        }
        //关键字：switch switch开关语句
        //case 一种情况
        //break 结束，间断 防止case穿透
        //default 默认，以上case不成立，则执行default

        //注意问题：1、{}不能省略
        // 2、case穿透（没有break） a、当case成立的后面没有break，就会一直穿透，直到break或者结束
        //b、default放在前面，不带break也会产生穿透
        //c、只需要在所有的语句中都加上brak就不会发生case穿透问题

        //case并列问题： 12 1 2 冬季
        //              3 4 5春天
        //              6 7 8夏季
        //              9 10 11秋季
        int month = 8;
        switch (month) {
            case 12: case 1: case 2:
                System.out.println("冬天");
                break;
            case 3: case 4: case 5:
                System.out.println("春天");
                break;
            case 6: case 7: case 8:
                System.out.println("夏天");
                break;
            case 9: case 10: case 11:
                System.out.println("秋天");
                break;
            default:
                System.out.println("月份错误");
        }

        //switch 在不同的JDK版本支持的数据类型不同

        char i = '女';
        int j = i;
        System.out.println(j);
        System.out.println(!(2>3));//true
        System.out.println(true ^ true); //false

        //格式化打印输出
        System.out.printf("%d",j);

        System.out.println("\n"); //相当于enter键
        System.out.println("\\");

        int m = -1;
        if (m <= 0) if (m == 0) m = 0; else m = -2; //if语句嵌套if-else语句，省略{}，但是这样代码可读性差
        System.out.println(m);
    }
}
