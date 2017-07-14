package com.gmail.fomichov.m;

import java.util.Scanner;

/**
 * Решить задачу 1, без использования циклов. Использовав рекурсию.
 * (Написать функцию которая считает в консоли до числа Х. Аргументы функции: число Х Например Х = 5. Вывод программы: 1 2 3 4 5)
 */
public class Task_5 {
    public static void main(String[] args) {
        start();
    }

    public static void start(){
        System.out.println("Введите число:");
        readInt(checkInt());
    }

    private static void readInt(int i) {
        if (i > 0) {
            readInt(i - 1);
            System.out.print(i + " ");
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
