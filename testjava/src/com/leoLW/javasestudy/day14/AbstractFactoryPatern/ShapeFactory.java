package com.leoLW.javasestudy.day14.AbstractFactoryPatern;


public class ShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shape) {
        if (null == shape || shape.equals("")) return null;
        if (shape.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }else if (shape.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }else if (shape.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        }else {
            return null;
        }
    }

    @Override
    public Color getColor(String color) {
        return null;
    }
}
