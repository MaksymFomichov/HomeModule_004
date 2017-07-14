package com.gmail.fomichov.m;

/*
 Написать функцию которая считает в консоли до числа Х. Аргументы функции: число Х Например Х = 5. Вывод программы: 1 2 3 4 5
 */

import java.util.Scanner;

public class Task_1 {

    public static void main(String[] args) {
        System.out.println("Введите число:");
        readInt(checkInt());
    }

    private static void readInt(int i) {
        for (int j = 1; j <= i; j++) {
            System.out.print(i - (i - j) + " ");
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
