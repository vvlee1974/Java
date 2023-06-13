package ru.geekbrains.lesson2.HomeWork;

import java.util.Scanner;

public class HW201 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество чисел последовательности: ");
        int n = scanner.nextInt();
        if (n < 0){
            System.out.println("Введённое число не соответствует уловию задачи. Повторите ввод!");
            System.exit(1);
        }
        System.out.println("getSumNumbers(a, scanner) = " + getSumNumbers(n, scanner));
        scanner.close();
    }

    /**
     * @apiNote Дана последовательность N целых чисел. Найти сумму простых чисел.
     * @param n количество чисел для последовательности
     * @param scanner ввод натуральных чисел
     * @return сумма простых чисел введённой последовательности
     */

    private static int getSumNumbers(int n, Scanner scanner) {
        int sum = 0;
        if (n <= 4) {
            System.out.println("Введите " + n + " числа: ");
        } else
            System.out.println("Введите " + n + " чисел: ");

        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            if (a < 0){
                System.out.println("Введённое число не соответствует уловию задачи. Повторите ввод!");
                System.exit(1);
            }
            if (isPrime(a)) {
                sum += a;
            }
        }
        scanner.close();
        return sum;
    }

    /**
     * @apiNote Проверка на принадлежность введённого числа к простым числам
     * @param a введённое число
     * @return true, если число простое
     */

    private static boolean isPrime(int a) {
        int count = 0;

        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                count++;
            }
        }
        if (a == 1 || count > 2) {
            return false;
        }
        return true;
    }
}
