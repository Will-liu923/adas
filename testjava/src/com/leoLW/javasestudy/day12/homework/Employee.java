package com.leoLW.javasestudy.day12.homework;

public class Employee {
    private String name;
    private int birthMonth;

    public double getSalary(int month) {
        if (month == birthMonth) {
            return 100;
        }
        return 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public void setBirthMonth(int birthMonth) {
        this.birthMonth = birthMonth;
    }

    public Employee(String name, int birthMonth) {
        this.name = name;
        this.birthMonth = birthMonth;
    }

    public Employee() {
    }
}
