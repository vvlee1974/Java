package ru.geekbrains.lesson2.HomeWork;

import java.util.Scanner;

public class HW202 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество чисел последовательности: ");
        int n = scanner.nextInt();
        System.out.println("increasingSequence(n, scanner) = " + increasingSequence(n, scanner));

        scanner.close();
    }

    /**
     * @apiNote Дана последовательность из N целых чисел. Верно ли, что последовательность является возрастающей.
     * @param n количество чисел в последовательности
     * @param scanner ввод чисел последовательности
     * @return true, если последовательность возрастающая
     */

    private static boolean increasingSequence(int n, Scanner scanner) {
        int a = 0;
        if (n <= 4) {
            System.out.println("Введите " + n + " числа: ");
        } else
            System.out.println("Введите " + n + " чисел: ");

        for (int i = 0; i < n; i++) {
            int b = scanner.nextInt();
            if (b < a) return false;
            if (b > a){
                a = b;
            }
        }
        return true;
    }
}
