package com.leoLW.javasestudy.day12.homework;

public class SalariedEmployee extends Employee {

    private double monthSalary;

    public double getMonthSalary() {
        return monthSalary;
    }

    public void setMonthSalary(double monthSalary) {
        this.monthSalary = monthSalary;
    }

    public SalariedEmployee(String name, int birthMonth, double monthSalary) {
        super(name, birthMonth);
        this.monthSalary = monthSalary;
    }

    public SalariedEmployee(double monthSalary) {
        this.monthSalary = monthSalary;
    }

    public SalariedEmployee(String name, int birthMonth) {
        super(name, birthMonth);
    }

    public SalariedEmployee() {
    }
}
