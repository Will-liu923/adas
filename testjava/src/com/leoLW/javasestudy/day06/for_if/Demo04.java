package com.leoLW.javasestudy.day06.for_if;

import java.util.Scanner;

public class Demo04 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a + "," + b);

        Scanner scanner = new Scanner(System.in);
        System.out.print("[系统]请输入：");
        int num = scanner.nextInt();
        if (num == 0){
            System.out.print("0");
        }else if (num > 0) {
            System.out.println("正数");
        }else{
            System.out.println("负数");
        }
    }
}
