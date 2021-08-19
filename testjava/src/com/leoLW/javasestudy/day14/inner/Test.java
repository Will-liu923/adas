package com.leoLW.javasestudy.day14.inner;

public class Test {
    public static void main(String[] args) {
        AbstractDemo ad = new AbstractDemo() {
            @Override
            public void fun1() {
                System.out.println("抽象类-匿名内部类");
            }
        }
        ;
        ad.fun1();

        InterDemo id = new InterDemo() {
            @Override
            public void fun2() {
                System.out.println("接口-匿名内部类");
            }
        }
        ;
        id.fun2();


        String s1 = null;
        String s2 ="";
        System.out.println(s2 == s1); //false
    }
}
