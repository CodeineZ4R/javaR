package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        ArrayList<Human> childrens = new ArrayList<>();
        ArrayList<Human> childrens2 = new ArrayList<>();
        ArrayList<Human> childrens3 = new ArrayList<>();

        Human Igor =  new Human("Igor", true, 10);
        Human Ira = new Human("Ira", false, 11);
        Human Irma = new Human("Irma", false, 12);
        childrens.add(Igor);
        childrens.add(Ira);
        childrens.add(Irma);
        Human fRoma = new Human("Roma", true, 30, childrens);
        Human mLila = new Human("Lila", false, 30, childrens);
        childrens3.add(mLila);
        childrens2.add(fRoma);
        Human ffIgor = new Human("Igor", true, 60, childrens2);
        Human mfIrma = new Human("Irma", false, 60, childrens2);
        Human fmRoma = new Human("Roma", true, 60, childrens3);
        Human mmOlga = new Human("Olga", true, 60, childrens3);

        System.out.println(Igor);
        System.out.println(Ira);
        System.out.println(Irma);
        System.out.println(fRoma);
        System.out.println(mLila);
        System.out.println(ffIgor);
        System.out.println(mfIrma);
        System.out.println(fmRoma);
        System.out.println(mmOlga);


    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();


        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }


        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
