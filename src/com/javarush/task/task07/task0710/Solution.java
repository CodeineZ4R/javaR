package com.javarush.task.task07.task0710;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
В начало списка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new
                InputStreamReader(System.in));
        ArrayList<String> arr = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            arr.add(0, bufferedReader.readLine());

        }
        for ( String s : arr){
            System.out.println(s);
        }

    }
}
