package ru.geekbrains.lesson1.HomeWork;

import java.util.Scanner;

public class HW2 {

    public static void main(String[] args) {
        System.out.println("Введите последовательсность чисел, заканчивающуюся нулём: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        System.out.println("getSum(a) = " + getSum(a));
        scanner.close();
    }

    /**
     * @param a
     * @return sum
     * @apiNote
     */
    private static int getSum(int a) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        while (a != 0) {
            int b = scanner.nextInt();
            if (a > 0 && b < 0) sum += a;
            a = b;
        }
        scanner.close();
        return sum;
    }
}
