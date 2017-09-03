package com.javarush.task.task08.task0819;

import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* 
Set из котов
*/

public class Solution {


    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Cat cat1 = new Cat();
        cats.remove(cat1);

        printCats(cats);
    }

    public static class Cat {

    }

    public static Set<Cat> createCats() {
        HashSet<Cat>  setCat = new HashSet<>();
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        setCat.add(cat1);
        setCat.add(cat2);
        setCat.add(cat3);

        return setCat;
    }

    public static void printCats(Set<Cat> cats) {
        for (Cat cat : cats) {
            System.out.println(cat);
        }
    }

    // step 1 - пункт 1
}
