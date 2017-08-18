package com.javarush.task.task06.task0614;

import java.util.ArrayList;

/* 
Статические коты
1. В классе Cat
добавь public статическую переменную cats (ArrayList<Cat>).
2. Пусть при каждом создании кота (нового объекта Cat)
в переменную cats добавляется этот новый кот. Создать 10 объектов Cat.
3. Метод printCats должен выводить всех котов на экран.
Нужно использовать переменную cats.


Требования:
1. Добавь в класс Cat public статическую переменную cats (ArrayList).
2. Переменная cats должна быть проинициализирована.
3. Метод main должен создавать 10 объектов Cat.
4. Метод main должен добавить всех созданных котов в переменную cats.
5. Метод printCats должен выводить всех котов из
переменной cats на экран. Каждого с новой строки.
*/

public class Cat {
    public static ArrayList<Cat> cats = new ArrayList<Cat>();

    public Cat() {
        cats.add(this);
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Cat cat4 = new Cat();
        Cat cat5 = new Cat();
        Cat cat6 = new Cat();
        Cat cat7 = new Cat();
        Cat cat8 = new Cat();
        Cat cat9 = new Cat();
        Cat cat10 = new Cat();

        printCats();
    }

    public static void printCats() {
        for (Cat i : cats){
            System.out.println(i);
        }
    }
}
