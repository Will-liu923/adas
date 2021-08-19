package com.leoLW.javasestudy.day08.ObjectOriented;

public class Account {
    private String name;
    private String ID;
    private double balance;
    private double annualInterestRate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public void withdraw(double amount) {
        if (balance < amount) {
            System.out.println("[三体银行]账户" + getID() + "余额不足,取款失败" + "余额为" + getBalance());
        } else {
            balance = this.balance - amount;
            System.out.println("[三体银行]用户" + getName() + "通过账户" + getID() + "取款" + amount + "成功,余额为" + balance);
        }
    }

    public double deposit(double amount, double annualInterestRate, double year) {
        System.out.println("[三体银行]用户"+ getName() + "通过账户" + getID() + "存款" + amount + "成功");
        balance += amount;
        balance = balance * annualInterestRate * year + balance;
        System.out.println("[三体银行]余额为" + balance);
        return balance;
    }

    public Account() {}

    public Account(String name) {
        this.name = name;
    }

    public Account(String name, String ID) {
        this(name); //this可以出现在构造方法的第一行（也只能出现在第一行），用来调用其他的构造方法，实现代码的复用性
        this.ID = ID;
    }

    public Account(String name, String ID, double balance, double annualInterestRate) {
        this.name = name;
        this.ID = ID;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public double hold(double year, double annualInterestRate) {
        this.balance = getBalance() + getBalance() * year * annualInterestRate;
        return balance;
    }
}
