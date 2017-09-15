package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        ArrayList<Character> arrayListGlas = new ArrayList<>();
        ArrayList<Character> arrayListSogl = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(System.in));
        String string = bufferedReader.readLine();
        char[] chars = string.toCharArray();

        for (Character c : chars) {
            if (isVowel(c)) {
                arrayListGlas.add(c);
            }else if (c != ' ') {
                arrayListSogl.add(c);
            }
        }

        for (Character c : arrayListGlas ) {
            System.out.print(c + " ");
        }

        System.out.println();

        for (Character c : arrayListSogl) {
            System.out.print(c + " ");
        }

    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}