package com.leoLW.javasestudy.day14.AbstractFactoryPatern;

public class ColorFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shape) {
        return null;
    }

    @Override
    public Color getColor(String color) {
        if (color == null || color.equals(""))return null;
        if (color.equalsIgnoreCase("RED")) {
            return new Red();
        } else if(color.equalsIgnoreCase("GREEN")) {
            return new Green();
        } else if (color.equalsIgnoreCase("YELLOW")) {
            return  new Yellow();
        }else {
            return null;
        }
    }
}
