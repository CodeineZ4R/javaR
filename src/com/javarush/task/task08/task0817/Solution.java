package com.javarush.task.task08.task0817;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> hashMap = new HashMap<>();

        hashMap.put("a", "aa");
        hashMap.put("aa", "aa");
        hashMap.put("aaa", "aa");
        hashMap.put("aaaa", "aa");
        hashMap.put("aaaaa", "aa");
        hashMap.put("aaaaaa", "aa");
        hashMap.put("aaaaaaa", "aa");
        hashMap.put("aaaaaaaa", "aa");
        hashMap.put("aaaaaaaaa", "aa");
        hashMap.put("aaaaaaaaaa", "aa");

        return hashMap;

    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        HashSet<String> hashSet = new HashSet<>();
        ArrayList<String> arrayList = new ArrayList<>();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String strValue = entry.getValue();
            if (hashSet.contains(strValue)) {
                arrayList.add(strValue);
            } else {
                hashSet.add(strValue);
            }
        }
        for (String s : arrayList) {
            removeItemFromMapByValue(map, s);
        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}
