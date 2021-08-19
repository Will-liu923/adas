package com.leoLW.javasestudy.day14.inner;

public class Test2 {

    public static void main(String[] args) {

        Demo.Inner di = new Demo().new Inner();
        di.fun();

        Demo.StaticInner ds = new Demo.StaticInner();
        ds.funStatic();
    }
}
