package com.javarush.task.task07.task0705;


import java.util.Scanner;

public class Solution {

    public static void main(String[] args) throws Exception {
        int arrIntBig[] = new int[20];
        int arrIntLit1[] = new int[10];
        int arrIntLit2[] = new int[10];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < arrIntBig.length; i++) {
            arrIntBig[i] = scanner.nextInt();
        }

        for (int i = 0; i < (arrIntBig.length / 2); i++) {
            arrIntLit1[i] = arrIntBig[i];
            arrIntLit2[i] = arrIntBig[arrIntLit1.length + i];
        }

        for (int i : arrIntLit2) {
            System.out.println(i);
        }
    }
}
