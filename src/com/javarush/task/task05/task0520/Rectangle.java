package com.javarush.task.task05.task0520;

/* 
Cоздать класс прямоугольник (Rectangle)
Создать класс прямоугольник (Rectangle).
Его данными будут top, left, width, height
(верхняя координата, левая, ширина и высота).
Создать для него как можно больше методов конструкторов.

Примеры:
— заданы 4 параметра: left, top, width, height
— ширина/высота не задана (оба равны 0)
— высота не задана (равно ширине) создаём квадрат
— создаём копию другого прямоугольника (он и передаётся в параметрах)


Требования:
1. У класса Rectangle должны быть
переменные top, left, width и height с типом int.
2. У класса должен быть хотя бы один конструктор.
3. У класса должно быть хотя бы два конструктора.
4. У класса должно быть хотя бы три конструктора.
5. У класса должно быть хотя бы четыре конструктора.
*/


public class Rectangle {
    int top, left, width, height;

    public Rectangle(int top) {
        this.top = top;
        this.height = top;
        this.left = top;
        this.width = top;

    }

    public Rectangle(int top, int height) {
        this.top = top;
        this.height = height;
        this.left = height;
        this.width = top;
    }

    public Rectangle(int top, int height, int left) {
        this.top = top;
        this.height = height;
        this.left = left;
        this.width = top;
    }

    public Rectangle(int top, int height, int left, int width) {
        this.top = top;
        this.height = height;
        this.left = left;
        this.width = width;
    }

    public static void main(String[] args) {

    }
}