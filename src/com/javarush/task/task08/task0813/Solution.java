package com.javarush.task.task08.task0813;

import java.util.HashSet;

/* 
20 слов на букву «Л»
*/

public class Solution {
    public static HashSet<String> createSet() {
        HashSet<String> set = new HashSet<>();
        String string = "Л";
        for (int i = 0; i < 20; i++) {
            string = string + "Л";
            set.add(string);
        }
        return set;
    }

    public static void main(String[] args) {

    }
}
