package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(System.in));
        int[] arrNum = new int[10];
        int sumElement = 1;
        ArrayList<Integer> arrListSum = new ArrayList<>();
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arrNum.length; i++) {
            arrNum[i] = Integer.parseInt(bufferedReader.readLine());
        }

        for (int i = 1; i < arrNum.length; i++) {
            if (arrNum[i - 1] == arrNum[i]) {
                ++sumElement;
            } else {
                arrListSum.add(sumElement);
                sumElement = 1;
            }
        }

        arrListSum.add(sumElement);

        for (Integer num : arrListSum) {
            if (max < num) {
                max = num;
            }
        }

        System.out.println(max);

    }
}