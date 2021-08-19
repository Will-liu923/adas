package com.leoLW.javasestudy.day14.inner;

public class Demo {

    String proper;
    int age;

    public void func() {

    }

    public void fx() {

        class JBInner {

        }
    }

    public class Inner {
        String inner;
        int num;
        public void fun() {
            System.out.println(Demo.this.proper);
            func();
            System.out.println("实例内部类");
        }
    }

    public static class StaticInner {

        public void funStatic() {
            System.out.println("静态内部类");
        }
    }
}
