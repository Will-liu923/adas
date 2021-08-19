package com.leoLW.javasestudy.day12;

public class FruitFactory {

    //水果工厂类，生产水果对象
    public static Fruit getBean() {
        //方法体中可以根据传入参数定义返回对象

        return new Apple(); //里氏代换原则--父类可以出现的地方，子类一定可以出现
    }
}
