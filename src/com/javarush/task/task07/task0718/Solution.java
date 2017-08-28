package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(System.in));
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayList.add(bufferedReader.readLine());

        }
        int lenStr = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).length() < lenStr) {
                System.out.println(i);
                break;
            } else {
                lenStr = arrayList.get(i).length();
            }
        }
    }
}