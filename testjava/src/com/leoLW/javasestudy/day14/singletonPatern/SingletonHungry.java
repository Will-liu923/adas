package com.leoLW.javasestudy.day14.singletonPatern;

public class SingletonHungry {

    //私有化构造函数
    private SingletonHungry() {}
    //私有话创建唯一实例
    private static final SingletonHungry sh = new SingletonHungry();
    //给外部提供获取实例的方法
    public static SingletonHungry getInstance() {
        return sh;
    }

    public void fun() {
        System.out.println("Hungry singleton");
    }
}
