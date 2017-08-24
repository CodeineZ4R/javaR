package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("aaaaa");
        arrayList.add("aaaaaaaa");
        arrayList.add("rrrrr");
        arrayList.add("uuuuu");
        arrayList.add("tttttt");
        System.out.println(arrayList.size());
        for (String s : arrayList) {
            System.out.println(s);
        }
    }
}
