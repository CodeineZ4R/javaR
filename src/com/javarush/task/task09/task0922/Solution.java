package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(System.in));
        SimpleDateFormat simpleDateFormat =new SimpleDateFormat("MMM dd, yyyy");

        Date date = new Date(bufferedReader.readLine());
        System.out.println(simpleDateFormat.format(date).toUpperCase());


    }
}