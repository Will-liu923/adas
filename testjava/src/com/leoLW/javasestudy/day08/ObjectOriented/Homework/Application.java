package com.leoLW.javasestudy.day08.ObjectOriented.Homework;

public class Application {

    public static void main(String[] args) {

        Animal animal = new Animal("coco");
        animal.move();

        Animal animal1 = new Fish("lili","red");
        animal1.move();

        Animal animal2 = new Cat("cici","XXL");
        animal2.move();
        Cat cat = (Cat)animal2; //多态，强制类型转换，调用子类特有的方法
        cat.makeSound();

        Master master = new Master("Jack",25);
        master.playWithPet(animal1);
        master.playWithPet(animal2);
        master.playWithPet(null);

        Dog dog = new Dog("Jack's Dog","woo woo 007");
        master.playWithPet(dog);
    }
}
