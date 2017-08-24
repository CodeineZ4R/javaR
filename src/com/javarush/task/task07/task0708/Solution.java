package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самая длинная строка
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(System.in));
        ArrayList<String> arrayList = new ArrayList<>();
        ArrayList<String> arrayListBig = new ArrayList<>();
        int maxLenStr = 0;

        for (int i = 0; i < 5; i++) {
            arrayList.add(bufferedReader.readLine());
            if (maxLenStr < arrayList.get(i).length()) {
                maxLenStr = arrayList.get(i).length();
            }
        }

        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).length() == maxLenStr) {
                System.out.println(arrayList.get(i));
            }
        }


    }
}
