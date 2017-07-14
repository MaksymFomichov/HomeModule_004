package com.gmail.fomichov.m;

import java.util.Scanner;

/**
 * Написать программу, в которой выполнены все шесть предыдущих заданий. Каждое задание выполняется в отдельной функции.
 * В пределах этой же функции происходит ввод с консоли необходимых данных. Программа спрашивает пользователя какую задачу он хочет решить (от 1 до 6).
 * Затем программа вызывает соответствующую функцию для решения этой задачи. По окончанию решения задачи, программа спрашивает пользователя, хочет ли он продолжить решать задачи.
 * Если да - опять спрашивает какую задачу.
 */
public class Task_7 {
    public static void main(String[] args) {
        start();
    }

    private static void start() {
        System.out.println("Выбираем задачу от 1 до 6");
        switch (checkInt()) {
            case 1:
                Task_1 task_1 = new Task_1();
                task_1.start();
                break;
            case 2:
                Task_2 task_2 = new Task_2();
                task_2.start();
                break;
            case 3:
                Task_3 task_3 = new Task_3();
                task_3.start();
                break;
            case 4:
                Task_4 task_4 = new Task_4();
                task_4.start();
                break;
            case 5:
                Task_5 task_5 = new Task_5();
                task_5.start();
                break;
            case 6:
                Task_6 task_6 = new Task_6();
                task_6.start();
                break;
            default:
                System.out.println("Неверный выбор!");
                start();
        }
        endProgram();
    }

    private static void endProgram() {
        System.out.println("\n");
        System.out.println("Есть еще желание выбрать задачу - 1, нет - 2");
        switch (checkInt()) {
            case 1:
                start();
                break;
            case 2:
                System.exit(0);
                break;
            default:
                System.out.println("Неверный выбор!");
                endProgram();
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
