package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] arrStr = new String[10];
        int[] arrInt = new int[10];
        BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++){
            arrStr[i] = bufferedReader.readLine();
        }
        for (int k = 0; k < arrInt.length; k++){
            arrInt[k] = arrStr[k].length();
        }

        for (int g = 0; g < arrInt.length; g++){
            System.out.println(arrInt[g]);
        }
    }
}
