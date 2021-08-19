package com.leoLW.javasestudy.day03;

public class Test61 extends Test6 {
    private int seconds;

    public Test61() {}
    public Test61(int seconds){
        this.seconds = seconds;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    @Override
    public String toString() {
        return this.getYear() + "," + this.getMonth() + "," + this.getDay() + "," + this.getSeconds();
    }
}
