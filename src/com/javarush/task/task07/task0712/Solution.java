package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new
                InputStreamReader(System.in));
        ArrayList<String> arrayList = new ArrayList();
        int MaxStr = Integer.MIN_VALUE;
        int MinStr = Integer.MAX_VALUE;

        for (int i = 0; i < 10; i++) {
            arrayList.add(bufferedReader.readLine());
            if (arrayList.get(i).length() > MaxStr) {
                MaxStr = arrayList.get(i).length();
            }

            if (arrayList.get(i).length() < MinStr) {
                MinStr = arrayList.get(i).length();
            }
        }

        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).length() == MaxStr) {
                System.out.println(arrayList.get(i));
                break;
            } else if (arrayList.get(i).length() == MinStr) {
                System.out.println(arrayList.get(i));
                break;
            }

        }
    }
}
