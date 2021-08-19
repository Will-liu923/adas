package com.leoLW.javasestudy.day12;

public class Test {
    public static void main(String[] args) {

        //创建对象的权力在工厂类
        Fruit fruit = FruitFactory.getBean();
        fruit.eat(); //如果调用子类独有的方法，则需要强制类型转换,同时使用instanceof判断
    }

}
