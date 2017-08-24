package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new
                InputStreamReader(System.in));
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> arrDiv3 = new ArrayList<>();
        ArrayList<Integer> arrDiv2 = new ArrayList<>();
        ArrayList<Integer> arrDivNot = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            arrayList.add(Integer.parseInt(br.readLine()));
        }

        for (Integer numBR : arrayList) {
            if (numBR % 3 == 0) {
                arrDiv3.add(numBR);
            }
            if (numBR % 2 == 0) {
                arrDiv2.add(numBR);
            }
            if (!(numBR % 3 == 0) && !(numBR % 2 == 0)) {
                arrDivNot.add(numBR);
            }
        }
        printList(arrDiv3);
        printList(arrDiv2);
        printList(arrDivNot);
    }

    public static void printList(List<Integer> list) {
        for (Integer num : list) {
            System.out.println(num);
        }
    }
}
