package com.leoLW.javasestudy.day06.for_if;

public class Demo01 {
    public static void main(String[] args) {

        int count = 0;
        for (int i = 1; i <= 100 ; i++) {
            if (i % 5 == 0) {
                count++;
                System.out.print(i + "\t");
                if (count % 4 == 0) {
                    System.out.println();
                }
            }
        }
        System.out.println("\n共：" + count + "个");
    }
}
