package com.leoLW.javasestudy.day08.ObjectOriented;

public class Application {

    public static void main(String[] args) {

        MobilePhone mobilePhone = new MobilePhone();
        mobilePhone.width = 6.8;
        mobilePhone.height = 0.75;
        mobilePhone.length = 15.0;
        mobilePhone.color = "deep sky blue";  //String不属于基本数据类型，因此，前面的变量是一个引用，不是直接保存字符串，而是指向了方法去的字符串常量池
        System.out.println(mobilePhone);
        mobilePhone.call();
        mobilePhone.sendMassage();

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");

        Wife wife = new Wife("111", "Rose", "19951115");
        Husband husband = new Husband("110", "Jack", "19950923", wife);
        wife.husband = husband; //若注释这一行，则空指针报错

        System.out.println(husband.name + "的妻子叫" + husband.wife.name);
        System.out.println(wife.name + "的丈夫叫" + wife.husband.name);

        System.out.println(husband);
        System.out.println(wife);
    }
}
