package com.leoLW.javasestudy.day06.for_if;

public class Demo08 {
    public static void main(String[] args) {

        //打印素数
        int count = 0;
        for (int i = 2;i <= 100; i ++) {
            boolean flag = true; //假设2~100的每个数字都是素数
            for (int j = 2; j <= i-1; j++) { //循环除以比自身小的数字
                if (i % j == 0) { //取余为0则表示不是素数
                    flag = false; //false表示不是素数
                    break;
                }
            }
            if (flag) {
                System.out.print(i + "\t");
                count++;
                if (count % 5 == 0) { //每行输出5个 -- 此if不可以放在if外，否则不是素数的循环也会换行
                    System.out.println();
                }
            }
        }
    }
}
