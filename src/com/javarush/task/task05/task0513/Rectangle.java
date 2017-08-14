package com.javarush.task.task05.task0513;

/* 
Создать класс прямоугольник (Rectangle). Его данными будут
top, left, width, height (верхняя координата, левая, ширина и высота).
Создать для него как можно больше методов initialize(…)

Примеры:
— заданы 4 параметра: left, top, width, height
— ширина/высота не задана (оба равны 0)
— высота не задана (равно ширине) создаём квадрат
— создаём копию другого прямоугольника (он и передаётся в параметрах)


Требования:
1. Программа не должна считывать данные с клавиатуры.
2. У класса Rectangle должны быть переменные top, left, width и height с типом int.
3. У класса должен быть хотя бы один метод initialize.
4. У класса должно быть хотя бы два метода initialize.
5. У класса должно быть хотя бы три метода initialize.
6. У класса должно быть хотя бы четыре метода initialize.
*/

public class Rectangle {
    int left;
    int top;
    int width;
    int height;

    public void initialize(int top) {
        this.left = top;
        this.top = top;
        this.width = top;
        this.height = top;

    }

    public void initialize(int top, int left) {
        this.top = top;
        this.width = top;
        this.left = left;
        this.height = left;

    }

    public void initialize(int top, int left, int width) {
        this.width = width;
        this.height = left;
        this.top = top;
        this.left = left;
    }

    public void initialize(int top, int left, int width, int height) {
        this.width = width;
        this.height = height;
        this.top = top;
        this.left = left;
    }

    public static void main(String[] args) {

    }
}
