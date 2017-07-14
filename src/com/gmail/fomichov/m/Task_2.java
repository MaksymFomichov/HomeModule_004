package com.gmail.fomichov.m;

/*
 Написать функцию drawRectangle которая рисует в консоли прямоугольник из символов '+' Аргументы функции: ширина прямугольника в символах, высота прямоугольника в символах
 Например 3 на 2 Вывод программы:
  + +
  + +
  + +
 */

import java.util.Scanner;

public class Task_2 {

    public static void main(String[] args) {
        System.out.println("Введите ширину прямоугольника:");
        int width = checkInt();
        System.out.println("Введите высоту прямоугольника:");
        int height = checkInt();
        drawRectangle(width, height);
    }

    private static void drawRectangle(int width, int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("+");
            }
            System.out.println();
        }
    }

    // проверяем на целое число
    private static int checkInt() {
        Scanner sc = new Scanner(System.in);
        int value;
        while (true) {
            try {
                value = sc.nextInt();
                sc.nextLine();
                break;
            } catch (Exception e) {
                System.out.println("Только целое число!");
                sc.nextLine();
            }
        }
        return value;
    }
}
