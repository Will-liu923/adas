package com.leoLW.javasestudy.day08.ObjectOriented;

public class Wife {
    String ID;
    String name;
    String birth;
    Husband husband;

    public Wife() {}

    public Wife(Husband husband) {
        this.husband = husband;
    }

    public Wife(String ID, String name, String birth) {
        this.ID = ID;
        this.name = name;
        this.birth = birth;
    }

    public Wife(String ID, String name, String birth, Husband husband) {
        this.ID = ID;
        this.name = name;
        this.birth = birth;
        this.husband = husband;
    }

    @Override
    public String toString() {
        return "Wife{" +
                "ID='" + ID + '\'' +
                ", name='" + name + '\'' +
                ", birth='" + birth + '\'' +
                ", husband=" + husband.name +
                '}';
    }
}
