package com.javarush.task.task08.task0818;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            hashMap.put("q" + i, 495 + i );
        }
        return hashMap;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        ArrayList<String> nameRm = new ArrayList<>();
        Integer intValue ;
        for (Map.Entry<String, Integer> ent : map.entrySet()) {
            intValue = ent.getValue();
            if ( intValue < 500 ) {
                nameRm.add(ent.getKey());
            }
        }
        for (String s : nameRm) {
            map.remove(s);
        }
    }

    public static void main(String[] args) {

    }
}