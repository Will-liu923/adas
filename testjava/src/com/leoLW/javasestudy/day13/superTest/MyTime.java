package com.leoLW.javasestudy.day13.superTest;

import java.util.Objects;

public class MyTime {

    int year;
    int month;
    int day;
    String format;

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        MyTime myTime = (MyTime) obj;
        return year == myTime.year && month == myTime.month && day == myTime.day && Objects.equals(format, myTime.format);
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, month, day, format);
    }
}
