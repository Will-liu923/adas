package com.leoLW.javasestudy.day12.homework;

public class SalesEmployee extends Employee {
    private double monthlySales;
    private double commissionRate;

    public SalesEmployee(String name, int birthMonth, double monthlySales, double commissionRate) {
        super(name, birthMonth);
        this.monthlySales = monthlySales;
        this.commissionRate = commissionRate;
    }

    public SalesEmployee(double monthlySales, double commissionRate) {
        this.monthlySales = monthlySales;
        this.commissionRate = commissionRate;
    }

    public SalesEmployee() {}

    public double getMonthlySales() {
        return monthlySales;
    }

    public void setMonthlySales(double monthlySales) {
        this.monthlySales = monthlySales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }
}
