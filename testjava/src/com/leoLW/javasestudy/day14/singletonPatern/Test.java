package com.leoLW.javasestudy.day14.singletonPatern;

public class Test {
    public static void main(String[] args) {
        SingletonHungry sh1 = SingletonHungry.getInstance();
        SingletonHungry sh2 = SingletonHungry.getInstance();
        System.out.println(sh1 == sh2);//true
        sh1.fun();

        SingletonLazy sl1 = SingletonLazy.getInstance();
        SingletonLazy sl2 = SingletonLazy.getInstance();
        System.out.println(sl1 == sl2);
        sl1.fun();

        SingletonLazyDCL sld1 = SingletonLazyDCL.getInstance();
        SingletonLazyDCL sld2 = SingletonLazyDCL.getInstance();
        System.out.println(sld1 == sld2);
    }
}
