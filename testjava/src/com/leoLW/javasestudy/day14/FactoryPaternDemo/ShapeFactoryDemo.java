package com.leoLW.javasestudy.day14.FactoryPaternDemo;

public class ShapeFactoryDemo {
    public static void main(String[] args) {
        ShapeFactory sf = new ShapeFactory();
        Shape circle = sf.getShape("CIRCLE");
        circle.draw();
    }
}
