package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
Ввести с клавиатуры число. Определить, сколько в введенном
числе четных цифр, а сколько нечетных.
Если число делится без остатка на 2 (т. е. остаток равен нулю),
значит оно четное.
Увеличиваем на 1 счетчик четных цифр (статическая переменная even).
Иначе число нечетное, увеличиваем счетчик нечетных цифр
(статическая переменная odd).
Вывести на экран сообщение: «Even: а Odd: b», где а — количество
четных цифр, b — количество нечетных цифр.

Пример для числа 4445:
Even: 3 Odd: 1


Требования:
1. Программа должна считывать данные с клавиатуры.
2. Метод main должен посчитать сколько четных цифр во веденном
числе и записать это количество в переменную even.
3. Метод main должен посчитать сколько нечетных цифр во
веденном числе и записать это количество в переменную odd.
4. Программа должна выводить текст на экран.
5. Выведенный текст должен соответствовать заданию.
*/
import java.util.Scanner;

public class Solution {

    public static int even = 0;
    public static int odd = 0;
    public static String string;
    private static char tmp;
    private static int tmpNum;

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        string = scanner.next();
        for (int i = 0; i < string.length(); i++) {
            tmp = string.charAt(i);
            if (Character.isDigit(tmp)) {
                tmpNum = tmp;
                if (tmpNum % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }
        }
        System.out.printf("Even: %d Odd: %d", even, odd);
    }
}
