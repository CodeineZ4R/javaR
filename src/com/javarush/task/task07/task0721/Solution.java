package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;
        int[] massInt = new int[20];
        for (int i = 0; i < massInt.length; i++) {
            massInt[i] = Integer.parseInt(reader.readLine());
        }

        for (int num : massInt) {
            if (maximum < num) {
                maximum = num;
            }
            if (minimum > num) {
                minimum = num;
            }

        }
        System.out.printf("%d %d", maximum, minimum);
        //System.out.println(minimum);
    }
}
