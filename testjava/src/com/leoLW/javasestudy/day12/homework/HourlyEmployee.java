package com.leoLW.javasestudy.day12.homework;

public class HourlyEmployee extends Employee {
    private double hour;
    private double hourSalary;

    public double getHour() {
        return hour;
    }

    public void setHour(double hour) {
        this.hour = hour;
    }

    public double getHourSalary() {
        return hourSalary;
    }

    public void setHourSalary(double hourSalary) {
        this.hourSalary = hourSalary;
    }

    public HourlyEmployee(String name, int birthMonth, double hour, double hourSalary) {
        super(name, birthMonth);
        this.hour = hour;
        this.hourSalary = hourSalary;
    }

    public HourlyEmployee(double hour, double hourSalary) {
        this.hour = hour;
        this.hourSalary = hourSalary;
    }

    public HourlyEmployee(String name, int birthMonth) {
        super(name, birthMonth);
    }

    public HourlyEmployee() {
    }
}
