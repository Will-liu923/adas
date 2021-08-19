package com.leoLW.javasestudy.day06.for_if;

import java.util.Random;
import java.util.Scanner;

public class Demo09 {
    public static void main(String[] args) {
        int result = multiply(9);
        System.out.println(result);

        System.out.println(multiplyB(9));
        int multiplySum = getMultiplySum(10);
        System.out.println(multiplySum);

        paint();
        multiplyTable();

        guessNum();
        paintB(5);
        getJumpTimes(5);
    }

    public static int multiply(int num) {
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    public static int multiplyB(int num) {
        int result;
        if (num == 1) {
            result = 1;
        }else {
            result = num * multiplyB(num - 1);
        }
        return result;
    }

    public static void paint() {
        /*    *
         *   ***
         *  *****
         * *******
         */
        for (int i = 0; i < 4; i++) { //图形4行
            for (int j = 0; j < 3 - i; j++) { //决定每一行的空格数量。观察可知，4行的图形第一行空格数为3，依次减少
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) { //决定靠近空格的*数量
                System.out.print("*");
            }
            for (int j = 0; j <= i - 1; j++) { //另一侧的*数量
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void paintB(int num){ //画图的第二种方法，思维不要局限
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void multiplyTable() {
        for (int i = 1; i <= 9; i++) { //9行
            for (int j = 1; j <= i; j++) { //每一行的列数和行数相等
                System.out.print(j + "*" + i + "=" + j*i + "\t");
            }
            System.out.println();
        }
    }

    public static void guessNum() {
        final int defaultNum = new Random().nextInt(100) + 1;//[1~100]

        Scanner scanner = new Scanner(System.in);
        System.out.println("[系统]欢迎进入猜数字游戏，请输入你的数字");
        while(true) {
            int usersNum = scanner.nextInt();
            if (defaultNum == usersNum) {
                System.out.println("[系统]恭喜，你赢得了游戏，奖励代码一套");
                return;
            }else if (defaultNum > usersNum) {
                System.out.println("[系统]你的数字小了，请继续猜");
            }else{
                System.out.println("[系统]你的数字大了，请继续猜");
            }
        }
    }

    public static int getMultiplySum(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            int result = multiplyB(i);
            sum += result;
        }
        return sum;
    }

    public static void getJumpTimes(double height) {
        boolean flag = true;
        int count = 0;
        while(flag) {
            height *= 0.3;
            count ++;
            if (height <= 0.1) {
                flag = false;
            }
        }
        System.out.println("次数 ：" + count);
    }
}
/*
这是一个猜数字的游戏，使用while循环，必须猜中游戏才会结束！
 */