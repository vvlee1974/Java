package ru.geekbrains.lesson1.ClassWork;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество чисел: ");
        int n = scanner.nextInt();
        System.out.println("zadanie2(n, scanner) = " + zadanie2(n, scanner));
        scanner.close();
    }

    /**
     * @apiNote Дана последовательность N целых чисел. Найти количество положительных чисел, после которых следует
     * отрицательное число.
     * @param n int
     * @param scanner scanner
     * @return count

     */

    private static int zadanie2(int n, Scanner scanner) {
        System.out.println("Введите " + n + " чисел");
        int count = 0;
        int a = 0, b = 0;
        a = scanner.nextInt();

        for (int i = 0; i < n - 1; i++) {
            b = scanner.nextInt();

            if (a > 0 && b < 0) count++;

            a = b;
        }
        scanner.close();
        return count;
    }
}
