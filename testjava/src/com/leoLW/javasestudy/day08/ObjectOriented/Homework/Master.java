package com.leoLW.javasestudy.day08.ObjectOriented.Homework;

public class Master {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Master() {}

    public Master(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void playWithPet(Animal animal) {
        if (null == animal) {
            System.out.println("你的宠物呢？？？");
        }
        if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            cat.makeSound();
        }else if (animal instanceof Fish) {
            Fish fish = (Fish) animal;
            fish.move();
        } else if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.play();
        }else {
            System.out.println("期待更多宠物");
        }
    }
}
