package com.leoLW.javasestudy.day04.logic;

public class Demo01 {
    public static void main(String[] args) {
        int a = 20;
        //逻辑或 |   只有两个都不成立，结果才不成立
        System.out.println(a > 10 | a < 10); //true

        //逻辑与 &  只有两个条件都成立，结果才成立
        System.out.println(a > 10 & a < 15); //false
        System.out.println(a > 10 & a < 30); //true

        // ! 非
        System.out.println(!true); //false
        System.out.println(!!true); //true --!可以相互抵消

        // ^ 异或 两个条件的结果一样，结果就是false
        System.out.println(false ^ false); //false
        System.out.println(false ^ true); //true
        System.out.println(true ^ true); //false


        //短路或 || 只有两个条件都不成立，结果才不成立。当第一个条件成立时，第二个条件不执行

        //短路与 && 只有两个条件都成立，结果才成立。当第一条件不成立时，第二个条件不执行
    }
}
