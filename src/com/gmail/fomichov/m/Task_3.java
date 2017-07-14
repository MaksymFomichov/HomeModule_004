package com.gmail.fomichov.m;

/*
Перегрузить функцию drawRectangle (задание 2) таким образом, что бы она могла принимать на вход только 1 параметр (ширина квадрата) и рисовать квадрат с равными сторонами
Например 2
Вывод программы:
 + +
 + +
 Например 3
 Вывод программы:
 + + +
 + + +
 + + +
 */

import java.util.Scanner;

public class Task_3 {

    public static void main(String[] args) {
        start();
    }

    public static void start() {
        System.out.println("Рисуем квадрат - 1, рисуем прямоугольник - 2");
        switch (checkInt()) {
            case 1:
                System.out.println("Введите сторону квадрата:");
                int side = checkInt();
                drawRectangle(side);
                break;
            case 2:
                System.out.println("Введите ширину прямоугольника:");
                int width = checkInt();
                System.out.println("Введите высоту прямоугольника:");
                int height = checkInt();
                drawRectangle(width, height);
                break;
            default:
                System.out.println("Неверный выбор, повторите попытку");
                start();
                break;
        }
    }

    private static void drawRectangle(int side) {
        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
                System.out.print("+ ");
            }
            System.out.println();
        }
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
