package com.leoLW.javasestudy.day12.homework;

public class BasePlusSalesEmployee extends SalesEmployee {

    private double baseSalary;

    public BasePlusSalesEmployee(String name, int birthMonth, double monthlySales, double commissionRate, double baseSalary) {
        super(name, birthMonth, monthlySales, commissionRate);
        this.baseSalary = baseSalary;
    }

    public BasePlusSalesEmployee(double monthlySales, double commissionRate, double baseSalary) {
        super(monthlySales, commissionRate);
        this.baseSalary = baseSalary;
    }

    public BasePlusSalesEmployee(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public BasePlusSalesEmployee() {}

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
}
