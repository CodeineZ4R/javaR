package com.javarush.task.task09.task0901;

/* 
Для получения StackTrace воспользуйся Thread.currentThread().getStackTrace().  StackTrace
*/

import java.util.Stack;

public class Solution {
    public static void main(String[] args) throws Exception {
        method1();
    }

    public static StackTraceElement[] method1() {
        method2();
        StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();
        return stackTraceElement;
    }

    public static StackTraceElement[] method2() {
        method3();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        return stackTraceElements;
    }

    public static StackTraceElement[] method3() {
        method4();
        StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();
        return stackTraceElement;
    }

    public static StackTraceElement[] method4() {
        method5();
        StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();
        return stackTraceElement;
    }

    public static StackTraceElement[] method5() {
        StackTraceElement[] stackThraceElement = Thread.currentThread().getStackTrace();
        return stackThraceElement;

    }
}
