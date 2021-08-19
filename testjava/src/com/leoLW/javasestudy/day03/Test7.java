package com.leoLW.javasestudy.day03;

public class Test7 {
    public static void main(String[] args) {
        Test6 test6 = new Test6(1970,1,1);
        System.out.println(test6.getYear() + "-" + test6.getMonth() + "-" + test6.getDay());

        Test6 test61 = new Test6();
        test61.setDay(1);
        test61.setMonth(1);
        test61.setYear(1970);
        System.out.println(test61.getYear()+"," + test61.getMonth()+"," + test61.getDay());

        Test6 test62 = new Test6();
        System.out.println(test62.getYear()+"-"+test62.getDay()+"-"+test62.getDay());
        String dateString = test62.toString();
        System.out.println(dateString);

        Test61 test611 = new Test61();
        test611.setYear(1900);
        test611.setMonth(1);
        test611.setDay(1);
        test611.setSeconds(1);
        System.out.println(test611.toString());
    }
}
