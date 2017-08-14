package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля:
name (String), age (int), address (String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными
используя конструктор.
5. Объекты выведи на экран в
таком формате «name + » » + age + » « + address».


Требования:
1. В классе Solution создай public static класс Man.
2. В классе Solution создай public static класс Woman.
3. Класс Man должен содержать переменные: name(String), age(int) и address(String).
4. Класс Woman должен содержать переменные: name(String), age(int) и address(String).
5. У классов Man и Woman должны быть конструкторы,
принимающие параметры с типами String, int и String.
6. Конструкторы должны инициализировать переменные класса.
7. В методе main необходимо создать по два объекта каждого типа.
8. Метод main должен выводить созданные объекты на экран
в указанном формате.
*/

public class Solution {
    public static void main(String[] args) {
        Man man = new Man("den", 33, "str");
        System.out.println(man);
        Man man2 = new Man("den", 33, "str");
        System.out.println(man2);
        Woman woman = new Woman("Lolka", 22, "str");
        System.out.println(woman);
        Woman woman2 = new Woman("Lolka", 22, "str");
        System.out.println(woman2);


    }

    public static class Man {
        String name;
        int age;
        String address;

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String toString() {
            String s;
            s = String.format(name + " " + age + " " + address + " ");
            return s;

        }
    }

    public static class Woman {
        String name;
        int age;
        String address;

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String toString() {
            String s;
            s = String.format(name + " " + age + " " + address + " ");
            return s;
        }
    }
}
