package com.leoLW.javasestudy.day08.ObjectOriented;

public class MobilePhone {
    double width;
    double height;
    double length;
    String color;

    public void call() {
        System.out.println("call...");
    }

    public void sendMassage() {
        System.out.println(">>>>message<<<<");
    }

    @Override
    public String toString() {
        return "手机【" +
                "宽=" + width +
                ", 高=" + height +
                ", 长=" + length +
                ", 颜色=" + color +
                "】";
    }
}
