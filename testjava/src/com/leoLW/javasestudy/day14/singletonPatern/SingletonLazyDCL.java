package com.leoLW.javasestudy.day14.singletonPatern;

//双检锁，双重校验锁 double checking lock
public class SingletonLazyDCL {
    //私有化构造函数
    private SingletonLazyDCL() {}
    //私有化唯一实例，不开辟空间
    private volatile static SingletonLazyDCL instance;
    //给定外部获取实例的方法
    public static SingletonLazyDCL getInstance(){
        if (instance == null) {
            synchronized (SingletonLazy.class) {
                if (instance == null) {
                    instance = new SingletonLazyDCL();
                }
            }
        }
        return instance;
    }
}
