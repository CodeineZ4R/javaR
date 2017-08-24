package com.javarush.task.task07.task0715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("мама");
        arrayList.add("мыла");
        arrayList.add("раму");

        for (int i = 0; i < 6; i++) {
            if ((i % 2 == 0) || (i == 0)) {
                continue;
            } else {
                arrayList.add(i, "именно");
            }
        }

        for (String s : arrayList) {
            System.out.println(s);
        }

    }
}
