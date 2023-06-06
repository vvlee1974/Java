package ru.geekbrains.lesson1.HomeWork;

import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
        //int[] array = {1, 2, 1, 2, -1, 1, 3, 1, 3, -1, 0};
        //getArray(String str);
        System.out.println("Введите через пробел числа, последняя цифра должна быть 0: ");
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        scanner.close();

        getArray(str);

        if (getArray(str)[getArray(str).length - 1] != 0) {
            System.out.println("Ошибка ввода. Строка должна заканчиваться цифрой 0");
        } else if (getArray(str)[getArray(str).length - 1] == 0) {
            System.out.println("getSum(array) = " + getSum(getArray(str)));
        }
    }

    /**
     * @param array
     * @return sum
     * @apiNote Дана последовательность целых чисел, оканчивающаяся нулем. Найти сумму положительных чисел,
     * после которых следует отрицательное число.
     */

    private static int getSum(int[] array) {
        int sum = 0;
        int a = 0;
        int b = 0;
        for (int i = 0; i < array.length; i++) {
            a = array[i];
            if (a > 0) b = a;
            if (a < 0) sum += b;
        }
        return sum;
    }

    private static int[] getArray(String str) {
        String s = str.trim().replaceAll("\\s+", " ");

        String[] arr = s.split(" ");

        int[] array = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            try {
                array[i] = Integer.parseInt(arr[i]);
            } catch (NumberFormatException nfe) {
                System.out.println("Ошибка ввода. Введены не числа.");
                break;
            }
        }
        return array;
    }
}
