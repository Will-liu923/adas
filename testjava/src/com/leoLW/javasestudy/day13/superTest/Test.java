package com.leoLW.javasestudy.day13.superTest;

import java.util.Objects;

public class Test {

    private int year;
    private int month;
    private int day;

/*    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        Test test = (Test) obj;
        return this.year == test.year && this.month == test.month && this.day == test.day;
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Test test = (Test) o;
        return year == test.year && month == test.month && day == test.day;
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, month, day);
    }
}
