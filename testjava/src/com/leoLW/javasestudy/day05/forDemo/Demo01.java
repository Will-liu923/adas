package com.leoLW.javasestudy.day05.forDemo;

public class Demo01 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.println("i = " + i);
        }

        for (int j = 0; j < 5; j++)
            System.out.println(j);

        int a;
        for (a=0; a<5; a++) {
            System.out.println(a);
        }
        System.out.println(a);

        for (int i = 10,j = 1;i > j; i--,j++) {
            System.out.println("i:" + i + "j:" + j);
        }

        int i = 10;
        while(i > 0) {
            System.out.println(i);
            i--;
        }

        int b = 1;
        while((b++) < 10) { //先判断b是否<10，再执行++
            System.out.println(b); // 2~10
        }

        int c = 1;
        do {
            System.out.println(c + ".");
            c++;
        }while (c <= 10); //1~10

        for (int j = 0; j < 5; j++) {
            for (int k = 0; k < 5; k++) {
                System.out.print("😁");
            }
            System.out.println();
        }
    }
}
