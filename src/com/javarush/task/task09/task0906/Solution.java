package com.javarush.task.task09.task0906;

/* 
Логирование стек трейса
*/

public class Solution {
    public static void main(String[] args) {
        log("In main method");
    }

    public static void log(String s) {
        StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();

        String nameMeth ;
        String nameClass;
        nameMeth = stackTraceElement[2].getMethodName();
        nameClass = stackTraceElement[2].getClassName();
        System.out.printf("%s: %s: %s", nameClass, nameMeth, s);

    }
}
