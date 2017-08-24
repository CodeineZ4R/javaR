package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(System.in));
        ArrayList<String> arrayList = new ArrayList<>();
        int minStr = Integer.MAX_VALUE;

        for (int i = 0; i < 5; i++) {
            arrayList.add(bufferedReader.readLine());
            if (minStr > arrayList.get(i).length()) {
                minStr = arrayList.get(i).length();
            }
        }

        for (String s : arrayList) {
            if (s.length() == minStr) {
                System.out.println(s);
            }
        }
    }
}
