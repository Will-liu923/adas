package com.leoLW.javasestudy.day06.for_if;

public class Demo05 {
    public static void main(String[] args) {
        double pay = getPay(0);
        System.out.println(pay);
    }

    public static double getPay(double miles) {
        double pay = 0;
        if (miles <= 0) {
            return pay;
        }
        if (miles <= 3) {
            pay = 8;
        }else if (miles <= 5) {
            pay = 8 + (miles - 3) * 1.2;
        }else{
            pay = 8 + 2.4 + (miles - 5) * 1.5;
        }
        return pay;
    }
}
