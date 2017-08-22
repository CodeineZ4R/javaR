package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] numHouse = new int[15];
        int sumEven = 0;
        int sumOdd = 0;
        BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(System.in));

        for (int i = 0; i < numHouse.length; i++) {
            numHouse[i] = Integer.parseInt(bufferedReader.readLine());
            if (i == 0 || i % 2 == 0) {
                sumEven += numHouse[i];
            } else {
                sumOdd += numHouse[i];
            }
        }

        if (sumEven < sumOdd) {
            System.out.println("В домах с " +
                    "нечетными номерами проживает больше жителей.");
        } else {
            System.out.println("В домах с " +
                    "четными номерами проживает больше жителей.");
        }

    }
}
