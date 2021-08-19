package com.leoLW.javasestudy.day10;

public class Test {
    private int num;
    private String name;

    public Test() {
        this(18,"Jack");
    }

    public Test(int num) {//此处的num是局部变量
        this.num = num; //让局部变量的num赋值给成员变量的num
    }

    public Test(int num, String name) {
        this(num);
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void detail() {
        System.out.println("num = " + this.num);
    }
}
