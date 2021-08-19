package com.leoLW.javasestudy.day14.singletonPatern;

public class SingletonLazy {
    //私有化构造函数
    private SingletonLazy() {}
    //私有化一个实例对象，但暂时不在堆中开辟空间
    private static SingletonLazy sl;
    //提供获取实例化的方法
    public static SingletonLazy getInstance() {
        if (sl == null) {
            sl = new SingletonLazy();
        }
        return sl;
    }

    public void fun() {
        System.out.println("Lazy singleton");
    }
}
