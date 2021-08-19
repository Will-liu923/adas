package com.leoLW.javasestudy.day14.AbstractFactoryPatern;

public class AbstractFactoryDemo {
    public static void main(String[] args) {

        ShapeFactory sf = new ShapeFactory();
        Shape s1 = sf.getShape("CIRCLE");
        s1.draw();

        ColorFactory cf = new ColorFactory();
        Color c1 = cf.getColor("RED");
        c1.fill();
    }
}
