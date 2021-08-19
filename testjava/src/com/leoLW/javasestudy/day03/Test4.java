package com.leoLW.javasestudy.day03;

import java.util.Arrays;
import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        int[] result = numExchange(1,2);
        System.out.println(Arrays.toString(result));

        //System.out.println("你的年龄是：" + getAge());

        System.out.println(getBillForTaxi(6));
        //isDNum();

        numTable(4,3);

        System.out.println(multiply(10));

        System.out.println(jumpTime(5));
    }

    public static int[] numExchange(int a, int b) {
        int[] arr = {a,b};
        int temp = 0;
        temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
        return arr;
    }

    public static int getAge() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入年龄：");
        int age = scanner.nextInt();
        return age;
    }

    public static double getBillForTaxi(int mile) {
        double count = 0;
        if (mile <= 3) {
            count += 8;
        }else if (3 < mile && mile <= 5) {
            count = (mile - 3) * 1.2 + 8;
        }else {
            count += (mile - 5) * 1.5 + 8 + 2 * 1.2;
        }
        return count;
    }

    public static void isDNum() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入整数字：");
        int number = scanner.nextInt();
        if (number >= 0) {
            if (number % 2 == 0){
                System.out.println(number + "是一个正偶数");
            }else {
                System.out.println(number + "是一个正奇数");
            }
        } else {
            if (number % 2 == 0) {
                System.out.println(number + "是一个负偶数");
            }else {
                System.out.println(number + "是一个负奇数");
            }
        }
    }
    
    public static void numTable(int a, int b) {
        for (int i = 1; i <= a; i ++) {
            int l = 1;
            int m = 0;
            for (int j = i; j <= b*10*l; j *= 10) {
                l *= 10;
                if (j == i) {
                    System.out.print(i + " ");
                    m ++;
                } else {
                    System.out.print(j + " ");
                    m ++;
                }
                if (m > b) {
                    break;
                }
            }
            System.out.println();
        }
    }

    public static int multiply(int num) {
        int result = 0;
        if (num == 1) {
            result = 1;
        }else {
            result = num * multiply(num - 1);
        }
        return result;
    }

    public static int jumpTime(double miters) {
        int times = 0;
        for (double i = miters; i > 0; i *= 0.3) {

            if (i <= 0.1) {
                break;
            }
            times ++;
        }
        return times;
    }
}
