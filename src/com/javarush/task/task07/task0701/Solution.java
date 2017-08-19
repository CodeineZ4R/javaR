package com.javarush.task.task07.task0701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Массивный максимум

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        Scanner scanner = new Scanner(System.in);
        int[] arrInt = new int[20];
        for (int i = 0; i < arrInt.length; i++) {
            arrInt[i] = scanner.nextInt();
        }
        return arrInt;
    }

    public static int max(int[] array) {
        int maxInt = array[0];
        for (int i = 1; i < array.length; i++) {
            if (maxInt < array[i]) {
                int tmp;
                tmp = maxInt;
                maxInt = array[i];
                array[i] = tmp;
            }
        }
        return maxInt;
    }
}
