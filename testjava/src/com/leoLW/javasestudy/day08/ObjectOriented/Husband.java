package com.leoLW.javasestudy.day08.ObjectOriented;

public class Husband {

    String ID;
    String name;
    String birthday;
    Wife wife;

    public Husband(){}

    public Husband(Wife wife) {
        this.wife = wife;
    }

    public Husband(String ID, String name, String birthday, Wife wife) {
        this.ID = ID;
        this.name = name;
        this.birthday = birthday;
        this.wife = wife;
    }

    @Override
    public String toString() {
        return "Husband{" +
                "ID='" + ID + '\'' +
                ", name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", wife=" + wife.name +
                '}';
    }
}
