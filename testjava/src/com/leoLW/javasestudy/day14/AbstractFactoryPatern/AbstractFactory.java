package com.leoLW.javasestudy.day14.AbstractFactoryPatern;

public abstract class AbstractFactory {
    public abstract Shape getShape(String shape);
    public abstract Color getColor(String color);
}
