package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {

        Human dKolia = new Human("Kolia", true, 60);
        Human dVania = new Human("Vania", false, 60);
        Human bOlia = new Human("Olia", false, 60);
        Human bLuba = new Human("Luba", false, 60);
        Human otTolik = new Human("Tolik", true, 30, dKolia, bOlia);
        Human matLena = new Human("Lena", false, 30, dVania, bLuba);
        Human detiIgor = new Human("Igor", true, 10, otTolik, matLena);
        Human detiLera = new Human("lera", false, 11, otTolik, matLena);
        Human detiDanila = new Human("Danila", true, 12, otTolik, matLena);

        System.out.println(dKolia);
        System.out.println(dVania);
        System.out.println(bLuba);
        System.out.println(bOlia);
        System.out.println(otTolik);
        System.out.println(matLena);
        System.out.println(detiDanila);
        System.out.println(detiIgor);
        System.out.println(detiLera);

    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }

        public Human(String name, boolean sex, int age,
                     Human father, Human mother) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















