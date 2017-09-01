package com.javarush.task.task08.task0816;

import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    private static int numManth;
    private static String stringTmp = new String();
    private static Date dateTmp = new Date();
    private static LinkedList<String> linkedList =
            new LinkedList<>();

    public static HashMap<String, Date> createMap() {

        HashMap<String, Date> map = new HashMap<String, Date>();

        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Stallone1", new Date("JUNE 1 1980"));
        map.put("Stallone2", new Date("JUNE 1 1980"));
        map.put("Stallone3", new Date("JUNE 1 1980"));
        map.put("Stallone4", new Date("JUNE 1 1980"));
        map.put("Stallone5", new Date("JUNE 1 1980"));
        map.put("Stallone6", new Date("JUNE 1 1980"));
        map.put("Stallone7", new Date("JUNE 1 1980"));
        map.put("Stallone8", new Date("JUNE 1 1980"));
        map.put("Stallone9", new Date("JUNE 1 1980"));

        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        for (Map.Entry entry : map.entrySet()) {
            dateTmp = (Date) entry.getValue();
            stringTmp = (String) entry.getKey();
            if (dateTmp.getMonth() >= 5 && dateTmp.getMonth() <= 7) {
                linkedList.add(stringTmp);
            }
        }

        for (String s : linkedList) {
            map.remove(s);
        }
    }

    public static void main(String[] args) {

    }
}
