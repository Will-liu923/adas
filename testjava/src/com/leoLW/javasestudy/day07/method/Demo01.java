package com.leoLW.javasestudy.day07.method;

public class Demo01 {

    public static int func(int num) {
        int result;
        if (num == 1) {
            result = 1;
        }else{
            result = num * func(num - 1);
        }
        return result;
    }

    public static void main(String[] args) {
        int result = func(3);
        System.out.println(result);

        func2(5);

        System.out.println("======================");
        func3();

        System.out.println("-----------------------");
        System.out.println(func4(5));
    }

    public static void func2(int num) {
        System.out.println(num);
        num --;
        if (num >= 1) {
            func2(num);
        }
    }

    static int a = 1;
    public static void func3() {
        System.out.println(a);
        a++;
        if (a <= 3) {
            func3();
        }
        a--;
        System.out.println(a);
    }

    public static int func4(int num) {
        if (num == 1) {
            return 1;
        } else {
            return num + func4(num - 1);
        }
    }
}
