package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {

        HashMap<String, String> hashMap = new HashMap<>();

        hashMap.put("a", "aa");
        hashMap.put("b", "bb");
        hashMap.put("c", "cc");
        hashMap.put("d", "dd");
        hashMap.put("e", "ee");
        hashMap.put("f", "ff");
        hashMap.put("g", "gg");
        hashMap.put("h", "hh");
        hashMap.put("i", "ii");
        hashMap.put("aa", "aaa");

        return hashMap;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        int countDuplicat = 0;

        for (Map.Entry entry : map.entrySet()) {
            if (entry.getValue().equals(name)) {
                countDuplicat++;
            }
        }

        return countDuplicat;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {

        map.put(lastName, null);

        return 11 - map.size();
    }

    public static void main(String[] args) {

    }
}
