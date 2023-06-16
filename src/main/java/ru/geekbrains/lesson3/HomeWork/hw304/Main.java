package ru.geekbrains.lesson3.HomeWork.hw304;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество элементов  массива': ");
        int n = scanner.nextInt();
        Random random = new Random();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(20);
        }
        System.out.println("Рандомный  массив = " + Arrays.toString(array));
        System.out.println("Минимальное значение = " + getMin(array));
        System.out.println("Максимальное значение = " + getMax(array));
        System.out.println("Среднее арифметическое = " + getAverage(array));
    }

    /**
     * @param array входящий массив
     * @return минимальное значение
     */
    private static int getMin(int[] array) {
        int min = array[0];
        for (int i : array) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

    /**
     * @param array входящий массив
     * @return максимальное значение
     */
    private static int getMax(int[] array) {
        int max = array[0];
        for (int i : array) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    /**
     * @param array входящий массив
     * @return  среднее арифметическое с округлением
     */
    private static BigDecimal getAverage(int[] array) {

        double average;
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        MathContext context = new MathContext(3,  RoundingMode.HALF_UP);
        average = (double) sum / array.length;
        return new BigDecimal(average, context);
    }
}
