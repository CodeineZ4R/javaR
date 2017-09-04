package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        ArrayList<String> arrayListLeter = new ArrayList<>();
        String tmpStr;
        String strUper = "";

        for (String strWord : s.split(" ")) {
            for (String strLetter : strWord.split("")) {
                arrayListLeter.add(strLetter);
            }
            tmpStr = arrayListLeter.get(0);
            arrayListLeter.add(0 ,tmpStr.toUpperCase());
            arrayListLeter.remove(1);
            for (String str : arrayListLeter) {
                strUper += str;
            }
            arrayListLeter.clear();
            strUper += " ";
        }
        System.out.println(strUper);

    }
}
