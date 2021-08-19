package com.leoLW.javasestudy.day03;

public class Test2 {
    public static void main(String[] args) {
        drawWithStar(6);
        multiplication();
    }

    public static void drawWithStar(int starLine) {
        for (int i = 1; i <= starLine; i++) {
            for (int j = 0; j < starLine - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i ; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void multiplication() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + j*i + "\t");
            }
            System.out.println();
        }
    }
}
