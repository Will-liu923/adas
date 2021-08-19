package com.leoLW.javasestudy.day09.Class_test;

public class Construction {

    private String name;
    private String age;

    public Construction() {}

    public Construction(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
