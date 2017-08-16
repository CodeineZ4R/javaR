package com.javarush.task.task06.task0609;
import java.math.*;

/* 
Расстояние между двумя точками
*/

public class Util {

    public static double getDistance(int x1, int y1, int x2, int y2) {
        double rez = ((x2 - x1) ^ 2) + ((y2 - y1) ^ 2);
        return Math.sqrt( rez);
    }



    public static void main(String[] args) {

    }
}
