package com.leoLW.javasestudy.day06.for_if;

public class Demo07 {
    public static void main(String[] args) {

        for (int i = 1; i <= 4; i++) {
            int m = 1;
            for (int j = 1; j <=4; j++) {
                if (j == 1) {
                    System.out.print(i + "\t");
                }else{
                    m *= 10;
                    System.out.print(i * m + "\t");
                }
            }
            System.out.println();
        }

        System.out.println("===================");

        int m;
        for (int i = 1; i <= 4 ; i++) {
            m = i;
            for (int j = 1; j <= 4 ; j++) {
                System.out.print(m + "\t");
                m *= 10;
            }
            System.out.println();
        }
    }
}
