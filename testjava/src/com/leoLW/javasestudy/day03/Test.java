package com.leoLW.javasestudy.day03;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] array = {3,2,2,1,4,3,11,6,5};
        int[] result = bubbleSort(array);
        System.out.println(Arrays.toString(result));
    }

    public static int[] bubbleSort(int[] arr) {
        if (arr.length == 0) {
            System.out.println("给定数组内无元素");
            return arr;
        }
        int minNum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i -1; j++) {
                if (arr[j] > arr[j+1]) {
                    minNum = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = minNum;
                }
            }
        }
        return arr;
    }
}
