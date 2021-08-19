package com.leoLW.javasestudy.day08.ObjectOriented;

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account("Jane Smith","<1000>",2000,0.0123);
        account.deposit(100,0.0123,0.25);
        account.withdraw(960);
        account.hold(2/12,0.0123);
        account.withdraw(2000);
    }
}
