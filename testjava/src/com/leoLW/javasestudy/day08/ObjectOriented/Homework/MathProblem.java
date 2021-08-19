package com.leoLW.javasestudy.day08.ObjectOriented.Homework;

public class MathProblem {

    /*
    已知有一个数列：f(0)=1,f(1)=4,f(n+2)=2*f(n+1)+f(n)，其中n是大于0的整数，求f(10)的值
     */

    public static int fn(int num) {
        if (num == 0) {
            return 1;
        }
        if (num == 1) {
            return 4;
        }else {
            return 2 * fn(num - 1) + fn(num - 2); //已知更小的数，递归时需要将递归比自身小的数字
        }
    }

    /*
    已知有一个数列：f(20)=1,f(21)=4,f(n+2)=2*f(n+1)+f(n)，其中n是大于0的整数，求f(10)的值
     */
    //已知更大的数，递归时就要递归比自己大的数
    public static int fx(int n) {
        if (n == 21) {
            return 4;
        }
        if (n == 20) {
            return 1;
        } else {
            return fx(n + 2) - 2 * fx(n + 1);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(fn(i));
        }

        System.out.println("------------------------------------");
        for (int i = 21; i >= 0; i--) {
            System.out.println(fx(i));
        }
    }
}
