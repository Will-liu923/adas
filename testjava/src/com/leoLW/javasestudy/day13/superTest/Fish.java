package com.leoLW.javasestudy.day13.superTest;

public class Fish {

    private String name;
    private int size;
    private String color;

    public Fish(String name, int size, String color) {
        this.name = name;
        this.size = size;
        this.color = color;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (null == obj || this.getClass() != obj.getClass()) return false;
        Fish fish = (Fish) obj;
        return this.name.equals(fish.name) && this.size == fish.size && this.color.equals(fish.color);
    }

    public static void main(String[] args) {

        Fish f1 = new Fish("f1",1,"red");
        Fish f2 = new Fish("f1",1,"red");
        Fish f3 = new Fish("f1",1,"redBlue");
        System.out.println(f1.equals(f2));
        System.out.println(f1.equals(f3));

    }
}
