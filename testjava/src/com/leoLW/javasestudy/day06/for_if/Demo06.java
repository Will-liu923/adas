package com.leoLW.javasestudy.day06.for_if;

public class Demo06 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }
    }

    public void func(){
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            if (i == 5) {
                //return;
                Runtime.getRuntime().exit(0);
            }
        }
    }

    public void function(){
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            if (i == 5) {
                System.exit(0);
            }
        }
    }
}
