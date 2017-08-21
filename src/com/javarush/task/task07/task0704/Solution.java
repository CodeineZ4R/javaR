package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {

        int[] arrInt = new int[10];
        BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(System.in));

        for (int i = 0; i < arrInt.length; i++) {
            arrInt[i] = Integer.parseInt(bufferedReader.readLine());
        }

        for (int i = 0; i < (arrInt.length /2); i++) {
            int tmp;
            tmp = arrInt[i];
            arrInt[i] = arrInt[(arrInt.length-1) - i];
            arrInt[(arrInt.length-1) - i] = tmp;
        }

        for (int i = 0; i < arrInt.length; i++) {
            System.out.println(arrInt[i]);
        }
    }
}
