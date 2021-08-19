package com.leoLW.javasestudy.day11.overwrite;

public class AnimalTest {
    public static void main(String[] args) {

        Animal dog = new Dog();
        if (dog instanceof Cat) {
            Cat cat = (Cat) dog;
            cat.catchMouse();
        } else {
            System.out.println("类型不匹配");
        }
    }
}
