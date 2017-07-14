package com.gmail.fomichov.m;

/**
 * Решить задачу 2, без использования циклов. Использовав рекурсию.
 * (Написать функцию drawRectangle которая рисует в консоли прямоугольник из символов '+'
 * Аргументы функции: ширина прямугольника в символах, высота прямоугольника в символах
 * Например 3 на 2 Вывод программы:
 * + + +
 * + + +)
 */
public class Task_6 {
    public static void main(String[] args) {
        start();
    }

    public static void start() {
        drawRectangle(3, 2);
    }

    private static void drawRectangle(int width, int height) {
        if (width > 0) {
            drawRectangle(width - 1, height);
            System.out.print("+ ");
        }
        if (height > 0) {
            drawRectangle(width, height - 1);
            System.out.println();
        }


    }
}
