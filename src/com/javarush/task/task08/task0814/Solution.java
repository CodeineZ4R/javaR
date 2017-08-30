package com.javarush.task.task08.task0814;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static HashSet<Integer> createSet() {

        HashSet<Integer> hashSet = new HashSet<>();

        for (int i = 0; i < 20; i++) {
            hashSet.add(i);
        }

        return hashSet;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set) {

        ArrayList<Integer> rmArray = new ArrayList<>();

        for (Integer integer : set) {
            if (integer > 10) {
                rmArray.add(integer);
            }
        }

        set.removeAll(rmArray);
        return set;
    }

    public static void main(String[] args) {

    }
}
