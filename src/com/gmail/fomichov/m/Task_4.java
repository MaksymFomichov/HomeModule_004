package com.gmail.fomichov.m;

/*
аписать функцию getMax которая принимает на вход два аргумента в виде чисел. А возврыщает максимальное из этих двух.
Так же, необходимо перегрузить эту функцию для работы с разными числовыми типами переменных (int, float)
*/


public class Task_4 {

    public static void main(String[] args) {
        start();
    }

    public static void start(){
        System.out.println(getMax(5, 10));
        System.out.println(getMax(5.2, 10.5));
    }

    private static int getMax(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    private static double getMax(double a, double b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}
