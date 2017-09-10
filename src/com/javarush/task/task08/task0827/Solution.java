package com.javarush.task.task08.task0827;

import java.util.Date;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {

        Date date1 = new Date(date);
        int month = date1.getMonth();
        int yar = date1.getYear();
        int countDay = date1.getDate();
        boolean leapYear;

        if (yar % 4 == 0 && yar % 100 != 0 || yar % 400 == 0) {
            leapYear = true;
        } else {
            leapYear = false;
        }

        for (int i = 0; i < month; i++) {
            if (i == 1) {
                if (leapYear) {
                    countDay += 29;
                } else {
                    countDay += 28;
                }
            } else if (i % 2 == 0 || i == 0) {
                countDay += 31;
            } else {
                countDay += 30;
            }
        }

        if (countDay % 2 == 0) {
            return false;
        } else {
            return true;
        }
    }
}
