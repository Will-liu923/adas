package com.leoLW.javasestudy.day03;

public class Test6 {

    private int year;
    private int month;
    private int day;

    public Test6() {
        this(1970,1,1);
    }

    public Test6(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return this.getYear() + "-" + this.getMonth() + "-" + this.getDay();
    }
}
