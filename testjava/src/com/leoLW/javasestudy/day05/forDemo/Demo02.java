package com.leoLW.javasestudy.day05.forDemo;

import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {

        int userName = 666;
        int passWord = 888;
        Scanner scanner = new Scanner(System.in);
        System.out.print("[系统]请输入用户名：");
        int username = scanner.nextInt();
        if (userName == username) {
            System.out.print("[系统]请输入密码：");
            int password = scanner.nextInt();
            if (passWord == password) {
                System.out.println("[系统]用户" + username + "，欢迎使用核导弹系统！");
            }else{
                System.out.println("[系统]密码错误！");
            }
        }else{
            System.out.println("[系统]用户名错误！");
        }
    }
}
