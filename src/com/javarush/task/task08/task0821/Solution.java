package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("a", "aa");
        hashMap.put("a", "aaa");
        hashMap.put("aa", "aaa");
        hashMap.put("aaa", "aaaa");
        hashMap.put("aaaa", "aaaaa");
        hashMap.put("aaaaa", "aaaaaa");
        hashMap.put("aaaaaa", "aaaaaaa");
        hashMap.put("aaaaaaa", "aaaaaaaa");
        hashMap.put("aaaaaaaa", "aaaaaaaa");
        hashMap.put("aaaaaaa", "aaaaaaaa");

        return hashMap;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
